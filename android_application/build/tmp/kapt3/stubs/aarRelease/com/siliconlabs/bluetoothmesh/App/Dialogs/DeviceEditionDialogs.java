package com.siliconlabs.bluetoothmesh.App.Dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002&\'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0016\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019J\"\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%J\u001c\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs;", "", "activityProvider", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs$ActivityProvider;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "(Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs$ActivityProvider;Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;)V", "getActivityProvider", "()Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs$ActivityProvider;", "deviceEditionDialogsListener", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs$DeviceEditionDialogsListener;", "getDeviceEditionDialogsListener", "()Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs$DeviceEditionDialogsListener;", "setDeviceEditionDialogsListener", "(Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs$DeviceEditionDialogsListener;)V", "loadingDialog", "Landroid/app/AlertDialog;", "dismissLoadingDialog", "", "showDeleteDeviceDialog", "devicesInfo", "", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "showDeleteDeviceLocallyDialog", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "node", "Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "showDeviceConfigDialog", "deviceInfo", "showLoadingDialog", "updateLoadingDialogMessage", "loadingMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView$LOADING_DIALOG_MESSAGE;", "message", "", "showCloseButton", "", "ActivityProvider", "DeviceEditionDialogsListener", "android_application_aarRelease"})
public final class DeviceEditionDialogs {
    private android.app.AlertDialog loadingDialog;
    @org.jetbrains.annotations.NotNull()
    public com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogs.DeviceEditionDialogsListener deviceEditionDialogsListener;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogs.ActivityProvider activityProvider = null;
    private final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogs.DeviceEditionDialogsListener getDeviceEditionDialogsListener() {
        return null;
    }
    
    public final void setDeviceEditionDialogsListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogs.DeviceEditionDialogsListener p0) {
    }
    
    public final void showDeleteDeviceDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> devicesInfo) {
    }
    
    public final void showDeleteDeviceLocallyDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.node.Node node) {
    }
    
    public final void showDeviceConfigDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
    }
    
    public final void showLoadingDialog() {
    }
    
    public final void dismissLoadingDialog() {
    }
    
    public final void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean showCloseButton) {
    }
    
    public final void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType) {
    }
    
    private final void updateLoadingDialogMessage(java.lang.String message, boolean showCloseButton) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogs.ActivityProvider getActivityProvider() {
        return null;
    }
    
    public DeviceEditionDialogs(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogs.ActivityProvider activityProvider, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs$ActivityProvider;", "", "getActivity", "Landroid/app/Activity;", "getChildFragmentManager", "Landroid/support/v4/app/FragmentManager;", "android_application_aarRelease"})
    public static abstract interface ActivityProvider {
        
        @org.jetbrains.annotations.Nullable()
        public abstract android.app.Activity getActivity();
        
        @org.jetbrains.annotations.NotNull()
        public abstract android.support.v4.app.FragmentManager getChildFragmentManager();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u0003H&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs$DeviceEditionDialogsListener;", "", "deleteDeviceLocally", "", "node", "Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "deleteDevices", "devicesInfo", "", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "dismiss", "updateDeviceConfig", "meshNode", "deviceConfig", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;", "exitFromNetworkOnFinish", "", "android_application_aarRelease"})
    public static abstract interface DeviceEditionDialogsListener {
        
        public abstract void dismiss();
        
        public abstract void deleteDevices(@org.jetbrains.annotations.NotNull()
        java.util.List<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> devicesInfo);
        
        public abstract void deleteDeviceLocally(@org.jetbrains.annotations.NotNull()
        com.siliconlab.bluetoothmesh.adk.data_model.node.Node node);
        
        public abstract void updateDeviceConfig(@org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode meshNode, @org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig deviceConfig, boolean exitFromNetworkOnFinish);
    }
}