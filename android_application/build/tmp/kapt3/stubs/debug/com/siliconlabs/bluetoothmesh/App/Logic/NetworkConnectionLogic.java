package com.siliconlabs.bluetoothmesh.App.Logic;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u00018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0013J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0015J\u0010\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020!H\u0002J\u0006\u0010,\u001a\u00020!J\b\u0010-\u001a\u0004\u0018\u00010.J\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020!H\u0002J\b\u00102\u001a\u00020!H\u0016J\b\u00103\u001a\u00020!H\u0016J\u000e\u00104\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0013J\u0010\u00105\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u00106\u001a\u00020!H\u0002J\b\u00107\u001a\u00020!H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "Lcom/siliconlabs/bluetoothmesh/App/Models/BluetoothConnectableDevice$DeviceConnectionCallback;", "context", "Landroid/content/Context;", "connectableDeviceHelper", "Lcom/siliconlab/bluetoothmesh/adk/connectable_device/ConnectableDeviceHelper;", "bluetoothLeScanLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothScanner;", "(Landroid/content/Context;Lcom/siliconlab/bluetoothmesh/adk/connectable_device/ConnectableDeviceHelper;Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothScanner;)V", "TAG", "", "bluetoothConnectableDevice", "Lcom/siliconlabs/bluetoothmesh/App/Models/BluetoothConnectableDevice;", "connectionTimeoutRunnable", "Ljava/lang/Runnable;", "currentState", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic$CONNECTION_STATE;", "listeners", "Ljava/util/ArrayList;", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionListener;", "networkInfo", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "proxyConnection", "Lcom/siliconlab/bluetoothmesh/adk/connectable_device/ProxyConnection;", "getProxyConnection", "()Lcom/siliconlab/bluetoothmesh/adk/connectable_device/ProxyConnection;", "setProxyConnection", "(Lcom/siliconlab/bluetoothmesh/adk/connectable_device/ProxyConnection;)V", "scanCallback", "Landroid/bluetooth/le/ScanCallback;", "uiHandler", "Landroid/os/Handler;", "addListener", "", "networkConnectionListener", "connect", "network", "connectionErrorMessage", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "connectionMessage", "message", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionListener$MESSAGE;", "connetionTimeout", "disconnect", "getCurrentConnectedDeviceInfo", "Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "isConnected", "", "notifyCurrentState", "onConnectedToDevice", "onDisconnectedFromDevice", "removeListener", "setCurrentState", "startScan", "stopScan", "CONNECTION_STATE", "android_application_debug"})
public final class NetworkConnectionLogic implements com.siliconlabs.bluetoothmesh.App.Models.BluetoothConnectableDevice.DeviceConnectionCallback {
    private final java.lang.String TAG = null;
    private final android.os.Handler uiHandler = null;
    private com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic.CONNECTION_STATE currentState;
    private final java.util.ArrayList<com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionListener> listeners = null;
    private com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlab.bluetoothmesh.adk.connectable_device.ProxyConnection proxyConnection;
    private com.siliconlabs.bluetoothmesh.App.Models.BluetoothConnectableDevice bluetoothConnectableDevice;
    private java.lang.Runnable connectionTimeoutRunnable;
    private final android.bluetooth.le.ScanCallback scanCallback = null;
    private final android.content.Context context = null;
    private final com.siliconlab.bluetoothmesh.adk.connectable_device.ConnectableDeviceHelper connectableDeviceHelper = null;
    private final com.siliconlabs.bluetoothmesh.App.Logic.BluetoothScanner bluetoothLeScanLogic = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.connectable_device.ProxyConnection getProxyConnection() {
        return null;
    }
    
    public final void setProxyConnection(@org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.connectable_device.ProxyConnection p0) {
    }
    
    public final void connect(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet network) {
    }
    
    public final void disconnect() {
    }
    
    public final void addListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionListener networkConnectionListener) {
    }
    
    public final void removeListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionListener networkConnectionListener) {
    }
    
    @java.lang.Override()
    public void onConnectedToDevice() {
    }
    
    @java.lang.Override()
    public void onDisconnectedFromDevice() {
    }
    
    private final void startScan() {
    }
    
    private final void stopScan() {
    }
    
    private final void connetionTimeout() {
    }
    
    public final boolean isConnected() {
        return false;
    }
    
    private final void setCurrentState(com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic.CONNECTION_STATE currentState) {
    }
    
    private final void notifyCurrentState() {
    }
    
    private final void connectionMessage(com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionListener.MESSAGE message) {
    }
    
    private final void connectionErrorMessage(com.siliconlab.bluetoothmesh.adk.ErrorType errorType) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.data_model.node.Node getCurrentConnectedDeviceInfo() {
        return null;
    }
    
    public NetworkConnectionLogic(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.connectable_device.ConnectableDeviceHelper connectableDeviceHelper, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.BluetoothScanner bluetoothLeScanLogic) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic$CONNECTION_STATE;", "", "(Ljava/lang/String;I)V", "DISCONNECTED", "CONNECTING", "CONNECTED", "android_application_debug"})
    public static enum CONNECTION_STATE {
        /*public static final*/ DISCONNECTED /* = new DISCONNECTED() */,
        /*public static final*/ CONNECTING /* = new CONNECTING() */,
        /*public static final*/ CONNECTED /* = new CONNECTED() */;
        
        CONNECTION_STATE() {
        }
    }
}