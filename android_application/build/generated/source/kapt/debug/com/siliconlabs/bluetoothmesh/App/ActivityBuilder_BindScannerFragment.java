package com.siliconlabs.bluetoothmesh.App;

import android.support.v4.app.Fragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerFragment;
import com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindScannerFragment.ScannerFragmentSubcomponent.class)
public abstract class ActivityBuilder_BindScannerFragment {
  private ActivityBuilder_BindScannerFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ScannerFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ScannerFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = ScannerModule.class)
  public interface ScannerFragmentSubcomponent extends AndroidInjector<ScannerFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScannerFragment> {}
  }
}
