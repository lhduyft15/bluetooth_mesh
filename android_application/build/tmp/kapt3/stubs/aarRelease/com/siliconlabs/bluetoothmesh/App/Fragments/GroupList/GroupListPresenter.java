package com.siliconlabs.bluetoothmesh.App.Fragments.GroupList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001dJ\u0016\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\u0006\u0010%\u001a\u00020\u0018J\u0006\u0010&\u001a\u00020\u0018J\u0006\u0010\'\u001a\u00020\u0018J\u0016\u0010(\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListPresenter;", "Lcom/siliconlabs/bluetoothmesh/App/BasePresenter;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListAdapter$GroupItemListener;", "groupListView", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListView;", "meshLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;", "meshNetworkManager", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNetworkManager;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListView;Lcom/siliconlabs/bluetoothmesh/App/Logic/MeshLogic;Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNetworkManager;)V", "TAG", "", "subnet", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "taskExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "taskList", "", "Ljava/lang/Runnable;", "addGroup", "", "name", "deleteGroupLocally", "", "group", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "deleteGroups", "groupsInfo", "", "onDeleteClickListener", "groupInfo", "onEditClickListener", "onGroupClickListener", "onGroupClicked", "onPause", "onResume", "refreshList", "startTasks", "takeNextTask", "updateGroup", "newName", "android_application_aarRelease"})
public final class GroupListPresenter implements com.siliconlabs.bluetoothmesh.App.BasePresenter, com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListAdapter.GroupItemListener {
    private final java.lang.String TAG = null;
    private final com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet = null;
    private final java.util.concurrent.ScheduledExecutorService taskExecutor = null;
    private final java.util.List<java.lang.Runnable> taskList = null;
    private final com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListView groupListView = null;
    private final com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic = null;
    private final com.siliconlabs.bluetoothmesh.App.Models.MeshNetworkManager meshNetworkManager = null;
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    public final void refreshList() {
    }
    
    public final void startTasks() {
    }
    
    public final void takeNextTask() {
    }
    
    public final boolean addGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public final void deleteGroups(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.group.Group> groupsInfo) {
    }
    
    public final void deleteGroupLocally(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group group) {
    }
    
    public final boolean updateGroup(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group groupInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String newName) {
        return false;
    }
    
    public final void onGroupClicked(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group group) {
    }
    
    @java.lang.Override()
    public void onDeleteClickListener(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.group.Group> groupInfo) {
    }
    
    @java.lang.Override()
    public void onEditClickListener(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group groupInfo) {
    }
    
    @java.lang.Override()
    public void onGroupClickListener(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group groupInfo) {
    }
    
    public GroupListPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListView groupListView, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.MeshLogic meshLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshNetworkManager meshNetworkManager) {
        super();
    }
}