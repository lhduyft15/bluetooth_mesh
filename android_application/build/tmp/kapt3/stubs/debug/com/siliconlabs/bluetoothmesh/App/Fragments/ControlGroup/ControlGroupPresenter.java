package com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B-\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020)H\u0016J\b\u0010-\u001a\u00020)H\u0016J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020)2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020)H\u0016J\u0010\u0010/\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0016J\u000e\u00105\u001a\u00020)2\u0006\u00106\u001a\u000207J\u0010\u00108\u001a\u00020)2\u0006\u00109\u001a\u00020#H\u0016J\u0010\u0010:\u001a\u00020)2\u0006\u00109\u001a\u00020#H\u0016J\u0016\u0010;\u001a\u00020)2\f\u00109\u001a\b\u0012\u0004\u0012\u00020#0<H\u0016J\u000e\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020+J\u000e\u0010?\u001a\u00020)2\u0006\u0010@\u001a\u00020AJ\b\u0010B\u001a\u00020)H\u0016J\b\u0010C\u001a\u00020)H\u0016J1\u0010D\u001a\u00020)2\u0006\u00109\u001a\u00020#2\u0006\u0010E\u001a\u00020+2\b\u0010F\u001a\u0004\u0018\u00010+2\b\u0010G\u001a\u0004\u0018\u00010+H\u0016\u00a2\u0006\u0002\u0010HJ\u0006\u0010I\u001a\u00020)R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006J"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupPresenter;", "Lcom/siliconlabs/bluetoothmesh/App/BasePresenter;", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionListener;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter$DeviceItemListener;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$SetCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$SetCallback;", "controlGroupView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupView;", "networkConnectionLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "meshGroupControl", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl;", "meshNodeManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupView;Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl;Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;)V", "TAG", "", "groupInfo", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "getGroupInfo", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "getMeshLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "getMeshNodeManager", "()Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "getNetworkConnectionLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "networkInfo", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "getNetworkInfo", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "nodes", "", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "getNodes", "()Ljava/util/Set;", "setNodes", "(Ljava/util/Set;)V", "changeDevicesState", "", "level", "", "connected", "connecting", "connectionErrorMessage", "error", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "connectionMessage", "message", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionListener$MESSAGE;", "disconnected", "meshIconClicked", "iconState", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupView$MESH_ICON_STATE;", "onClickDeviceImageListener", "deviceInfo", "onConfigClickListener", "onDeleteClickListener", "", "onMasterLevelChanged", "percentage", "onMasterSwitchChanged", "isChecked", "", "onPause", "onResume", "onSeekBarChangeListener", "levelPercentage", "temperaturePercentage", "deltaUvPercentage", "(Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;ILjava/lang/Integer;Ljava/lang/Integer;)V", "refreshList", "android_application_debug"})
public final class ControlGroupPresenter implements com.siliconlabs.bluetoothmesh.App.BasePresenter, com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionListener, com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListAdapter.DeviceItemListener, com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.SetCallback, com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.SetCallback {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlab.bluetoothmesh.adk.data_model.group.Group groupInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> nodes;
    private final com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupView controlGroupView = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic = null;
    private final com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl meshGroupControl = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager meshNodeManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlab.bluetoothmesh.adk.data_model.group.Group getGroupInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet getNetworkInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> getNodes() {
        return null;
    }
    
    public final void setNodes(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> p0) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    public final void refreshList() {
    }
    
    private final void changeDevicesState(int level) {
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
    
    public final void meshIconClicked(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupView.MESH_ICON_STATE iconState) {
    }
    
    public final void onMasterSwitchChanged(boolean isChecked) {
    }
    
    public final void onMasterLevelChanged(int percentage) {
    }
    
    @java.lang.Override()
    public void onClickDeviceImageListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
    }
    
    @java.lang.Override()
    public void onSeekBarChangeListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo, int levelPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer temperaturePercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer deltaUvPercentage) {
    }
    
    @java.lang.Override()
    public void error(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType error) {
    }
    
    @java.lang.Override()
    public void onDeleteClickListener(@org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> deviceInfo) {
    }
    
    @java.lang.Override()
    public void onConfigClickListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic getNetworkConnectionLogic() {
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
    
    public ControlGroupPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupView controlGroupView, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl meshGroupControl, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager meshNodeManager) {
        super();
    }
}