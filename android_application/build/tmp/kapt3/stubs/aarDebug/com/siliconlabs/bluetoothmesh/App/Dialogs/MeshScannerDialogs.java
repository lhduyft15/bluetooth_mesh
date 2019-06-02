package com.siliconlabs.bluetoothmesh.App.Dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0018H\u0016J \u0010\"\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0018H\u0016J\u001c\u0010\"\u001a\u00020\u00142\b\b\u0002\u0010(\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006)"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Dialogs/MeshScannerDialogs;", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/MeshScannerDialogsView;", "scannerDialogsPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerDialogsPresenter;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerDialogsPresenter;)V", "activity", "Landroid/app/Activity;", "loadingDialog", "Landroid/app/AlertDialog;", "loadingTextMapping", "Ljava/util/HashMap;", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/MeshScannerDialogsView$LoadingText;", "", "Lkotlin/collections/HashMap;", "networkAdapter", "Landroid/widget/BaseAdapter;", "provisionDialog", "getScannerDialogsPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerDialogsPresenter;", "closeLoadingDialog", "", "closeProvisionDialog", "initLoadingDialog", "isShowingLoading", "", "isShowingProvisioning", "setNetworkAdapter", "showDeviceAlreadyExistDialog", "listener", "Landroid/content/DialogInterface$OnClickListener;", "showLoadingDialog", "showProvisionDialog", "defaultName", "", "updateLoadingText", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "showCloseButton", "loadingText", "status", "message", "android_application_aarDebug"})
public final class MeshScannerDialogs implements com.siliconlabs.bluetoothmesh.App.Dialogs.MeshScannerDialogsView {
    private android.app.AlertDialog provisionDialog;
    private android.widget.BaseAdapter networkAdapter;
    private android.app.AlertDialog loadingDialog;
    private android.app.Activity activity;
    private final java.util.HashMap<com.siliconlabs.bluetoothmesh.App.Dialogs.MeshScannerDialogsView.LoadingText, java.lang.Integer> loadingTextMapping = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerDialogsPresenter scannerDialogsPresenter = null;
    
    @java.lang.Override()
    public void showProvisionDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String defaultName) {
    }
    
    @java.lang.Override()
    public void initLoadingDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void showLoadingDialog() {
    }
    
    @java.lang.Override()
    public void updateLoadingText(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Dialogs.MeshScannerDialogsView.LoadingText loadingText, @org.jetbrains.annotations.NotNull()
    java.lang.String status, boolean showCloseButton) {
    }
    
    @java.lang.Override()
    public void updateLoadingText(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, boolean showCloseButton) {
    }
    
    private final void updateLoadingText(java.lang.String message, boolean showCloseButton) {
    }
    
    @java.lang.Override()
    public void closeProvisionDialog() {
    }
    
    @java.lang.Override()
    public void closeLoadingDialog() {
    }
    
    @java.lang.Override()
    public void setNetworkAdapter(@org.jetbrains.annotations.NotNull()
    android.widget.BaseAdapter networkAdapter) {
    }
    
    @java.lang.Override()
    public void showDeviceAlreadyExistDialog(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener listener) {
    }
    
    @java.lang.Override()
    public boolean isShowingLoading() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isShowingProvisioning() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerDialogsPresenter getScannerDialogsPresenter() {
        return null;
    }
    
    public MeshScannerDialogs(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerDialogsPresenter scannerDialogsPresenter) {
        super();
    }
}