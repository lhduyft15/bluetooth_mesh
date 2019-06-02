package com.siliconlabs.bluetoothmesh.App.Fragments.Scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0015\u0010!\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0000\u00a2\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0019J\u0006\u0010%\u001a\u00020\u001bJ\u0006\u0010&\u001a\u00020\u001bJ\u000e\u0010\'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\bJ\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerDialogsPresenter;", "", "scannerPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerPresenter;", "provisioningModel", "Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningModel;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerPresenter;Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningModel;)V", "TAG", "", "activity", "Landroid/app/Activity;", "meshScannerDialogs", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/MeshScannerDialogsView;", "getMeshScannerDialogs", "()Lcom/siliconlabs/bluetoothmesh/App/Dialogs/MeshScannerDialogsView;", "networks", "", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "provisioningListener", "Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningStatusPropagator$ProvisioningListener;", "getProvisioningModel", "()Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningModel;", "getScannerPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerPresenter;", "spinner_value", "", "configDevice", "", "deviceDescription", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceDescription;", "disconnectProvisioningClicked", "disconnectionCallback", "getDefaultName", "init", "init$android_application_aarDebug", "onNetworkSelected", "position", "onPause", "onResume", "provisionClicked", "deviceName", "validDeviceName", "", "name", "android_application_aarDebug"})
public final class ScannerDialogsPresenter {
    private final java.lang.String TAG = null;
    private android.app.Activity activity;
    private int spinner_value;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Dialogs.MeshScannerDialogsView meshScannerDialogs = null;
    private java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> networks;
    private com.siliconlabs.bluetoothmesh.App.Models.ProvisioningStatusPropagator.ProvisioningListener provisioningListener;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerPresenter scannerPresenter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Models.ProvisioningModel provisioningModel = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Dialogs.MeshScannerDialogsView getMeshScannerDialogs() {
        return null;
    }
    
    public final void init$android_application_aarDebug(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void configDevice(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceDescription deviceDescription, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> networks) {
    }
    
    private final java.lang.String getDefaultName(com.siliconlabs.bluetoothmesh.App.Models.DeviceDescription deviceDescription) {
        return null;
    }
    
    public final void disconnectionCallback() {
    }
    
    public final void onResume() {
    }
    
    public final void onPause() {
    }
    
    public final boolean validDeviceName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public final void provisionClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String deviceName) {
    }
    
    public final void disconnectProvisioningClicked() {
    }
    
    public final void onNetworkSelected(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerPresenter getScannerPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Models.ProvisioningModel getProvisioningModel() {
        return null;
    }
    
    public ScannerDialogsPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerPresenter scannerPresenter, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.ProvisioningModel provisioningModel) {
        super();
    }
}