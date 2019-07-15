package com.siliconlabs.bluetoothmesh.App;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0007J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0015H\u0007\u00a8\u0006\u001d"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/AppModule;", "", "()V", "provideBluetoothScanner", "Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothScanner;", "bluetoothStateReceiver", "Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothStateReceiver;", "provideBluetoothStateReceiver", "context", "Landroid/content/Context;", "provideContext", "application", "Landroid/app/Application;", "provideDeviceFunctionalityDb", "Lcom/siliconlabs/bluetoothmesh/App/Database/DeviceFunctionalityDb;", "provideMeshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "provideMeshNetworkManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNetworkManager;", "meshLogic", "provideMeshNodeManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "deviceFunctionalityDb", "provideNetworkConnectionLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "bluetoothLeScanLogic", "provideProvisioningModel", "Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningModel;", "meshNodeManager", "android_application_aarRelease"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic provideMeshLogic(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Models.MeshNetworkManager provideMeshNetworkManager(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Database.DeviceFunctionalityDb provideDeviceFunctionalityDb(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager provideMeshNodeManager(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Database.DeviceFunctionalityDb deviceFunctionalityDb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic provideNetworkConnectionLogic(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.BluetoothScanner bluetoothLeScanLogic) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Models.ProvisioningModel provideProvisioningModel(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager meshNodeManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Logic.BluetoothStateReceiver provideBluetoothStateReceiver(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Logic.BluetoothScanner provideBluetoothScanner(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.BluetoothStateReceiver bluetoothStateReceiver) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}