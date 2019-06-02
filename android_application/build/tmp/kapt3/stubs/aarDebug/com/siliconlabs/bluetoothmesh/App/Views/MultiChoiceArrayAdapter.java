package com.siliconlabs.bluetoothmesh.App.Views;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u001c\u0010\u0018\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0016\u0010\u001e\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH&J\u0012\u0010 \u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J*\u0010!\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\fH\u0016J\u001c\u0010&\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\'\u001a\u00020\u0016H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\fH\u0002J\u0018\u0010*\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\fH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006+"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Views/MultiChoiceArrayAdapter;", "T", "Landroid/widget/ArrayAdapter;", "Landroid/widget/AbsListView$MultiChoiceModeListener;", "ctx", "Landroid/content/Context;", "resourceId", "", "(Landroid/content/Context;I)V", "mode", "Landroid/view/ActionMode;", "multipleMode", "", "getMultipleMode", "()Z", "setMultipleMode", "(Z)V", "selectedItemsIds", "Landroid/util/SparseBooleanArray;", "getSelectedItemsIds", "()Landroid/util/SparseBooleanArray;", "finishActionMode", "", "getSelectedIds", "onActionItemClicked", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDeleteClickListener", "", "onDestroyActionMode", "onItemCheckedStateChanged", "position", "id", "", "checked", "onPrepareActionMode", "removeSelection", "setEditMode", "enabled", "toggleSelection", "android_application_aarDebug"})
public abstract class MultiChoiceArrayAdapter<T extends java.lang.Object> extends android.widget.ArrayAdapter<T> implements android.widget.AbsListView.MultiChoiceModeListener {
    @org.jetbrains.annotations.NotNull()
    private final android.util.SparseBooleanArray selectedItemsIds = null;
    private boolean multipleMode;
    private android.view.ActionMode mode;
    
    @org.jetbrains.annotations.NotNull()
    public final android.util.SparseBooleanArray getSelectedItemsIds() {
        return null;
    }
    
    public final boolean getMultipleMode() {
        return false;
    }
    
    public final void setMultipleMode(boolean p0) {
    }
    
    public abstract void onDeleteClickListener(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> item);
    
    @java.lang.Override()
    public boolean onActionItemClicked(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onItemCheckedStateChanged(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode, int position, long id, boolean checked) {
    }
    
    @java.lang.Override()
    public boolean onCreateActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode) {
    }
    
    public final void finishActionMode() {
    }
    
    private final void setEditMode(boolean enabled) {
    }
    
    private final void toggleSelection(int position, boolean checked) {
    }
    
    private final android.util.SparseBooleanArray getSelectedIds() {
        return null;
    }
    
    private final void removeSelection() {
    }
    
    public MultiChoiceArrayAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, int resourceId) {
        super(null, 0);
    }
}