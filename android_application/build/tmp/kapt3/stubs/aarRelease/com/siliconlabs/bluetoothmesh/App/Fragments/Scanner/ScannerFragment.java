package com.siliconlabs.bluetoothmesh.App.Fragments.Scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010#\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u000fH\u0016J\u001a\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\'\u001a\u00020\u000fH\u0002J\u0010\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020,H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006-"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerView;", "()V", "adapter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerAdapter;", "scanMenu", "Landroid/view/MenuItem;", "scannerPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerPresenter;", "getScannerPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerPresenter;", "setScannerPresenter", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerPresenter;)V", "addDevice", "", "deviceDescription", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceDescription;", "clearAdapter", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "onPause", "onResume", "onViewCreated", "view", "setEmptyHint", "setScanMenuToActive", "active", "showToast", "toastMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerView$TOAST_MESSAGE;", "android_application_aarRelease"})
public final class ScannerFragment extends dagger.android.support.DaggerFragment implements com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerView {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerPresenter scannerPresenter;
    private com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerAdapter adapter;
    private android.view.MenuItem scanMenu;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerPresenter getScannerPresenter() {
        return null;
    }
    
    public final void setScannerPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerPresenter p0) {
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
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void addDevice(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceDescription deviceDescription) {
    }
    
    @java.lang.Override()
    public void clearAdapter() {
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
    public void setScanMenuToActive(boolean active) {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerView.TOAST_MESSAGE toastMessage) {
    }
    
    private final void setEmptyHint() {
    }
    
    public ScannerFragment() {
        super();
    }
}