package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u001d\u001e\u001f !\"B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter;", "Lcom/siliconlabs/bluetoothmesh/App/Views/MultiChoiceArrayAdapter;", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "ctx", "Landroid/content/Context;", "networkConnectionLogic", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;", "deviceItemListener", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter$DeviceItemListener;", "(Landroid/content/Context;Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionLogic;Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter$DeviceItemListener;)V", "addAll", "", "collection", "", "getView", "Landroid/view/View;", "position", "", "convertView", "parent", "Landroid/view/ViewGroup;", "onDeleteClickListener", "item", "", "setEnabledControls", "view", "enabled", "", "setEnabledView", "CTLControlChangeListener", "ClickDeviceImageListener", "ControlChangeListener", "DeviceInfoComparator", "DeviceItemListener", "ViewHolder", "android_application_aarRelease"})
public final class DeviceListAdapter extends com.siliconlabs.bluetoothmesh.App.Views.MultiChoiceArrayAdapter<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> {
    private final com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic = null;
    private final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListAdapter.DeviceItemListener deviceItemListener = null;
    
    @java.lang.Override()
    public void onDeleteClickListener(@org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void addAll(@org.jetbrains.annotations.Nullable()
    java.util.Collection<? extends com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> collection) {
    }
    
    private final void setEnabledControls(android.view.View view, boolean enabled) {
    }
    
    private final void setEnabledView(android.view.View view, boolean enabled) {
    }
    
    public DeviceListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionLogic networkConnectionLogic, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListAdapter.DeviceItemListener deviceItemListener) {
        super(null, 0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter$CTLControlChangeListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "deviceInfo", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "levelSeekBar", "Landroid/widget/SeekBar;", "temperatureSeekBar", "uvSeekBar", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter;Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;Landroid/widget/SeekBar;Landroid/widget/SeekBar;Landroid/widget/SeekBar;)V", "onProgressChanged", "", "seekBar", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "android_application_aarRelease"})
    public final class CTLControlChangeListener implements android.widget.SeekBar.OnSeekBarChangeListener {
        private final com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo = null;
        private final android.widget.SeekBar levelSeekBar = null;
        private final android.widget.SeekBar temperatureSeekBar = null;
        private final android.widget.SeekBar uvSeekBar = null;
        
        @java.lang.Override()
        public void onProgressChanged(@org.jetbrains.annotations.Nullable()
        android.widget.SeekBar seekBar, int progress, boolean fromUser) {
        }
        
        @java.lang.Override()
        public void onStartTrackingTouch(@org.jetbrains.annotations.Nullable()
        android.widget.SeekBar seekBar) {
        }
        
        @java.lang.Override()
        public void onStopTrackingTouch(@org.jetbrains.annotations.Nullable()
        android.widget.SeekBar seekBar) {
        }
        
        public CTLControlChangeListener(@org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo, @org.jetbrains.annotations.NotNull()
        android.widget.SeekBar levelSeekBar, @org.jetbrains.annotations.NotNull()
        android.widget.SeekBar temperatureSeekBar, @org.jetbrains.annotations.NotNull()
        android.widget.SeekBar uvSeekBar) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter$ControlChangeListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "deviceInfo", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter;Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;)V", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "android_application_aarRelease"})
    public final class ControlChangeListener implements android.widget.SeekBar.OnSeekBarChangeListener {
        private final com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo = null;
        
        @java.lang.Override()
        public void onProgressChanged(@org.jetbrains.annotations.Nullable()
        android.widget.SeekBar seekBar, int progress, boolean fromUser) {
        }
        
        @java.lang.Override()
        public void onStartTrackingTouch(@org.jetbrains.annotations.Nullable()
        android.widget.SeekBar seekBar) {
        }
        
        @java.lang.Override()
        public void onStopTrackingTouch(@org.jetbrains.annotations.Nullable()
        android.widget.SeekBar seekBar) {
        }
        
        public ControlChangeListener(@org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter$ClickDeviceImageListener;", "Landroid/view/View$OnClickListener;", "deviceInfo", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter;Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;)V", "onClick", "", "v", "Landroid/view/View;", "android_application_aarRelease"})
    public final class ClickDeviceImageListener implements android.view.View.OnClickListener {
        private final com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo = null;
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        public ClickDeviceImageListener(@org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J5\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter$DeviceItemListener;", "", "onClickDeviceImageListener", "", "deviceInfo", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "onConfigClickListener", "onDeleteClickListener", "", "onSeekBarChangeListener", "levelPercentage", "", "temperaturePercentage", "deltaUvPercentage", "(Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;ILjava/lang/Integer;Ljava/lang/Integer;)V", "android_application_aarRelease"})
    public static abstract interface DeviceItemListener {
        
        public abstract void onClickDeviceImageListener(@org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo);
        
        public abstract void onSeekBarChangeListener(@org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo, int levelPercentage, @org.jetbrains.annotations.Nullable()
        java.lang.Integer temperaturePercentage, @org.jetbrains.annotations.Nullable()
        java.lang.Integer deltaUvPercentage);
        
        public abstract void onDeleteClickListener(@org.jetbrains.annotations.NotNull()
        java.util.List<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> deviceInfo);
        
        public abstract void onConfigClickListener(@org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo);
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "android_application_aarRelease"})
    static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListAdapter$DeviceInfoComparator;", "Ljava/util/Comparator;", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "()V", "compare", "", "o1", "o2", "android_application_aarRelease"})
    public static final class DeviceInfoComparator implements java.util.Comparator<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> {
        
        @java.lang.Override()
        public int compare(@org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode o1, @org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode o2) {
            return 0;
        }
        
        public DeviceInfoComparator() {
            super();
        }
    }
}