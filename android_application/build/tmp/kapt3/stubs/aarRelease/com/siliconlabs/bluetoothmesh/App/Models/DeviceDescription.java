package com.siliconlabs.bluetoothmesh.App.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001d\u00a8\u00060"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceDescription;", "", "()V", "connectable_device", "Lcom/siliconlabs/bluetoothmesh/App/Models/BluetoothConnectableDevice;", "getConnectable_device", "()Lcom/siliconlabs/bluetoothmesh/App/Models/BluetoothConnectableDevice;", "setConnectable_device", "(Lcom/siliconlabs/bluetoothmesh/App/Models/BluetoothConnectableDevice;)V", "device_address", "", "getDevice_address", "()Ljava/lang/String;", "setDevice_address", "(Ljava/lang/String;)V", "device_name", "getDevice_name", "setDevice_name", "existed_node", "Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "getExisted_node", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "setExisted_node", "(Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;)V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "rssi", "getRssi", "setRssi", "scanRecord", "", "getScanRecord", "()[B", "setScanRecord", "([B)V", "timestamp", "", "getTimestamp", "()J", "setTimestamp", "(J)V", "tx", "getTx", "setTx", "android_application_aarRelease"})
public final class DeviceDescription {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String device_name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String device_address;
    private int rssi;
    private int tx;
    private long timestamp;
    private int position;
    @org.jetbrains.annotations.Nullable()
    private byte[] scanRecord;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlabs.bluetoothmesh.App.Models.BluetoothConnectableDevice connectable_device;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlab.bluetoothmesh.adk.data_model.node.Node existed_node;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDevice_name() {
        return null;
    }
    
    public final void setDevice_name(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDevice_address() {
        return null;
    }
    
    public final void setDevice_address(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getRssi() {
        return 0;
    }
    
    public final void setRssi(int p0) {
    }
    
    public final int getTx() {
        return 0;
    }
    
    public final void setTx(int p0) {
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public final void setTimestamp(long p0) {
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getScanRecord() {
        return null;
    }
    
    public final void setScanRecord(@org.jetbrains.annotations.Nullable()
    byte[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlabs.bluetoothmesh.App.Models.BluetoothConnectableDevice getConnectable_device() {
        return null;
    }
    
    public final void setConnectable_device(@org.jetbrains.annotations.Nullable()
    com.siliconlabs.bluetoothmesh.App.Models.BluetoothConnectableDevice p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.data_model.node.Node getExisted_node() {
        return null;
    }
    
    public final void setExisted_node(@org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.data_model.node.Node p0) {
    }
    
    public DeviceDescription() {
        super();
    }
}