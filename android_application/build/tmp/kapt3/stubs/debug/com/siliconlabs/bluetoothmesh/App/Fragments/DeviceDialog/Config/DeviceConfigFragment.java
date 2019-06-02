package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0016J&\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\u001a\u0010\'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010\'\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020,2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020\u000eH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigView;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigListener;", "()V", "deviceConfigPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigPresenter;", "getDeviceConfigPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigPresenter;", "setDeviceConfigPresenter", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigPresenter;)V", "loadingDialog", "Landroid/app/AlertDialog;", "dismissLoadingDialog", "", "getDeviceConfig", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;", "getDeviceDialogFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/DeviceDialogFragment;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeviceNameErrorMessage", "message", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigListener$ERROR_MESSAGE;", "onPause", "onResume", "setDeviceConfig", "deviceInfo", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "deviceConfig", "groupsInSubnet", "", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "setLoadingDialogMessage", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "showCloseButton", "", "", "showLoadingDialog", "android_application_debug"})
public final class DeviceConfigFragment extends dagger.android.support.DaggerFragment implements com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigView, com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigPresenter deviceConfigPresenter;
    private android.app.AlertDialog loadingDialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigPresenter getDeviceConfigPresenter() {
        return null;
    }
    
    public final void setDeviceConfigPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigPresenter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void setDeviceConfig(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig deviceConfig, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.group.Group> groupsInSubnet) {
    }
    
    private final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.DeviceDialogFragment getDeviceDialogFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void showLoadingDialog() {
    }
    
    @java.lang.Override()
    public void setLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean showCloseButton) {
    }
    
    @java.lang.Override()
    public void setLoadingDialogMessage(@org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, boolean showCloseButton) {
    }
    
    @java.lang.Override()
    public void dismissLoadingDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig getDeviceConfig() {
        return null;
    }
    
    @java.lang.Override()
    public void onDeviceNameErrorMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigListener.ERROR_MESSAGE message) {
    }
    
    public DeviceConfigFragment() {
        super();
    }
}