package com.siliconlabs.bluetoothmesh.App;

import com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkFragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindNetworkFragment.NetworkFragmentSubcomponent.class)
public abstract class ActivityBuilder_BindNetworkFragment {
  private ActivityBuilder_BindNetworkFragment() {}

  @Binds
  @IntoMap
  @ClassKey(NetworkFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NetworkFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = NetworkModule.class)
  public interface NetworkFragmentSubcomponent extends AndroidInjector<NetworkFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NetworkFragment> {}
  }
}
