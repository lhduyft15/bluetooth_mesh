package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B%\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0013H\u0016J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0013H\u0016J\u0016\u0010+\u001a\u00020\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130,H\u0016J\b\u0010-\u001a\u00020\u001fH\u0016J\b\u0010.\u001a\u00020\u001fH\u0016J1\u0010/\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00132\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u000101H\u0016\u00a2\u0006\u0002\u00104J\u0006\u00105\u001a\u00020\u001fJ\u000e\u00106\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0013J\u0010\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u001dH\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListPresenter;", "Lcom/siliconlabs/bluetoothmesh/App/BasePresenter;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter$DeviceItemListener;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$SetCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$GetOnOffCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionListener;", "deviceListView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "networkConnectionLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "meshNodeManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView;Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;)V", "TAG", "", "deviceList", "", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "getMeshLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "getMeshNodeManager", "()Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "getNetworkConnectionLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "networkInfo", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "startedConfiguration", "", "connected", "", "connecting", "connectionErrorMessage", "error", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "connectionMessage", "message", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionListener$MESSAGE;", "disconnected", "onClickDeviceImageListener", "deviceInfo", "onConfigClickListener", "onDeleteClickListener", "", "onPause", "onResume", "onSeekBarChangeListener", "levelPercentage", "", "temperaturePercentage", "deltaUvPercentage", "(Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;ILjava/lang/Integer;Ljava/lang/Integer;)V", "refreshList", "startConfigDevice", "success", "on", "android_application_aarDebug"})
public final class DeviceListPresenter implements com.siliconlabs.bluetoothmesh.App.BasePresenter, com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListAdapter.DeviceItemListener, com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.SetCallback, com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.GetOnOffCallback, com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionListener {
    private final java.lang.String TAG = null;
    private final com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo = null;
    private java.util.Set<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> deviceList;
    private boolean startedConfiguration;
    private final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView deviceListView = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager meshNodeManager = null;
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    public final void refreshList() {
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
    
    public final void startConfigDevice(@org.jetbrains.annotations.NotNull()
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