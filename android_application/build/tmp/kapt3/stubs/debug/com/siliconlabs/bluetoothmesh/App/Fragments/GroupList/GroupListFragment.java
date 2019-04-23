package com.siliconlabs.bluetoothmesh.App.Fragments.GroupList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010!\u001a\u00020\u0011H\u0016J\u0016\u0010\"\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0$H\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u0011H\u0016J\u0016\u0010)\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0*H\u0016J\u0018\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001cH\u0016J\u0010\u0010/\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u00100\u001a\u00020\u0011H\u0016J\u0010\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u000203H\u0016J \u00104\u001a\u00020\u00112\u0006\u00105\u001a\u0002062\u0006\u0010,\u001a\u00020-2\u0006\u00107\u001a\u00020\'H\u0016J \u00104\u001a\u00020\u00112\u0006\u00105\u001a\u0002062\u0006\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020\'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListView;", "()V", "TAG", "", "groupListAdapter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListAdapter;", "groupListPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListPresenter;", "getGroupListPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListPresenter;", "setGroupListPresenter", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListPresenter;)V", "loadingDialog", "Landroid/app/AlertDialog;", "dismissLoadingDialog", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onGroupClickListener", "groupInfo", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "onPause", "onResume", "onViewCreated", "view", "refreshList", "setGroupsList", "groupsInfo", "", "setUserVisibleHint", "isVisibleToUser", "", "showAddGroupDialog", "showDeleteGroupDialog", "", "showDeleteGroupLocallyDialog", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "group", "showEditGroupDialog", "showLoadingDialog", "showToast", "toastMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListView$TOAST_MESSAGE;", "updateLoadingDialogMessage", "loadingMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListView$LOADING_DIALOG_MESSAGE;", "showCloseButton", "message", "android_application_debug"})
public final class GroupListFragment extends dagger.android.support.DaggerFragment implements com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListView {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListPresenter groupListPresenter;
    private com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListAdapter groupListAdapter;
    private android.app.AlertDialog loadingDialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListPresenter getGroupListPresenter() {
        return null;
    }
    
    public final void setGroupListPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListPresenter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void setUserVisibleHint(boolean isVisibleToUser) {
    }
    
    @java.lang.Override()
    public void refreshList() {
    }
    
    @java.lang.Override()
    public void showLoadingDialog() {
    }
    
    @java.lang.Override()
    public void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean showCloseButton) {
    }
    
    @java.lang.Override()
    public void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, boolean showCloseButton) {
    }
    
    @java.lang.Override()
    public void dismissLoadingDialog() {
    }
    
    @java.lang.Override()
    public void setGroupsList(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.siliconlab.bluetoothmesh.adk.data_model.group.Group> groupsInfo) {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListView.TOAST_MESSAGE toastMessage) {
    }
    
    @java.lang.Override()
    public void showAddGroupDialog() {
    }
    
    @java.lang.Override()
    public void showEditGroupDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group groupInfo) {
    }
    
    @java.lang.Override()
    public void showDeleteGroupDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.group.Group> groupInfo) {
    }
    
    @java.lang.Override()
    public void showDeleteGroupLocallyDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group group) {
    }
    
    @java.lang.Override()
    public void onGroupClickListener(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group groupInfo) {
    }
    
    public GroupListFragment() {
        super();
    }
}