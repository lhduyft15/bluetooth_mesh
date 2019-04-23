package com.siliconlabs.bluetoothmesh.App;

import android.support.v4.app.Fragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListFragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilder_BindNetworkListFragment.NetworkListFragmentSubcomponent.class
)
public abstract class ActivityBuilder_BindNetworkListFragment {
  private ActivityBuilder_BindNetworkListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(NetworkListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      NetworkListFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = NetworkListModule.class)
  public interface NetworkListFragmentSubcomponent extends AndroidInjector<NetworkListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NetworkListFragment> {}
  }
}
