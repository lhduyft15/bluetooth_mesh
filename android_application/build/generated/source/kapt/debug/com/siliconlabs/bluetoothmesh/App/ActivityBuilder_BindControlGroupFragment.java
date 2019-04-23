package com.siliconlabs.bluetoothmesh.App;

import android.support.v4.app.Fragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupFragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilder_BindControlGroupFragment.ControlGroupFragmentSubcomponent.class
)
public abstract class ActivityBuilder_BindControlGroupFragment {
  private ActivityBuilder_BindControlGroupFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ControlGroupFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ControlGroupFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = ControlGroupModule.class)
  public interface ControlGroupFragmentSubcomponent extends AndroidInjector<ControlGroupFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ControlGroupFragment> {}
  }
}
