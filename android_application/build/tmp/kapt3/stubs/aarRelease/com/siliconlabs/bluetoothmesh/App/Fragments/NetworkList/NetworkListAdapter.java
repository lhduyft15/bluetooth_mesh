package com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u000bH\u0016J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListAdapter;", "Lcom/siliconlabs/bluetoothmesh/App/Views/MultiChoiceArrayAdapter;", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "ctx", "Landroid/content/Context;", "networkItemListener", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListAdapter$NetworkItemListener;", "(Landroid/content/Context;Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListAdapter$NetworkItemListener;)V", "addAll", "", "collection", "", "getView", "Landroid/view/View;", "position", "", "convertView", "parent", "Landroid/view/ViewGroup;", "onDeleteClickListener", "item", "", "NetworkInfoComparator", "NetworkItemListener", "ViewHolder", "android_application_aarRelease"})
public final class NetworkListAdapter extends com.siliconlabs.bluetoothmesh.App.Views.MultiChoiceArrayAdapter<com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> {
    private final com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListAdapter.NetworkItemListener networkItemListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void addAll(@org.jetbrains.annotations.Nullable()
    java.util.Collection<? extends com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> collection) {
    }
    
    @java.lang.Override()
    public void onDeleteClickListener(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> item) {
    }
    
    public NetworkListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListAdapter.NetworkItemListener networkItemListener) {
        super(null, 0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\t"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListAdapter$NetworkItemListener;", "", "onDeleteClickListener", "", "networkInfo", "", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "onEditClickListener", "onNetworkClickListener", "android_application_aarRelease"})
    public static abstract interface NetworkItemListener {
        
        public abstract void onDeleteClickListener(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> networkInfo);
        
        public abstract void onEditClickListener(@org.jetbrains.annotations.NotNull()
        com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo);
        
        public abstract void onNetworkClickListener(@org.jetbrains.annotations.NotNull()
        com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "android_application_aarRelease"})
    static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListAdapter$NetworkInfoComparator;", "Ljava/util/Comparator;", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "()V", "compare", "", "o1", "o2", "android_application_aarRelease"})
    public static final class NetworkInfoComparator implements java.util.Comparator<com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> {
        
        @java.lang.Override()
        public int compare(@org.jetbrains.annotations.NotNull()
        com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet o1, @org.jetbrains.annotations.NotNull()
        com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet o2) {
            return 0;
        }
        
        public NetworkInfoComparator() {
            super();
        }
    }
}