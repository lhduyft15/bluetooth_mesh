package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\u001aJ\b\u0010\"\u001a\u00020\u001aH\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\u0006\u0010$\u001a\u00020\u001cJ\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/DeviceDialogPresenter;", "Lcom/siliconlabs/bluetoothmesh/App/BasePresenter;", "deviceDialogView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/DeviceDialogView;", "networkConnectionLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/DeviceDialogView;Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;)V", "deviceConfigListener", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigListener;", "getDeviceConfigListener", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigListener;", "setDeviceConfigListener", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigListener;)V", "deviceEditionDialogsListener", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsListener;", "getDeviceEditionDialogsListener", "()Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsListener;", "setDeviceEditionDialogsListener", "(Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsListener;)V", "meshNode", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "getMeshNode", "()Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "clearDeviceToConfig", "", "disableProxyOnConnectedDevice", "", "deviceConfig", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;", "node", "Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "onCancelDeviceConfigClicked", "onPause", "onResume", "onSaveDeviceConfigClicked", "validDeviceConfig", "android_application_debug"})
public final class DeviceDialogPresenter implements com.siliconlabs.bluetoothmesh.App.BasePresenter {
    @org.jetbrains.annotations.Nullable()
    private com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigListener deviceConfigListener;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsListener deviceEditionDialogsListener;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode meshNode = null;
    private final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.DeviceDialogView deviceDialogView = null;
    private final com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic = null;
    private final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigListener getDeviceConfigListener() {
        return null;
    }
    
    public final void setDeviceConfigListener(@org.jetbrains.annotations.Nullable()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsListener getDeviceEditionDialogsListener() {
        return null;
    }
    
    public final void setDeviceEditionDialogsListener(@org.jetbrains.annotations.Nullable()
    com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode getMeshNode() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void clearDeviceToConfig() {
    }
    
    public final boolean onSaveDeviceConfigClicked() {
        return false;
    }
    
    public final void onCancelDeviceConfigClicked() {
    }
    
    private final boolean disableProxyOnConnectedDevice(com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig deviceConfig, com.siliconlab.bluetoothmesh.adk.data_model.node.Node node) {
        return false;
    }
    
    private final boolean validDeviceConfig(com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig deviceConfig) {
        return false;
    }
    
    public DeviceDialogPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.DeviceDialogView deviceDialogView, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic) {
        super();
    }
}