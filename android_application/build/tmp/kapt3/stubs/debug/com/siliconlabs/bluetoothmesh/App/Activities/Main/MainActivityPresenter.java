package com.siliconlabs.bluetoothmesh.App.Activities.Main;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivityPresenter;", "Lcom/siliconlabs/bluetoothmesh/App/BasePresenter;", "mainActivityView", "Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivityView;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "networkConnectionLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "(Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivityView;Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;)V", "TAG", "", "connectToSubnet", "", "getMeshLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "getNetworkConnectionLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "onPause", "", "onResume", "android_application_debug"})
public final class MainActivityPresenter implements com.siliconlabs.bluetoothmesh.App.BasePresenter {
    private final java.lang.String TAG = null;
    private boolean connectToSubnet;
    private final com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivityView mainActivityView = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic = null;
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic getMeshLogic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic getNetworkConnectionLogic() {
        return null;
    }
    
    public MainActivityPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivityView mainActivityView, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic) {
        super();
    }
}