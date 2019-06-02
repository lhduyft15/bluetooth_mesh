package com.siliconlabs.bluetoothmesh.App;

import com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListFragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindDeviceListFragment.DeviceListFragmentSubcomponent.class)
public abstract class ActivityBuilder_BindDeviceListFragment {
  private ActivityBuilder_BindDeviceListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(DeviceListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DeviceListFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = DeviceListModule.class)
  public interface DeviceListFragmentSubcomponent extends AndroidInjector<DeviceListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DeviceListFragment> {}
  }
}
