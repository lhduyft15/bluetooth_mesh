package com.siliconlabs.bluetoothmesh.App.Logic;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0006\u0010\u0012\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001J\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothScanner;", "Landroid/bluetooth/le/ScanCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothStateReceiver$BluetoothStateListener;", "bluetoothStateReceiver", "Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothStateReceiver;", "(Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothStateReceiver;)V", "TAG", "", "bluetoothLeScanner", "Landroid/bluetooth/le/BluetoothLeScanner;", "leScanStarted", "", "scanCallbacks", "Ljava/util/ArrayList;", "addScanCallback", "", "scanCallback", "initBluetoothLeScanner", "isLeScanStarted", "onBluetoothStateChanged", "enabled", "onScanResult", "callbackType", "", "result", "Landroid/bluetooth/le/ScanResult;", "removeScanCallback", "startLeScan", "meshServ", "Landroid/os/ParcelUuid;", "stopLeScan", "android_application_aarRelease"})
public final class BluetoothScanner extends android.bluetooth.le.ScanCallback implements com.siliconlabs.bluetoothmesh.App.Logic.BluetoothStateReceiver.BluetoothStateListener {
    private final java.lang.String TAG = null;
    private boolean leScanStarted;
    private android.bluetooth.le.BluetoothLeScanner bluetoothLeScanner;
    private final java.util.ArrayList<android.bluetooth.le.ScanCallback> scanCallbacks = null;
    
    public final void addScanCallback(@org.jetbrains.annotations.NotNull()
    android.bluetooth.le.ScanCallback scanCallback) {
    }
    
    public final void removeScanCallback(@org.jetbrains.annotations.NotNull()
    android.bluetooth.le.ScanCallback scanCallback) {
    }
    
    public final boolean startLeScan(@org.jetbrains.annotations.NotNull()
    android.os.ParcelUuid meshServ) {
        return false;
    }
    
    public final void stopLeScan() {
    }
    
    public final boolean isLeScanStarted() {
        return false;
    }
    
    private final void initBluetoothLeScanner() {
    }
    
    @java.lang.Override()
    public void onScanResult(int callbackType, @org.jetbrains.annotations.NotNull()
    android.bluetooth.le.ScanResult result) {
    }
    
    @java.lang.Override()
    public void onBluetoothStateChanged(boolean enabled) {
    }
    
    public BluetoothScanner(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.BluetoothStateReceiver bluetoothStateReceiver) {
        super();
    }
}