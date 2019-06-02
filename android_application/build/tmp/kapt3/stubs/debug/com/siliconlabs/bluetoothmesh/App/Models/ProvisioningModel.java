package com.siliconlabs.bluetoothmesh.App.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\'\u001a\u00020\u0014J \u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020-H\u0016J\u0006\u0010.\u001a\u00020\u000eJ\u0016\u0010/\u001a\u00020)2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\bJ\u0016\u0010/\u001a\u00020)2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u000eJ\u000e\u00104\u001a\u00020)2\u0006\u00105\u001a\u000206J\u000e\u00107\u001a\u00020)2\u0006\u00108\u001a\u00020-J \u00109\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000e2\u0006\u00105\u001a\u000206H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0014X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006:"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningModel;", "Lcom/siliconlab/bluetoothmesh/adk/provisioning/ProvisioningCallback;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "meshNodeManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "(Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;)V", "TAG", "", "getMeshLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "getMeshNodeManager", "()Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "networkInfo", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "getNetworkInfo$android_application_debug", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "setNetworkInfo$android_application_debug", "(Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;)V", "provisioned", "", "getProvisioned$android_application_debug", "()Z", "setProvisioned$android_application_debug", "(Z)V", "provisionedDeviceName", "provisioning", "getProvisioning$android_application_debug", "setProvisioning$android_application_debug", "provisioningStatusPropagator", "Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningStatusPropagator;", "getProvisioningStatusPropagator", "()Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningStatusPropagator;", "selectedDevice", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceDescription;", "getSelectedDevice", "()Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceDescription;", "setSelectedDevice", "(Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceDescription;)V", "checkIfSelectedDeviceAlreadyAdded", "error", "", "device", "Lcom/siliconlab/bluetoothmesh/adk/connectable_device/ConnectableDevice;", "subnet", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "getNetworkInfo", "provisionDevice", "name", "connectableDevice", "Lcom/siliconlabs/bluetoothmesh/App/Models/BluetoothConnectableDevice;", "network", "provisioningSuccessful", "node", "Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "provisioningUnsuccessful", "status", "success", "android_application_debug"})
public final class ProvisioningModel implements com.siliconlab.bluetoothmesh.adk.provisioning.ProvisioningCallback {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Models.ProvisioningStatusPropagator provisioningStatusPropagator = null;
    private boolean provisioning;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlabs.bluetoothmesh.App.Models.DeviceDescription selectedDevice;
    private boolean provisioned;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo;
    private java.lang.String provisionedDeviceName;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager meshNodeManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Models.ProvisioningStatusPropagator getProvisioningStatusPropagator() {
        return null;
    }
    
    public final boolean getProvisioning$android_application_debug() {
        return false;
    }
    
    public final void setProvisioning$android_application_debug(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlabs.bluetoothmesh.App.Models.DeviceDescription getSelectedDevice() {
        return null;
    }
    
    public final void setSelectedDevice(@org.jetbrains.annotations.Nullable()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceDescription p0) {
    }
    
    public final boolean getProvisioned$android_application_debug() {
        return false;
    }
    
    public final void setProvisioned$android_application_debug(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet getNetworkInfo$android_application_debug() {
        return null;
    }
    
    public final void setNetworkInfo$android_application_debug(@org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet p0) {
    }
    
    public final boolean checkIfSelectedDeviceAlreadyAdded() {
        return false;
    }
    
    public final void provisionDevice(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void provisionDevice(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.BluetoothConnectableDevice connectableDevice, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet network) {
    }
    
    @java.lang.Override()
    public void success(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.connectable_device.ConnectableDevice device, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.node.Node node) {
    }
    
    @java.lang.Override()
    public void error(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.connectable_device.ConnectableDevice device, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType error) {
    }
    
    public final void provisioningSuccessful(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.node.Node node) {
    }
    
    public final void provisioningUnsuccessful(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType status) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet getNetworkInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic getMeshLogic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager getMeshNodeManager() {
        return null;
    }
    
    public ProvisioningModel(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager meshNodeManager) {
        super();
    }
}