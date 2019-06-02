package com.siliconlabs.bluetoothmesh.App.Logic;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006("}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "bluetoothMesh", "Lcom/siliconlab/bluetoothmesh/adk/BluetoothMesh;", "getBluetoothMesh", "()Lcom/siliconlab/bluetoothmesh/adk/BluetoothMesh;", "getContext", "()Landroid/content/Context;", "currentGroup", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "getCurrentGroup", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "setCurrentGroup", "(Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;)V", "currentNetwork", "Lcom/siliconlab/bluetoothmesh/adk/data_model/network/Network;", "getCurrentNetwork", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/network/Network;", "setCurrentNetwork", "(Lcom/siliconlab/bluetoothmesh/adk/data_model/network/Network;)V", "currentSubnet", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "getCurrentSubnet", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "setCurrentSubnet", "(Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;)V", "deviceToConfigure", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "getDeviceToConfigure", "()Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "setDeviceToConfigure", "(Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;)V", "exportNetworkKeys", "Landroid/content/Intent;", "networks", "android_application_aarDebug"})
public final class MeshLogic {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlab.bluetoothmesh.adk.BluetoothMesh bluetoothMesh = null;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlab.bluetoothmesh.adk.data_model.network.Network currentNetwork;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet currentSubnet;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlab.bluetoothmesh.adk.data_model.group.Group currentGroup;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceToConfigure;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlab.bluetoothmesh.adk.BluetoothMesh getBluetoothMesh() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.data_model.network.Network getCurrentNetwork() {
        return null;
    }
    
    public final void setCurrentNetwork(@org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.data_model.network.Network p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet getCurrentSubnet() {
        return null;
    }
    
    public final void setCurrentSubnet(@org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.data_model.group.Group getCurrentGroup() {
        return null;
    }
    
    public final void setCurrentGroup(@org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode getDeviceToConfigure() {
        return null;
    }
    
    public final void setDeviceToConfigure(@org.jetbrains.annotations.Nullable()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent exportNetworkKeys(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networks) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public MeshLogic(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}