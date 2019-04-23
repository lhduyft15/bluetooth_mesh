package com.siliconlabs.bluetoothmesh.App.Dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u001cJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u001a\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\tH&J$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\tH&\u00a8\u0006\u001d"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Dialogs/MeshScannerDialogsView;", "", "closeLoadingDialog", "", "closeProvisionDialog", "initLoadingDialog", "activity", "Landroid/app/Activity;", "isShowingLoading", "", "isShowingProvisioning", "setNetworkAdapter", "netAdapter", "Landroid/widget/BaseAdapter;", "showDeviceAlreadyExistDialog", "listener", "Landroid/content/DialogInterface$OnClickListener;", "showLoadingDialog", "showProvisionDialog", "defaultName", "", "updateLoadingText", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "showCloseButton", "loadingText", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/MeshScannerDialogsView$LoadingText;", "status", "LoadingText", "android_application_debug"})
public abstract interface MeshScannerDialogsView {
    
    public abstract void showDeviceAlreadyExistDialog(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener listener);
    
    public abstract void setNetworkAdapter(@org.jetbrains.annotations.NotNull()
    android.widget.BaseAdapter netAdapter);
    
    public abstract void closeLoadingDialog();
    
    public abstract void closeProvisionDialog();
    
    public abstract void showLoadingDialog();
    
    public abstract void initLoadingDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    public abstract void updateLoadingText(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Dialogs.MeshScannerDialogsView.LoadingText loadingText, @org.jetbrains.annotations.NotNull()
    java.lang.String status, boolean showCloseButton);
    
    public abstract void updateLoadingText(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, boolean showCloseButton);
    
    public abstract void showProvisionDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String defaultName);
    
    public abstract boolean isShowingLoading();
    
    public abstract boolean isShowingProvisioning();
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Dialogs/MeshScannerDialogsView$LoadingText;", "", "(Ljava/lang/String;I)V", "Provisioning", "DeviceProvisionedGattDisconnected", "DeviceSuccessfullyProvisioned", "RedirectingToDevices", "android_application_debug"})
    public static enum LoadingText {
        /*public static final*/ Provisioning /* = new Provisioning() */,
        /*public static final*/ DeviceProvisionedGattDisconnected /* = new DeviceProvisionedGattDisconnected() */,
        /*public static final*/ DeviceSuccessfullyProvisioned /* = new DeviceSuccessfullyProvisioned() */,
        /*public static final*/ RedirectingToDevices /* = new RedirectingToDevices() */;
        
        LoadingText() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}