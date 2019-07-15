package com.siliconlabs.bluetoothmesh.App.Activities.Main;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0014J+\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016\u00a2\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\rH\u0014J\u0006\u0010\"\u001a\u00020\rJ\u0012\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0016J\u001e\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006+"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivityView;", "()V", "TAG", "", "mainActivityPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivityPresenter;", "getMainActivityPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivityPresenter;", "setMainActivityPresenter", "(Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivityPresenter;)V", "checkPermissions", "", "exportMeshData", "shareIntent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onPause", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "returnToNetworkListFragment", "setActionBar", "title", "showFragment", "fragment", "Landroid/support/v4/app/Fragment;", "addToBackStack", "animated", "Companion", "android_application_aarRelease"})
public final class MainActivity extends dagger.android.support.DaggerAppCompatActivity implements com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivityView {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivityPresenter mainActivityPresenter;
    public static final int PERMISSIONS_REQUEST_CODE = 12;
    public static final com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivityPresenter getMainActivityPresenter() {
        return null;
    }
    
    public final void setMainActivityPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivityPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkPermissions() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void showFragment(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, boolean addToBackStack, boolean animated) {
    }
    
    public final void returnToNetworkListFragment() {
    }
    
    @java.lang.Override()
    public void setActionBar(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public void exportMeshData(@org.jetbrains.annotations.NotNull()
    android.content.Intent shareIntent) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivity$Companion;", "", "()V", "PERMISSIONS_REQUEST_CODE", "", "android_application_aarRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}