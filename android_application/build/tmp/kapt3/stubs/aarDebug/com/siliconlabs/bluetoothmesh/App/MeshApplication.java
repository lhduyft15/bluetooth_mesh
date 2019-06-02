package com.siliconlabs.bluetoothmesh.App;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\f\u001a\u00020\rH\u0016R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/MeshApplication;", "Landroid/app/Application;", "Ldagger/android/HasActivityInjector;", "()V", "activityDispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getActivityDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setActivityDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "activityInjector", "onCreate", "", "android_application_aarDebug"})
public final class MeshApplication extends android.app.Application implements dagger.android.HasActivityInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityDispatchingAndroidInjector;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getActivityDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setActivityDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    public MeshApplication() {
        super();
    }
}