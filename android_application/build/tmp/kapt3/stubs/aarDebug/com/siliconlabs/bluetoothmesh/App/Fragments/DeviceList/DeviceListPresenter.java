package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B%\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ0\u0010,\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`\'2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020.0%j\b\u0012\u0004\u0012\u00020.`\'H\u0002J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000200H\u0016J\u0010\u00102\u001a\u0002002\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002002\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u000200H\u0016J\u0010\u00103\u001a\u0002002\u0006\u00103\u001a\u000204H\u0016J\u0006\u00109\u001a\u000200J\u0010\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020\u0019H\u0016J\u0010\u0010<\u001a\u0002002\u0006\u0010;\u001a\u00020\u0019H\u0016J\u0016\u0010=\u001a\u0002002\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00190>H\u0016J\b\u0010?\u001a\u000200H\u0016J\b\u0010@\u001a\u000200H\u0016J1\u0010A\u001a\u0002002\u0006\u0010;\u001a\u00020\u00192\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010E\u001a\u0004\u0018\u00010CH\u0016\u00a2\u0006\u0002\u0010FJ\u0006\u0010G\u001a\u000200J\u0006\u0010H\u001a\u000200J\u000e\u0010I\u001a\u0002002\u0006\u0010;\u001a\u00020\u0019J\u0010\u0010J\u001a\u0002002\u0006\u0010K\u001a\u00020#H\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010$\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006L"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListPresenter;", "Lcom/siliconlabs/bluetoothmesh/App/BasePresenter;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter$DeviceItemListener;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$SetCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$GetOnOffCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionListener;", "deviceListView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "networkConnectionLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "meshNodeManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView;Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;)V", "TAG", "", "bleScanner", "Landroid/bluetooth/le/ScanCallback;", "bluetoothLeScanner", "Landroid/bluetooth/le/BluetoothLeScanner;", "getBluetoothLeScanner", "()Landroid/bluetooth/le/BluetoothLeScanner;", "deviceList", "", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "getMeshLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "getMeshNodeManager", "()Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "getNetworkConnectionLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "networkInfo", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "startedConfiguration", "", "statusOfNodes", "Ljava/util/ArrayList;", "Lcom/siliconlabs/bluetoothmesh/App/statusOfNode;", "Lkotlin/collections/ArrayList;", "getStatusOfNodes", "()Ljava/util/ArrayList;", "setStatusOfNodes", "(Ljava/util/ArrayList;)V", "checkStatusNode", "a", "", "connected", "", "connecting", "connectionErrorMessage", "error", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "connectionMessage", "message", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionListener$MESSAGE;", "disconnected", "onChangeDeviceStatus", "onClickDeviceImageListener", "deviceInfo", "onConfigClickListener", "onDeleteClickListener", "", "onPause", "onResume", "onSeekBarChangeListener", "levelPercentage", "", "temperaturePercentage", "deltaUvPercentage", "(Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;ILjava/lang/Integer;Ljava/lang/Integer;)V", "refreshList", "scanAdvertiseBle", "startConfigDevice", "success", "on", "android_application_aarDebug"})
public final class DeviceListPresenter implements com.siliconlabs.bluetoothmesh.App.BasePresenter, com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListAdapter.DeviceItemListener, com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.SetCallback, com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.GetOnOffCallback, com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionListener {
    private final java.lang.String TAG = null;
    private final com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo = null;
    private java.util.Set<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> deviceList;
    private boolean startedConfiguration;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.siliconlabs.bluetoothmesh.App.statusOfNode> statusOfNodes;
    private final android.bluetooth.le.ScanCallback bleScanner = null;
    private final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView deviceListView = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager meshNodeManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.siliconlabs.bluetoothmesh.App.statusOfNode> getStatusOfNodes() {
        return null;
    }
    
    public final void setStatusOfNodes(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.siliconlabs.bluetoothmesh.App.statusOfNode> p0) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    public final void refreshList() {
    }
    
    public final void startConfigDevice(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
    }
    
    @java.lang.Override()
    public void onClickDeviceImageListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
    }
    
    @java.lang.Override()
    public void onDeleteClickListener(@org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> deviceInfo) {
    }
    
    @java.lang.Override()
    public void onSeekBarChangeListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo, int levelPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer temperaturePercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer deltaUvPercentage) {
    }
    
    @java.lang.Override()
    public void onConfigClickListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
    }
    
    @java.lang.Override()
    public void success(boolean on) {
    }
    
    @java.lang.Override()
    public void error(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType error) {
    }
    
    @java.lang.Override()
    public void connecting() {
    }
    
    @java.lang.Override()
    public void connected() {
    }
    
    @java.lang.Override()
    public void disconnected() {
    }
    
    @java.lang.Override()
    public void connectionMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionListener.MESSAGE message) {
    }
    
    @java.lang.Override()
    public void connectionErrorMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType error) {
    }
    
    public final void onChangeDeviceStatus() {
    }
    
    public final void scanAdvertiseBle() {
    }
    
    private final android.bluetooth.le.BluetoothLeScanner getBluetoothLeScanner() {
        return null;
    }
    
    private final java.util.ArrayList<com.siliconlabs.bluetoothmesh.App.statusOfNode> checkStatusNode(java.util.ArrayList<java.lang.Byte> a) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic getMeshLogic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic getNetworkConnectionLogic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager getMeshNodeManager() {
        return null;
    }
    
    public DeviceListPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView deviceListView, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager meshNodeManager) {
        super();
    }
}