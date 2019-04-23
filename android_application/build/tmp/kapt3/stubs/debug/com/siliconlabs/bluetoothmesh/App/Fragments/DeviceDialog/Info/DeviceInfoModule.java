package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Info/DeviceInfoModule;", "", "()V", "provideDeviceInfoPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Info/DeviceInfoPresenter;", "deviceInfoView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Info/DeviceInfoView;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "provideDeviceInfoView", "deviceInfoFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Info/DeviceInfoFragment;", "android_application_debug"})
@dagger.Module()
public final class DeviceInfoModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoView provideDeviceInfoView(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoFragment deviceInfoFragment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoPresenter provideDeviceInfoPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoView deviceInfoView, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic) {
        return null;
    }
    
    public DeviceInfoModule() {
        super();
    }
}