package com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001c\u0010/\u001a\u00020)2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00102\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00109\u001a\u00020)H\u0016J\b\u0010:\u001a\u00020)H\u0016J\u001a\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u0002052\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010=\u001a\u00020)H\u0016J\b\u0010>\u001a\u00020)H\u0016J\b\u0010?\u001a\u00020)H\u0016J\u0016\u0010@\u001a\u00020)2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020+0BH\u0016J\u0010\u0010C\u001a\u00020)2\u0006\u0010D\u001a\u00020#H\u0016J\u0010\u0010E\u001a\u00020)2\u0006\u0010F\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u00020)2\u0006\u0010I\u001a\u00020GH\u0016J\u0010\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020#H\u0016J\u0010\u0010L\u001a\u00020)2\u0006\u0010M\u001a\u00020\u001dH\u0016J\u0010\u0010N\u001a\u00020)2\u0006\u0010O\u001a\u00020#H\u0016J\u0016\u0010P\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0QH\u0016J\u0010\u0010R\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010S\u001a\u00020)2\u0006\u0010T\u001a\u00020UH\u0016J\u0010\u0010S\u001a\u00020)2\u0006\u0010V\u001a\u00020\u0007H\u0016J\b\u0010W\u001a\u00020)H\u0016J\u0010\u0010X\u001a\u00020)2\u0006\u0010V\u001a\u00020YH\u0016J\u0010\u0010X\u001a\u00020)2\u0006\u0010Z\u001a\u00020[H\u0016J \u0010\\\u001a\u00020)2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020#H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006a"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupView;", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs$ActivityProvider;", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsPresenter$ParentView;", "()V", "TAG", "", "controlGroupPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupPresenter;", "getControlGroupPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupPresenter;", "setControlGroupPresenter", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupPresenter;)V", "deviceEditionDialogs", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs;", "getDeviceEditionDialogs", "()Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs;", "setDeviceEditionDialogs", "(Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogs;)V", "deviceEditionDialogsPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsPresenter;", "getDeviceEditionDialogsPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsPresenter;", "setDeviceEditionDialogsPresenter", "(Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsPresenter;)V", "devicesListAdapter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter;", "meshIconStatus", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupView$MESH_ICON_STATE;", "meshStatusBtn", "Landroid/widget/ImageView;", "rotate", "Landroid/view/animation/Animation;", "switchEnabled", "", "getSwitchEnabled", "()Z", "setSwitchEnabled", "(Z)V", "notifyItemChanged", "", "deviceInfo", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPause", "onResume", "onViewCreated", "view", "refreshList", "refreshView", "returnToNetworkList", "setDevicesList", "devicesInfo", "", "setMasterControlEnabled", "enabled", "setMasterControlVisibility", "visibility", "", "setMasterLevel", "progress", "setMasterSwitch", "isChecked", "setMeshIconState", "iconState", "setUserVisibleHint", "isVisibleToUser", "showDeleteDeviceDialog", "", "showDeviceConfigDialog", "showErrorToast", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "message", "showLoadingDialog", "showToast", "Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsPresenter$TOAST_MESSAGE;", "toastMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupView$TOAST_MESSAGE;", "updateLoadingDialogMessage", "loadingMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView$LOADING_DIALOG_MESSAGE;", "errorCode", "showCloseButton", "android_application_debug"})
public final class ControlGroupFragment extends dagger.android.support.DaggerFragment implements com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupView, com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogs.ActivityProvider, com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsPresenter.ParentView {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupPresenter controlGroupPresenter;
    private com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListAdapter devicesListAdapter;
    private android.view.animation.Animation rotate;
    private android.widget.ImageView meshStatusBtn;
    private com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupView.MESH_ICON_STATE meshIconStatus;
    @org.jetbrains.annotations.NotNull()
    public com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsPresenter deviceEditionDialogsPresenter;
    @org.jetbrains.annotations.NotNull()
    public com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogs deviceEditionDialogs;
    private boolean switchEnabled;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void refreshList() {
    }
    
    @java.lang.Override()
    public void returnToNetworkList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupPresenter getControlGroupPresenter() {
        return null;
    }
    
    public final void setControlGroupPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupPresenter p0) {
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
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final boolean getSwitchEnabled() {
        return false;
    }
    
    public final void setSwitchEnabled(boolean p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu, @org.jetbrains.annotations.Nullable()
    android.view.MenuInflater inflater) {
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
    public void setMeshIconState(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupView.MESH_ICON_STATE iconState) {
    }
    
    @java.lang.Override()
    public void setMasterSwitch(boolean isChecked) {
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
    public void setMasterLevel(int progress) {
    }
    
    @java.lang.Override()
    public void setMasterControlEnabled(boolean enabled) {
    }
    
    @java.lang.Override()
    public void setMasterControlVisibility(int visibility) {
    }
    
    @java.lang.Override()
    public void refreshView() {
    }
    
    @java.lang.Override()
    public void setDevicesList(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> devicesInfo) {
    }
    
    @java.lang.Override()
    public void notifyItemChanged(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Dialogs.DeviceEditionDialogsPresenter.TOAST_MESSAGE message) {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupView.TOAST_MESSAGE toastMessage) {
    }
    
    @java.lang.Override()
    public void showDeleteDeviceDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> deviceInfo) {
    }
    
    @java.lang.Override()
    public void showDeviceConfigDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
    }
    
    @java.lang.Override()
    public void showLoadingDialog() {
    }
    
    @java.lang.Override()
    public void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String errorCode, boolean showCloseButton) {
    }
    
    public ControlGroupFragment() {
        super();
    }
}