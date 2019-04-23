package com.siliconlabs.bluetoothmesh.App;

import android.support.v4.app.Fragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigFragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilder_BindDeviceConfigFragment.DeviceConfigFragmentSubcomponent.class
)
public abstract class ActivityBuilder_BindDeviceConfigFragment {
  private ActivityBuilder_BindDeviceConfigFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(DeviceConfigFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      DeviceConfigFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = DeviceConfigModule.class)
  public interface DeviceConfigFragmentSubcomponent extends AndroidInjector<DeviceConfigFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DeviceConfigFragment> {}
  }
}
