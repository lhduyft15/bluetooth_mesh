package com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002 !J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\"\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH&J$\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH&\u00a8\u0006\""}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListView;", "", "dismissLoadingDialog", "", "setNetworkList", "networkList", "", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "showAddNetworkDialog", "showDeleteNetworkDialog", "networkInfo", "", "showDeleteNetworkLocallyDialog", "subnet", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "showEditNetworkDialog", "showIntent", "intent", "Landroid/content/Intent;", "showLoadingDialog", "showNetworkFragment", "showToast", "toastMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListView$TOAST_MESSAGE;", "updateLoadingDialogMessage", "loadingMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListView$LOADING_DIALOG_MESSAGE;", "showCloseButton", "", "message", "", "LOADING_DIALOG_MESSAGE", "TOAST_MESSAGE", "android_application_debug"})
public abstract interface NetworkListView {
    
    public abstract void showDeleteNetworkDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> networkInfo);
    
    public abstract void showDeleteNetworkLocallyDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType);
    
    public abstract void showEditNetworkDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet networkInfo);
    
    public abstract void showAddNetworkDialog();
    
    public abstract void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListView.TOAST_MESSAGE toastMessage);
    
    public abstract void setNetworkList(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet> networkList);
    
    public abstract void showIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent);
    
    public abstract void showLoadingDialog();
    
    public abstract void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean showCloseButton);
    
    public abstract void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.NetworkList.NetworkListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, boolean showCloseButton);
    
    public abstract void dismissLoadingDialog();
    
    public abstract void showNetworkFragment();
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListView$LOADING_DIALOG_MESSAGE;", "", "(Ljava/lang/String;I)V", "CONNECTING_TO_NETWORK", "CONNECTING_TO_NETWORK_ERROR", "REMOVING_NETWORK", "REMOVING_NETWORK_ERROR", "android_application_debug"})
    public static enum LOADING_DIALOG_MESSAGE {
        /*public static final*/ CONNECTING_TO_NETWORK /* = new CONNECTING_TO_NETWORK() */,
        /*public static final*/ CONNECTING_TO_NETWORK_ERROR /* = new CONNECTING_TO_NETWORK_ERROR() */,
        /*public static final*/ REMOVING_NETWORK /* = new REMOVING_NETWORK() */,
        /*public static final*/ REMOVING_NETWORK_ERROR /* = new REMOVING_NETWORK_ERROR() */;
        
        LOADING_DIALOG_MESSAGE() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/NetworkList/NetworkListView$TOAST_MESSAGE;", "", "(Ljava/lang/String;I)V", "SUCCESS_DELETE", "SUCCESS_UPDATE", "SUCCESS_ADD", "ERROR_CREATING_NETWORK", "android_application_debug"})
    public static enum TOAST_MESSAGE {
        /*public static final*/ SUCCESS_DELETE /* = new SUCCESS_DELETE() */,
        /*public static final*/ SUCCESS_UPDATE /* = new SUCCESS_UPDATE() */,
        /*public static final*/ SUCCESS_ADD /* = new SUCCESS_ADD() */,
        /*public static final*/ ERROR_CREATING_NETWORK /* = new ERROR_CREATING_NETWORK() */;
        
        TOAST_MESSAGE() {
        }
    }
    
    /**
     * * @author Comarch S.A.
     */
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}