package com.siliconlabs.bluetoothmesh.App;

import android.support.v4.app.Fragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListFragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindGroupListFragment.GroupListFragmentSubcomponent.class)
public abstract class ActivityBuilder_BindGroupListFragment {
  private ActivityBuilder_BindGroupListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(GroupListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      GroupListFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = GroupListModule.class)
  public interface GroupListFragmentSubcomponent extends AndroidInjector<GroupListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<GroupListFragment> {}
  }
}
