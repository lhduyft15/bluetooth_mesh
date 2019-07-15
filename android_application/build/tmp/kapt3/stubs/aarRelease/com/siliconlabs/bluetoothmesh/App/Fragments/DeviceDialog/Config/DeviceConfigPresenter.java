package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\u001fH\u0016J\u0006\u0010%\u001a\u00020\u001fJ\u0006\u0010&\u001a\u00020\u001fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigPresenter;", "Lcom/siliconlabs/bluetoothmesh/App/BasePresenter;", "deviceConfigView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigView;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigView;Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;)V", "TAG", "", "configurationControl", "Lcom/siliconlab/bluetoothmesh/adk/configuration_control/ConfigurationControl;", "deviceConfig", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;", "getDeviceConfig", "()Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;", "setDeviceConfig", "(Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;)V", "isFriend", "", "isProxy", "isRelay", "meshNode", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "supportFriend", "supportLowPower", "taskExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "taskList", "", "Ljava/lang/Runnable;", "", "getFriend", "getProxy", "getRelay", "onPause", "onResume", "startTasks", "takeNextTask", "NodeBehaviourCallback", "android_application_aarRelease"})
public final class DeviceConfigPresenter implements com.siliconlabs.bluetoothmesh.App.BasePresenter {
    private final java.lang.String TAG = null;
    private final com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode meshNode = null;
    private final com.siliconlab.bluetoothmesh.adk.configuration_control.ConfigurationControl configurationControl = null;
    @org.jetbrains.annotations.NotNull()
    private com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig deviceConfig;
    private final java.util.concurrent.ScheduledExecutorService taskExecutor = null;
    private final java.util.List<java.lang.Runnable> taskList = null;
    private boolean isProxy;
    private boolean isRelay;
    private boolean isFriend;
    private boolean supportFriend;
    private boolean supportLowPower;
    private final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigView deviceConfigView = null;
    private final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig getDeviceConfig() {
        return null;
    }
    
    public final void setDeviceConfig(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig p0) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void getDeviceConfig() {
    }
    
    public final void startTasks() {
    }
    
    public final void takeNextTask() {
    }
    
    private final java.lang.Runnable getProxy() {
        return null;
    }
    
    private final java.lang.Runnable getRelay() {
        return null;
    }
    
    private final java.lang.Runnable getFriend() {
        return null;
    }
    
    public DeviceConfigPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigView deviceConfigView, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u00a6\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigPresenter$NodeBehaviourCallback;", "Lcom/siliconlab/bluetoothmesh/adk/configuration_control/CheckNodeBehaviourCallback;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigPresenter;)V", "error", "", "node", "Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "success", "enabled", "", "android_application_aarRelease"})
    public abstract class NodeBehaviourCallback implements com.siliconlab.bluetoothmesh.adk.configuration_control.CheckNodeBehaviourCallback {
        
        @java.lang.Override()
        public void success(@org.jetbrains.annotations.Nullable()
        com.siliconlab.bluetoothmesh.adk.data_model.node.Node node, boolean enabled) {
        }
        
        @java.lang.Override()
        public void error(@org.jetbrains.annotations.Nullable()
        com.siliconlab.bluetoothmesh.adk.data_model.node.Node node, @org.jetbrains.annotations.Nullable()
        com.siliconlab.bluetoothmesh.adk.ErrorType error) {
        }
        
        public NodeBehaviourCallback() {
            super();
        }
    }
}