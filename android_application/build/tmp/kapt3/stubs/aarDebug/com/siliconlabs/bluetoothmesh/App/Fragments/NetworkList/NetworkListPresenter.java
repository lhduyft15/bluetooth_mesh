package com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000eJ\u0014\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\"J\u000e\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\"J\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\"J\b\u0010\'\u001a\u00020\u001fH\u0016J\b\u0010(\u001a\u00020\u001fH\u0016J\b\u0010)\u001a\u00020\u001fH\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\"H\u0002J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\"H\u0002J\u000e\u0010,\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\"J\u0006\u0010-\u001a\u00020\u001fJ\u0006\u0010.\u001a\u00020\u001fJ\u0016\u0010/\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\"2\u0006\u00100\u001a\u00020\u000eR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListPresenter;", "Lcom/siliconlabs/bluetoothmesh/App/BasePresenter;", "networkListView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListView;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "meshNetworkManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNetworkManager;", "networkConnectionLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "meshNodeManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListView;Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNetworkManager;Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;)V", "TAG", "", "getMeshNodeManager", "()Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "network", "Lcom/siliconlab/bluetoothmesh/adk/data_model/network/Network;", "getNetworkConnectionLogic", "()Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "taskExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "taskList", "", "Ljava/lang/Runnable;", "addNetwork", "", "name", "deleteNetwork", "", "networkInfo", "", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "deleteNetworkLocally", "subnet", "exportNetwork", "networkClicked", "onPause", "onResume", "refreshList", "removeNetwork", "removeNetworkWithNodes", "removeNodesFunc", "startTasks", "takeNextTask", "updateNetwork", "newName", "android_application_aarDebug"})
public final class NetworkListPresenter implements com.siliconlabs.bluetoothmesh.App.BasePresenter {
    private final java.lang.String TAG = null;
    private final com.siliconlab.bluetoothmesh.adk.data_model.network.Network network = null;
    private final java.util.concurrent.ScheduledExecutorService taskExecutor = null;
    private final java.util.List<java.lang.Runnable> taskList = null;
    private final com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListView networkListView = null;
    private final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic = null;
    private final com.siliconlabs.bluetoothmesh.App.Models.MeshNetworkManager meshNetworkManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager meshNodeManager = null;
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void refreshList() {
    }
    
    public final void startTasks() {
    }
    
    public final void takeNextTask() {
    }
    
    public final boolean addNetwork(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public final boolean updateNetwork(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String newName) {
        return false;
    }
    
    public final void deleteNetwork(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> networkInfo) {
    }
    
    public final void deleteNetworkLocally(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet) {
    }
    
    private final void removeNetwork(com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet) {
    }
    
    private final void removeNetworkWithNodes(com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet) {
    }
    
    public final void removeNodesFunc(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet) {
    }
    
    public final void exportNetwork(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo) {
    }
    
    public final void networkClicked(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic getNetworkConnectionLogic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager getMeshNodeManager() {
        return null;
    }
    
    public NetworkListPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListView networkListView, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNetworkManager meshNetworkManager, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNodeManager meshNodeManager) {
        super();
    }
}