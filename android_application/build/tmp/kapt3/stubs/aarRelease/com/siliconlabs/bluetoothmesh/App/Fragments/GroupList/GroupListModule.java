package com.siliconlabs.bluetoothmesh.App.Fragments.GroupList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListModule;", "", "()V", "provideGroupListPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListPresenter;", "groupListView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListView;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "meshNetworkManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNetworkManager;", "provideGroupListView", "groupListFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListFragment;", "android_application_aarRelease"})
@dagger.Module()
public final class GroupListModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListView provideGroupListView(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListFragment groupListFragment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListPresenter provideGroupListPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListView groupListView, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNetworkManager meshNetworkManager) {
        return null;
    }
    
    public GroupListModule() {
        super();
    }
}