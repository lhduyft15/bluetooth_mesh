package com.siliconlabs.bluetoothmesh.App;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/AppComponent;", "", "inject", "", "app", "Lcom/siliconlabs/bluetoothmesh/App/MeshApplication;", "provisioningModel", "Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningModel;", "Builder", "android_application_aarDebug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.siliconlabs.bluetoothmesh.App.AppModule.class, com.siliconlabs.bluetoothmesh.App.ActivityBuilder.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.MeshApplication app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.ProvisioningModel provisioningModel);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/siliconlabs/bluetoothmesh/App/AppComponent;", "android_application_aarDebug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.siliconlabs.bluetoothmesh.App.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.siliconlabs.bluetoothmesh.App.AppComponent build();
    }
}