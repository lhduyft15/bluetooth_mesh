package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u0019H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\u0018\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000700H\u0016R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u00061"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/DeviceDialogFragment;", "Landroid/support/v4/app/DialogFragment;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/DeviceDialogView;", "Ldagger/android/support/HasSupportFragmentInjector;", "()V", "childFragmentInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/support/v4/app/Fragment;", "getChildFragmentInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setChildFragmentInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "deviceDialogPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/DeviceDialogPresenter;", "getDeviceDialogPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/DeviceDialogPresenter;", "setDeviceDialogPresenter", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/DeviceDialogPresenter;)V", "deviceEditionDialogsListener", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsListener;", "getDeviceEditionDialogsListener", "()Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsListener;", "setDeviceEditionDialogsListener", "(Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsListener;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onPause", "onResume", "showDisableProxyAttentionDialog", "deviceConfig", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;", "clickListener", "Landroid/content/DialogInterface$OnClickListener;", "supportFragmentInjector", "Ldagger/android/AndroidInjector;", "android_application_debug"})
public final class DeviceDialogFragment extends android.support.v4.app.DialogFragment implements com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.DeviceDialogView, dagger.android.support.HasSupportFragmentInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> childFragmentInjector;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.DeviceDialogPresenter deviceDialogPresenter;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsListener deviceEditionDialogsListener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> getChildFragmentInjector() {
        return null;
    }
    
    public final void setChildFragmentInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.DeviceDialogPresenter getDeviceDialogPresenter() {
        return null;
    }
    
    public final void setDeviceDialogPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.DeviceDialogPresenter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsListener getDeviceEditionDialogsListener() {
        return null;
    }
    
    public final void setDeviceEditionDialogsListener(@org.jetbrains.annotations.Nullable()
    com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsListener p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.Nullable()
    android.content.DialogInterface dialog) {
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
    public void showDisableProxyAttentionDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig deviceConfig, @org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener clickListener) {
    }
    
    public DeviceDialogFragment() {
        super();
    }
}