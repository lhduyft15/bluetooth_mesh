package com.siliconlabs.bluetoothmesh.App.Models;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\'(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001b\u001a\u00020\u0006J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010 \u001a\u00020#J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006)"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNetworkManager;", "", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "(Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;)V", "TAG", "", "bluetoothMesh", "Lcom/siliconlab/bluetoothmesh/adk/BluetoothMesh;", "getBluetoothMesh", "()Lcom/siliconlab/bluetoothmesh/adk/BluetoothMesh;", "getMeshLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "network", "Lcom/siliconlab/bluetoothmesh/adk/data_model/network/Network;", "getNetwork", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/network/Network;", "setNetwork", "(Lcom/siliconlab/bluetoothmesh/adk/data_model/network/Network;)V", "subnet", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "getSubnet", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "setSubnet", "(Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;)V", "createGroup", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "name", "createSubnet", "removeGroup", "", "group", "callback", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNetworkManager$DeleteGroupsCallback;", "removeSubnet", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNetworkManager$DeleteNetworksCallback;", "setupGroup", "setupNetwork", "setupSubnet", "DeleteGroupsCallback", "DeleteNetworksCallback", "android_application_debug"})
public final class MeshNetworkManager {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlab.bluetoothmesh.adk.BluetoothMesh bluetoothMesh = null;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlab.bluetoothmesh.adk.data_model.network.Network network;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlab.bluetoothmesh.adk.BluetoothMesh getBluetoothMesh() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.data_model.network.Network getNetwork() {
        return null;
    }
    
    public final void setNetwork(@org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.data_model.network.Network p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet getSubnet() {
        return null;
    }
    
    public final void setSubnet(@org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet p0) {
    }
    
    private final void setupNetwork() {
    }
    
    private final void setupSubnet() {
    }
    
    private final void setupGroup() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet createSubnet(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public final void removeSubnet(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNetworkManager.DeleteNetworksCallback callback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.data_model.group.Group createGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet) {
        return null;
    }
    
    public final void removeGroup(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group group, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNetworkManager.DeleteGroupsCallback callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic getMeshLogic() {
        return null;
    }
    
    public MeshNetworkManager(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNetworkManager$DeleteGroupsCallback;", "", "error", "", "group", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "success", "android_application_debug"})
    public static abstract interface DeleteGroupsCallback {
        
        public abstract void success();
        
        public abstract void error(@org.jetbrains.annotations.Nullable()
        com.siliconlab.bluetoothmesh.adk.data_model.group.Group group, @org.jetbrains.annotations.Nullable()
        com.siliconlab.bluetoothmesh.adk.ErrorType errorType);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNetworkManager$DeleteNetworksCallback;", "", "error", "", "subnet", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "success", "android_application_debug"})
    public static abstract interface DeleteNetworksCallback {
        
        public abstract void success();
        
        public abstract void error(@org.jetbrains.annotations.Nullable()
        com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet, @org.jetbrains.annotations.Nullable()
        com.siliconlab.bluetoothmesh.adk.ErrorType error);
    }
}