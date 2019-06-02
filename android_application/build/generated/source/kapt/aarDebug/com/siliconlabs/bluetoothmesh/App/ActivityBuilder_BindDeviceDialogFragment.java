package com.siliconlabs.bluetoothmesh.App;

import com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.DeviceDialogFragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.DeviceDialogModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilder_BindDeviceDialogFragment.DeviceDialogFragmentSubcomponent.class
)
public abstract class ActivityBuilder_BindDeviceDialogFragment {
  private ActivityBuilder_BindDeviceDialogFragment() {}

  @Binds
  @IntoMap
  @ClassKey(DeviceDialogFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DeviceDialogFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = DeviceDialogModule.class)
  public interface DeviceDialogFragmentSubcomponent extends AndroidInjector<DeviceDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DeviceDialogFragment> {}
  }
}
