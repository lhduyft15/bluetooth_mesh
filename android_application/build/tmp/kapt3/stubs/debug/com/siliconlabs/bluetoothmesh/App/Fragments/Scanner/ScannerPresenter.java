package com.siliconlabs.bluetoothmesh.App.Fragments.Scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u0019H\u0016J\u000e\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\b\u0010/\u001a\u00020)H\u0016J\b\u00100\u001a\u00020)H\u0016J\u0006\u00101\u001a\u00020)J\u0006\u00102\u001a\u00020)R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u00063"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerPresenter;", "Lcom/siliconlabs/bluetoothmesh/App/BasePresenter;", "Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothStateReceiver$BluetoothStateListener;", "scannerView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerView;", "context", "Landroid/content/Context;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "provisioningModel", "Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningModel;", "bluetoothLeScanLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothScanner;", "bluetoothStateReceiver", "Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothStateReceiver;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerView;Landroid/content/Context;Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningModel;Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothScanner;Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothStateReceiver;)V", "getBluetoothLeScanLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothScanner;", "bluetoothMesh", "Lcom/siliconlab/bluetoothmesh/adk/BluetoothMesh;", "getBluetoothStateReceiver", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothStateReceiver;", "getContext", "()Landroid/content/Context;", "fragmentAttached", "", "getFragmentAttached", "()Z", "setFragmentAttached", "(Z)V", "getMeshLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "scanCallback", "Landroid/bluetooth/le/ScanCallback;", "scannerDialogsPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerDialogsPresenter;", "getScannerDialogsPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerDialogsPresenter;", "getScannerView", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerView;", "addDevice", "", "deviceDescription", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceDescription;", "onBluetoothStateChanged", "enabled", "onItemClicked", "onPause", "onResume", "provisioningSuccessful", "startStopScanClicked", "android_application_debug"})
public final class ScannerPresenter implements com.siliconlabs.bluetoothmesh.App.BasePresenter, com.siliconlabs.bluetoothmesh.App.Logic.BluetoothStateReceiver.BluetoothStateListener {
    private boolean fragmentAttached;
    private com.siliconlab.bluetoothmesh.adk.BluetoothMesh bluetoothMesh;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerDialogsPresenter scannerDialogsPresenter = null;
    private final android.bluetooth.le.ScanCallback scanCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerView scannerView = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.BluetoothScanner bluetoothLeScanLogic = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.BluetoothStateReceiver bluetoothStateReceiver = null;
    
    public final boolean getFragmentAttached() {
        return false;
    }
    
    public final void setFragmentAttached(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerDialogsPresenter getScannerDialogsPresenter() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void addDevice(com.siliconlabs.bluetoothmesh.App.Models.DeviceDescription deviceDescription) {
    }
    
    public final void startStopScanClicked() {
    }
    
    public final void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceDescription deviceDescription) {
    }
    
    public final void provisioningSuccessful() {
    }
    
    @java.lang.Override()
    public void onBluetoothStateChanged(boolean enabled) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerView getScannerView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic getMeshLogic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Logic.BluetoothScanner getBluetoothLeScanLogic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Logic.BluetoothStateReceiver getBluetoothStateReceiver() {
        return null;
    }
    
    public ScannerPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerView scannerView, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.ProvisioningModel provisioningModel, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.BluetoothScanner bluetoothLeScanLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.BluetoothStateReceiver bluetoothStateReceiver) {
        super();
    }
}