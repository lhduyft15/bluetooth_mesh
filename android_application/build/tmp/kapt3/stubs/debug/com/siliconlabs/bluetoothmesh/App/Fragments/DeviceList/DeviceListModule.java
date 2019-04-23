package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListModule;", "", "()V", "provideDeviceListPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListPresenter;", "deviceListView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "networkConnectionLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "meshNodeManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "provideDeviceListView", "deviceListFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListFragment;", "android_application_debug"})
@dagger.Module()
public final class DeviceListModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView provideDeviceListView(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListFragment deviceListFragment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListPresenter provideDeviceListPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView deviceListView, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager meshNodeManager) {
        return null;
    }
    
    public DeviceListModule() {
        super();
    }
}