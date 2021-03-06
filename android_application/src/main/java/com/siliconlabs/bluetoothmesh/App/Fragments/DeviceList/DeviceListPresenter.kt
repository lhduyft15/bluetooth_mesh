/*
 * Copyright © 2019 Silicon Labs, http://www.silabs.com. All rights reserved.
 */

package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList

import android.bluetooth.BluetoothAdapter
import android.bluetooth.le.BluetoothLeScanner
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.os.CountDownTimer
import android.util.Log
import com.siliconlab.bluetoothmesh.adk.ErrorType
import com.siliconlabs.bluetoothmesh.App.AESUtils
import com.siliconlabs.bluetoothmesh.App.BasePresenter
import com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic
import com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionListener
import com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic
import com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode
import com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality
import com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl
import com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager
import com.siliconlabs.bluetoothmesh.App.statusOfNode
import kotlin.collections.ArrayList


/**
 * @author Comarch S.A.
 */
const val SCAN_PERIOD: Long = 10000
class DeviceListPresenter(private val deviceListView: DeviceListView, val meshLogic: MeshLogic, val networkConnectionLogic: NetworkConnectionLogic, val meshNodeManager: MeshNodeManager) : BasePresenter, DeviceListAdapter.DeviceItemListener,MeshElementControl.GetOnOffCallback,MeshElementControl.SetCallback, NetworkConnectionListener {

    private val TAG: String = javaClass.canonicalName

    private val networkInfo = meshLogic.currentSubnet!!

    private var deviceList: Set<MeshNode> = emptySet()

    private var startedConfiguration = false

    var statusOfNodes : ArrayList<statusOfNode> = ArrayList()

    override fun onResume() {
        Log.d(TAG, "onResume")
        refreshList()
        networkConnectionLogic.addListener(this)
        if (meshLogic.deviceToConfigure != null && !startedConfiguration) {
            startedConfiguration = true
            deviceListView.showLoadingDialog()
            deviceListView.updateLoadingDialogMessage(DeviceListView.LOADING_DIALOG_MESSAGE.CONFIG_CONNECTING)
        }
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        stopScanBle()
    }

    fun refreshList() {
        deviceList = meshNodeManager.getMeshNodes(networkInfo)
        deviceListView.setDevicesList(deviceList)
    }

    override fun onClickDeviceImageListener(deviceInfo: MeshNode) {
        if (deviceInfo.node.groups.isEmpty()) {
            return
        }

        val nodeElementControl = MeshElementControl(deviceInfo.node.elements[0], deviceInfo.node.groups.iterator().next())

        when (deviceInfo.functionality) {
            DeviceFunctionality.FUNCTIONALITY.OnOff -> {
                val newOnOffState = !deviceInfo.onOffState

                nodeElementControl.setOnOff(newOnOffState, this)
                deviceInfo.onOffState = newOnOffState

            }
            DeviceFunctionality.FUNCTIONALITY.Level -> {
                var newLevelPercentage = 100
                if (deviceInfo.levelPercentage > 0) {
                    newLevelPercentage = 0
                }

                nodeElementControl.setLevel(newLevelPercentage, this)
                deviceInfo.levelPercentage = newLevelPercentage
            }
            DeviceFunctionality.FUNCTIONALITY.Lightness -> {
                var newLightnessPercentage = 100
                if (deviceInfo.lightnessPercentage > 0) {
                    newLightnessPercentage = 0
                }

                nodeElementControl.setLightness(newLightnessPercentage, this)
                deviceInfo.lightnessPercentage = newLightnessPercentage
            }
            DeviceFunctionality.FUNCTIONALITY.CTL -> {
                var newLightnessPercentage = 100
                if (deviceInfo.lightnessPercentage > 0) {
                    newLightnessPercentage = 0
                }

                nodeElementControl.setColorTemperature(newLightnessPercentage, deviceInfo.temperaturePercentage, deviceInfo.deltaUvPercentage, this)
                deviceInfo.lightnessPercentage = newLightnessPercentage
            }
        }

        deviceListView.notifyDataSetChanged()
    }

    override fun onDeleteClickListener(deviceInfo: List<MeshNode>) {
        deviceListView.showDeleteDeviceDialog(deviceInfo)
    }

    override fun onSeekBarChangeListener(deviceInfo: MeshNode, levelPercentage: Int, temperaturePercentage: Int?, deltaUvPercentage: Int?) {
        val nodeElementControl = MeshElementControl(deviceInfo.node.elements[0], deviceInfo.node.groups.iterator().next())

        when (deviceInfo.functionality) {
            DeviceFunctionality.FUNCTIONALITY.Level -> {
                nodeElementControl.setLevel(levelPercentage, this)

                deviceInfo.levelPercentage = levelPercentage
            }
            DeviceFunctionality.FUNCTIONALITY.Lightness -> {
                nodeElementControl.setLightness(levelPercentage, this)

                deviceInfo.lightnessPercentage = levelPercentage
            }
            DeviceFunctionality.FUNCTIONALITY.CTL -> {
                if (temperaturePercentage != null && deltaUvPercentage != null) {
                    nodeElementControl.setColorTemperature(levelPercentage, temperaturePercentage, deltaUvPercentage, this)

                    deviceInfo.lightnessPercentage = levelPercentage
                    deviceInfo.temperaturePercentage = temperaturePercentage
                    deviceInfo.deltaUvPercentage = deltaUvPercentage
                }
            }
        }

        deviceListView.notifyDataSetChanged()
    }

    override fun onConfigClickListener(deviceInfo: MeshNode) {
        deviceListView.showDeviceConfigDialog(deviceInfo)
    }

    fun startConfigDevice(deviceInfo: MeshNode) {
        deviceListView.startConfigDevice(deviceInfo)
    }

    // mesh element control callback

    override fun success(on: Boolean){
    }

    override fun error(error: ErrorType) {
        deviceListView.showErrorToast(error)

    }
    // network connection callback

    override fun connecting() {
        deviceListView.notifyDataSetChanged()
    }

    override fun connected() {
        deviceListView.notifyDataSetChanged()
    }

    override fun disconnected() {
        deviceListView.notifyDataSetChanged()
    }

    override fun connectionMessage(message: NetworkConnectionListener.MESSAGE) {
        // nothing to do
    }

    override fun connectionErrorMessage(error: ErrorType) {
        // nothing to do
        if (startedConfiguration) {
            deviceListView.updateLoadingDialogMessage(DeviceListView.LOADING_DIALOG_MESSAGE.CONFIG_CONNECTING_ERROR, error, true)
        }
    }

    fun updateStatusNode(){
        var countDownTimer = object : CountDownTimer(20000, SCAN_PERIOD){
            override fun onTick(millisUntilFinished: Long) {
                startScanBle()
            }

            override fun onFinish() {
                start()
            }
        }
        countDownTimer.start()
    }


    fun startScanBle(){

        Log.e("DEBUG","**********Start scan************")
        bluetoothLeScanner.startScan(bleScanner)
    }

    fun stopScanBle(){

        Log.e("DEBUG","***********Stop scan************")
        bluetoothLeScanner.stopScan(bleScanner)
    }

    private val bleScanner = object : ScanCallback() {
        override fun onScanResult(callbackType: Int, result: ScanResult?) {

            Log.e("SCAN","MAC:${result?.device?.address} - Manu:${result?.scanRecord?.manufacturerSpecificData}")
            Log.e("RAW DATA","DATA:${result?.scanRecord?.getManufacturerSpecificData(767)}")

            // 767 is Silabs' ID
            val rawData = result?.scanRecord?.getManufacturerSpecificData(767)

            if(rawData == null){
                Log.e("DEBUG","DATA NULL")
            }
            else{
                stopScanBle()

                var data : ArrayList<Byte> = ArrayList()

                try {
                    val decrypted = AESUtils.decrypt(rawData)
                    decrypted.forEach {
                        data.add(it)
                    }

                } catch (e: Exception) {
                    e.printStackTrace()
                }

                statusOfNodes = analysisData(data)

                Log.e("DATA FINAL",statusOfNodes.toString())

                deviceList.forEach {
                    for(index in statusOfNodes.indices){

                        if(it.node.primaryElementAddress == statusOfNodes[index].unicastAddress){
                            it.heartBeat = statusOfNodes[index].heartBeat
                            it.battery = statusOfNodes[index].battery
                            it.alarmSignal = statusOfNodes[index].alarmSignal
                        }

                    }
                }

                refreshList()
            }
        }
    }


    private val bluetoothLeScanner: BluetoothLeScanner
        get() {
            val bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
            return bluetoothAdapter.bluetoothLeScanner
        }

    private fun analysisData( a : ArrayList<Byte>) : ArrayList<statusOfNode>{
        var index = 0
        var stt = 1
        var indexMax = a.size - 2
        var statusOfNodes : ArrayList<statusOfNode> = ArrayList()

        /*
       * Data include : 16 nodes
       * Each node has 2 bytes:  First Byte | Second Byte
       *  - First Byte : 7 bits battery | 1 bit heartbeat
       *  - Second Byte : 7 bits unicast address | 1 bits alarm signal
       * */

        while(index <= indexMax){

            var heartBeat = 0x01 and a[index].toInt()
            var preBattery = a[index].toInt() shr 1
            var Battery = 0x7F and preBattery
            Log.e("DEBUG","Node $stt : Heartbeat = $heartBeat || Battery = $Battery")


            var alarmSignal = 0x01 and a[index + 1].toInt()
            var preAddress = a[index + 1].toInt() shr 1
            var Address = 0x7F and preAddress
            Log.e("DEBUG","Node $stt : Alarm Signal = $alarmSignal || Unicast Address = $Address")
            Log.e("DEBUG","**************************************************")

            statusOfNodes.add(statusOfNode(heartBeat,Battery,alarmSignal,Address))

            stt += 1
            index += 2
        }
        return statusOfNodes
    }

}
