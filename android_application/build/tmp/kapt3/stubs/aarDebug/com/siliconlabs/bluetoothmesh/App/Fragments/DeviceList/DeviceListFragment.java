package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\b\u0010)\u001a\u00020\u001dH\u0016J\b\u0010*\u001a\u00020\u001dH\u0016J\u001a\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010-\u001a\u00020\u001dH\u0016J\u0006\u0010.\u001a\u00020\u001dJ\b\u0010/\u001a\u00020\u001dH\u0016J\u0016\u00100\u001a\u00020\u001d2\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0016J\u0010\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u000206H\u0016J\u0016\u00107\u001a\u00020\u001d2\f\u00108\u001a\b\u0012\u0004\u0012\u00020309H\u0016J\u0010\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u000203H\u0016J\u0010\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010<\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u0007H\u0016J\b\u0010@\u001a\u00020\u001dH\u0016J\u0010\u0010A\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020BH\u0016J\u0010\u0010A\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u001d2\u0006\u0010;\u001a\u000203H\u0016J \u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020H2\u0006\u0010=\u001a\u00020>2\u0006\u0010I\u001a\u000206H\u0016J \u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020H2\u0006\u0010J\u001a\u00020\u00072\u0006\u0010I\u001a\u000206H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView;", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs$ActivityProvider;", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsPresenter$ParentView;", "()V", "TAG", "", "deviceEditionDialogs", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs;", "getDeviceEditionDialogs", "()Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs;", "setDeviceEditionDialogs", "(Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs;)V", "deviceEditionDialogsPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsPresenter;", "getDeviceEditionDialogsPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsPresenter;", "setDeviceEditionDialogsPresenter", "(Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsPresenter;)V", "deviceListPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListPresenter;", "getDeviceListPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListPresenter;", "setDeviceListPresenter", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListPresenter;)V", "devicesListAdapter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter;", "dismissDeviceConfigDialog", "", "dismissLoadingDialog", "notifyDataSetChanged", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStop", "onViewCreated", "view", "refreshList", "refreshView", "returnToNetworkList", "setDevicesList", "newDevicesList", "", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "setUserVisibleHint", "isVisibleToUser", "", "showDeleteDeviceDialog", "devicesInfos", "", "showDeviceConfigDialog", "deviceInfo", "showErrorToast", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "message", "showLoadingDialog", "showToast", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsPresenter$TOAST_MESSAGE;", "toastMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView$TOAST_MESSAGE;", "startConfigDevice", "updateLoadingDialogMessage", "loadingMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView$LOADING_DIALOG_MESSAGE;", "showCloseButton", "errorCode", "android_application_aarDebug"})
public final class DeviceListFragment extends dagger.android.support.DaggerFragment implements com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView, com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogs.ActivityProvider, com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsPresenter.ParentView {
    @org.jetbrains.annotations.NotNull()
    public com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsPresenter deviceEditionDialogsPresenter;
    @org.jetbrains.annotations.NotNull()
    public com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogs deviceEditionDialogs;
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListPresenter deviceListPresenter;
    private com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListAdapter devicesListAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void startConfigDevice(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsPresenter getDeviceEditionDialogsPresenter() {
        return null;
    }
    
    public final void setDeviceEditionDialogsPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogs getDeviceEditionDialogs() {
        return null;
    }
    
    public final void setDeviceEditionDialogs(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogs p0) {
    }
    
    @java.lang.Override()
    public void showLoadingDialog() {
    }
    
    @java.lang.Override()
    public void dismissLoadingDialog() {
    }
    
    @java.lang.Override()
    public void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String errorCode, boolean showCloseButton) {
    }
    
    @java.lang.Override()
    public void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, boolean showCloseButton) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListPresenter getDeviceListPresenter() {
        return null;
    }
    
    public final void setDeviceListPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListPresenter p0) {
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
    public void onStop() {
    }
    
    @java.lang.Override()
    public void setUserVisibleHint(boolean isVisibleToUser) {
    }
    
    @java.lang.Override()
    public void refreshList() {
    }
    
    @java.lang.Override()
    public void returnToNetworkList() {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsPresenter.TOAST_MESSAGE message) {
    }
    
    public final void refreshView() {
    }
    
    @java.lang.Override()
    public void setDevicesList(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> newDevicesList) {
    }
    
    @java.lang.Override()
    public void notifyDataSetChanged() {
    }
    
    @java.lang.Override()
    public void showDeleteDeviceDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> devicesInfos) {
    }
    
    @java.lang.Override()
    public void showDeviceConfigDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
    }
    
    @java.lang.Override()
    public void dismissDeviceConfigDialog() {
    }
    
    @java.lang.Override()
    public void showErrorToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showErrorToast(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType) {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView.TOAST_MESSAGE toastMessage) {
    }
    
    public DeviceListFragment() {
        super();
    }
}