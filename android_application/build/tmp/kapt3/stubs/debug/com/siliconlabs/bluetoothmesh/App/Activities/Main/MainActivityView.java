package com.siliconlabs.bluetoothmesh.App.Activities.Main;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Activities/Main/MainActivityView;", "", "exportMeshData", "", "shareIntent", "Landroid/content/Intent;", "setActionBar", "title", "", "android_application_debug"})
public abstract interface MainActivityView {
    
    public abstract void exportMeshData(@org.jetbrains.annotations.NotNull()
    android.content.Intent shareIntent);
    
    public abstract void setActionBar(@org.jetbrains.annotations.Nullable()
    java.lang.String title);
    
    /**
     * * @author Comarch S.A.
     */
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}