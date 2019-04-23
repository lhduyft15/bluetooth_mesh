package com.siliconlabs.bluetoothmesh.App;

import android.support.v4.app.Fragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListFragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindDeviceListFragment.DeviceListFragmentSubcomponent.class)
public abstract class ActivityBuilder_BindDeviceListFragment {
  private ActivityBuilder_BindDeviceListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(DeviceListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      DeviceListFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = DeviceListModule.class)
  public interface DeviceListFragmentSubcomponent extends AndroidInjector<DeviceListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DeviceListFragment> {}
  }
}
