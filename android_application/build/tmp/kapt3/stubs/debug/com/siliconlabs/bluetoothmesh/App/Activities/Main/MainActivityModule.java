package com.siliconlabs.bluetoothmesh.App.Activities.Main;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivityModule;", "", "()V", "provideMainActivityPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivityPresenter;", "mainActivityView", "Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivityView;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "networkConnectionLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "provideMainActivityView", "mainActivity", "Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivity;", "android_application_debug"})
@dagger.Module()
public final class MainActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivityView provideMainActivityView(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivity mainActivity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivityPresenter provideMainActivityPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivityView mainActivityView, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic) {
        return null;
    }
    
    public MainActivityModule() {
        super();
    }
}