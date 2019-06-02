package com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListModule;", "", "()V", "provideNetworkListPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListPresenter;", "networkListView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListView;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "meshNetworkManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNetworkManager;", "networkConnectionLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "meshNodeManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "provideNetworkListView", "networkListFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListFragment;", "android_application_aarDebug"})
@dagger.Module()
public final class NetworkListModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListView provideNetworkListView(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListFragment networkListFragment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListPresenter provideNetworkListPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListView networkListView, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNetworkManager meshNetworkManager, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager meshNodeManager) {
        return null;
    }
    
    public NetworkListModule() {
        super();
    }
}