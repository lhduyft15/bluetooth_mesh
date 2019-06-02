package com.siliconlabs.bluetoothmesh.App.Fragments.Scanner;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerModule;", "", "()V", "provideScannerPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerPresenter;", "scannerView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerView;", "context", "Landroid/content/Context;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "provisioningModel", "Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningModel;", "bluetoothLeScanLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothScanner;", "bluetoothStateReceiver", "Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothStateReceiver;", "provideScannerView", "scannerFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerFragment;", "android_application_debug"})
@dagger.Module()
public final class ScannerModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerView provideScannerView(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerFragment scannerFragment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerPresenter provideScannerPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerView scannerView, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.ProvisioningModel provisioningModel, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.BluetoothScanner bluetoothLeScanLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.BluetoothStateReceiver bluetoothStateReceiver) {
        return null;
    }
    
    public ScannerModule() {
        super();
    }
}