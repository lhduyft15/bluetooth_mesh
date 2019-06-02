package com.siliconlabs.bluetoothmesh.App.Fragments.Network;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u0015H\u0016J\b\u0010(\u001a\u00020\u0015H\u0016J\u001a\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u000e\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u0007H\u0016J\u0010\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020;H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkView;", "()V", "TAG", "", "meshIconStatus", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkView$MESH_ICON_STATE;", "meshStatusBtn", "Landroid/widget/ImageView;", "networkPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkPresenter;", "getNetworkPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkPresenter;", "setNetworkPresenter", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkPresenter;)V", "pageAdapter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkPageAdapter;", "rotate", "Landroid/view/animation/Animation;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onViewCreated", "view", "refreshFragment", "fragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkView$FRAGMENT;", "setActionBarTitle", "title", "setMeshIconState", "iconState", "showConfigDeviceFragment", "deviceInfo", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "showErrorToast", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "showFragment", "showToast", "toastMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkView$TOAST_MESSAGE;", "android_application_aarDebug"})
public final class NetworkFragment extends dagger.android.support.DaggerFragment implements com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkView {
    private final java.lang.String TAG = null;
    private android.view.animation.Animation rotate;
    private android.widget.ImageView meshStatusBtn;
    private com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkView.MESH_ICON_STATE meshIconStatus;
    private com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkPageAdapter pageAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkPresenter networkPresenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkPresenter getNetworkPresenter() {
        return null;
    }
    
    public final void setNetworkPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkPresenter p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
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
    public void onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu, @org.jetbrains.annotations.Nullable()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void showFragment(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkView.FRAGMENT fragment) {
    }
    
    @java.lang.Override()
    public void setActionBarTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public void setMeshIconState(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkView.MESH_ICON_STATE iconState) {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkView.TOAST_MESSAGE toastMessage) {
    }
    
    @java.lang.Override()
    public void showErrorToast(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType) {
    }
    
    @java.lang.Override()
    public void showConfigDeviceFragment(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
    }
    
    public final void refreshFragment(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkView.FRAGMENT fragment) {
    }
    
    public NetworkFragment() {
        super();
    }
}