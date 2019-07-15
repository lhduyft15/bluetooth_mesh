package com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u0012H\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J\u001a\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0016\u0010%\u001a\u00020\u00122\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\'H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0012H\u0016J\u0016\u0010,\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\u0018\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001eH\u0016J\u0010\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\u0012H\u0016J\b\u00106\u001a\u00020\u0012H\u0016J\u0010\u00107\u001a\u00020\u00122\u0006\u00108\u001a\u000209H\u0016J \u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020<2\u0006\u0010/\u001a\u0002002\u0006\u0010=\u001a\u00020*H\u0016J \u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020<2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020*H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006?"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListAdapter$NetworkItemListener;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListView;", "()V", "TAG", "", "loadingDialog", "Landroid/app/AlertDialog;", "networkListAdapter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListAdapter;", "networkListPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListPresenter;", "getNetworkListPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListPresenter;", "setNetworkListPresenter", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListPresenter;)V", "dismissLoadingDialog", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteClickListener", "networkInfo", "", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "onEditClickListener", "onNetworkClickListener", "onPause", "onResume", "onViewCreated", "view", "setNetworkList", "networkList", "", "setUserVisibleHint", "isVisibleToUser", "", "showAddNetworkDialog", "showDeleteNetworkDialog", "showDeleteNetworkLocallyDialog", "subnet", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "showEditNetworkDialog", "showIntent", "intent", "Landroid/content/Intent;", "showLoadingDialog", "showNetworkFragment", "showToast", "toastMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListView$TOAST_MESSAGE;", "updateLoadingDialogMessage", "loadingMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListView$LOADING_DIALOG_MESSAGE;", "showCloseButton", "message", "android_application_aarRelease"})
public final class NetworkListFragment extends dagger.android.support.DaggerFragment implements com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListAdapter.NetworkItemListener, com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListView {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListPresenter networkListPresenter;
    private com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListAdapter networkListAdapter;
    private android.app.AlertDialog loadingDialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListPresenter getNetworkListPresenter() {
        return null;
    }
    
    public final void setNetworkListPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListPresenter p0) {
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
    public void showDeleteNetworkDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> networkInfo) {
    }
    
    @java.lang.Override()
    public void showDeleteNetworkLocallyDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType) {
    }
    
    @java.lang.Override()
    public void showEditNetworkDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo) {
    }
    
    @java.lang.Override()
    public void showAddNetworkDialog() {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListView.TOAST_MESSAGE toastMessage) {
    }
    
    @java.lang.Override()
    public void setNetworkList(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> networkList) {
    }
    
    @java.lang.Override()
    public void showLoadingDialog() {
    }
    
    @java.lang.Override()
    public void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean showCloseButton) {
    }
    
    @java.lang.Override()
    public void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, boolean showCloseButton) {
    }
    
    @java.lang.Override()
    public void dismissLoadingDialog() {
    }
    
    @java.lang.Override()
    public void onDeleteClickListener(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> networkInfo) {
    }
    
    @java.lang.Override()
    public void onEditClickListener(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo) {
    }
    
    @java.lang.Override()
    public void onNetworkClickListener(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo) {
    }
    
    @java.lang.Override()
    public void showNetworkFragment() {
    }
    
    @java.lang.Override()
    public void showIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public NetworkListFragment() {
        super();
    }
}