package com.siliconlabs.bluetoothmesh.App;

import com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoFragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindDeviceInfoFragment.DeviceInfoFragmentSubcomponent.class)
public abstract class ActivityBuilder_BindDeviceInfoFragment {
  private ActivityBuilder_BindDeviceInfoFragment() {}

  @Binds
  @IntoMap
  @ClassKey(DeviceInfoFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DeviceInfoFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = DeviceInfoModule.class)
  public interface DeviceInfoFragmentSubcomponent extends AndroidInjector<DeviceInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DeviceInfoFragment> {}
  }
}
