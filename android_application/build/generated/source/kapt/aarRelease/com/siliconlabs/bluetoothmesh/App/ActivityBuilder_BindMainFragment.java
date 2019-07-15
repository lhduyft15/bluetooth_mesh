package com.siliconlabs.bluetoothmesh.App;

import com.siliconlabs.bluetoothmesh.App.Fragments.MainFragment.MainFragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.MainFragment.MainFragmentModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindMainFragment.MainFragmentSubcomponent.class)
public abstract class ActivityBuilder_BindMainFragment {
  private ActivityBuilder_BindMainFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MainFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = MainFragmentModule.class)
  public interface MainFragmentSubcomponent extends AndroidInjector<MainFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainFragment> {}
  }
}
