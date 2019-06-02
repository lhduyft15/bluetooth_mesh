package com.siliconlabs.bluetoothmesh.App;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'\u00a8\u0006\u0019"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/ActivityBuilder;", "", "()V", "bindControlGroupFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupFragment;", "bindDeviceConfigFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigFragment;", "bindDeviceDialogFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/DeviceDialogFragment;", "bindDeviceInfoFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Info/DeviceInfoFragment;", "bindDeviceListFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListFragment;", "bindGroupListFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListFragment;", "bindMainActivity", "Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivity;", "bindMainFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/MainFragment/MainFragment;", "bindNetworkFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkFragment;", "bindNetworkListFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListFragment;", "bindScannerFragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerFragment;", "android_application_debug"})
@dagger.Module()
public abstract class ActivityBuilder {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivityModule.class})
    public abstract com.siliconlabs.bluetoothmesh.App.Activities.Main.MainActivity bindMainActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconlabs.bluetoothmesh.App.Fragments.MainFragment.MainFragmentModule.class})
    public abstract com.siliconlabs.bluetoothmesh.App.Fragments.MainFragment.MainFragment bindMainFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkModule.class})
    public abstract com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkFragment bindNetworkFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListModule.class})
    public abstract com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListFragment bindDeviceListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListModule.class})
    public abstract com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListFragment bindGroupListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerModule.class})
    public abstract com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerFragment bindScannerFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListModule.class})
    public abstract com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListFragment bindNetworkListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.DeviceDialogModule.class})
    public abstract com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.DeviceDialogFragment bindDeviceDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoModule.class})
    public abstract com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoFragment bindDeviceInfoFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigModule.class})
    public abstract com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigFragment bindDeviceConfigFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupModule.class})
    public abstract com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupFragment bindControlGroupFragment();
    
    public ActivityBuilder() {
        super();
    }
}