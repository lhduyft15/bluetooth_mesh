package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u001f J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH&J\"\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001dH&J$\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001dH&\u00a8\u0006!"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView;", "", "dismissDeviceConfigDialog", "", "dismissLoadingDialog", "notifyDataSetChanged", "setDevicesList", "newDevicesList", "", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "showDeleteDeviceDialog", "devicesInfos", "", "showDeviceConfigDialog", "deviceInfo", "showErrorToast", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "message", "", "showLoadingDialog", "showToast", "toastMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView$TOAST_MESSAGE;", "startConfigDevice", "updateLoadingDialogMessage", "loadingMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView$LOADING_DIALOG_MESSAGE;", "showCloseButton", "", "errorCode", "LOADING_DIALOG_MESSAGE", "TOAST_MESSAGE", "android_application_aarDebug"})
public abstract interface DeviceListView {
    
    public abstract void setDevicesList(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> newDevicesList);
    
    public abstract void notifyDataSetChanged();
    
    public abstract void showLoadingDialog();
    
    public abstract void dismissLoadingDialog();
    
    public abstract void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String errorCode, boolean showCloseButton);
    
    public abstract void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, boolean showCloseButton);
    
    public abstract void showDeleteDeviceDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> devicesInfos);
    
    public abstract void showDeviceConfigDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo);
    
    public abstract void dismissDeviceConfigDialog();
    
    public abstract void showErrorToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void showErrorToast(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType);
    
    public abstract void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView.TOAST_MESSAGE toastMessage);
    
    public abstract void startConfigDevice(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b+\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+\u00a8\u0006,"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView$LOADING_DIALOG_MESSAGE;", "", "(Ljava/lang/String;I)V", "CONFIG_CONNECTING_ERROR", "CONFIG_CONNECTING", "CONFIG_ERROR", "CONFIG_SUCCESS", "CONFIG_MISSING", "CONFIG_NO_GROUP", "CONFIG_ADDING_TO_GROUP", "CONFIG_ADDED_TO_GROUP", "CONFIG_REMOVING_FROM_GROUP", "CONFIG_REMOVED_FROM_GROUP", "CONFIG_DEVICE_DELETED", "CONFIG_DEVICE_DELETING", "CONFIG_PROXY_ENABLING", "CONFIG_PROXY_DISABLING", "CONFIG_PROXY_ENABLED", "CONFIG_PROXY_DISABLED", "CONFIG_PROXY_DELETED", "CONFIG_PROXY_DISABLING_TIMEOUT", "CONFIG_MODEL_ADDING", "CONFIG_MODEL_REMOVING", "CONFIG_MODEL_ADDED", "CONFIG_MODEL_REMOVED", "CONFIG_MODEL_INVALID_MODEL", "CONFIG_SUBSCRIPTION_ADDING", "CONFIG_SUBSCRIPTION_REMOVING", "CONFIG_PUBLICATION_SETTING", "CONFIG_PUBLICATION_CLEARING", "CONFIG_FRIEND_ENABLING", "CONFIG_FRIEND_ENABLED", "CONFIG_FRIEND_DISABLING", "CONFIG_FRIEND_DISABLED", "CONFIG_CLIENT_IDENTITY_ENABLING", "CONFIG_CLIENT_IDENTITY_DISABLING", "CONFIG_RELAY_ENABLING", "CONFIG_RELAY_DISABLING", "CONFIG_RELAY_ENABLED", "CONFIG_RELAY_DISABLED", "CONFIG_REQUESTING_DCD", "CONFIG_REQUESTING_DCD_TIMEOUT", "CONFIG_REQUESTING_DCD_ERROR", "CONFIG_REQUESTING_DCD_SUCCESS", "android_application_aarDebug"})
    public static enum LOADING_DIALOG_MESSAGE {
        /*public static final*/ CONFIG_CONNECTING_ERROR /* = new CONFIG_CONNECTING_ERROR() */,
        /*public static final*/ CONFIG_CONNECTING /* = new CONFIG_CONNECTING() */,
        /*public static final*/ CONFIG_ERROR /* = new CONFIG_ERROR() */,
        /*public static final*/ CONFIG_SUCCESS /* = new CONFIG_SUCCESS() */,
        /*public static final*/ CONFIG_MISSING /* = new CONFIG_MISSING() */,
        /*public static final*/ CONFIG_NO_GROUP /* = new CONFIG_NO_GROUP() */,
        /*public static final*/ CONFIG_ADDING_TO_GROUP /* = new CONFIG_ADDING_TO_GROUP() */,
        /*public static final*/ CONFIG_ADDED_TO_GROUP /* = new CONFIG_ADDED_TO_GROUP() */,
        /*public static final*/ CONFIG_REMOVING_FROM_GROUP /* = new CONFIG_REMOVING_FROM_GROUP() */,
        /*public static final*/ CONFIG_REMOVED_FROM_GROUP /* = new CONFIG_REMOVED_FROM_GROUP() */,
        /*public static final*/ CONFIG_DEVICE_DELETED /* = new CONFIG_DEVICE_DELETED() */,
        /*public static final*/ CONFIG_DEVICE_DELETING /* = new CONFIG_DEVICE_DELETING() */,
        /*public static final*/ CONFIG_PROXY_ENABLING /* = new CONFIG_PROXY_ENABLING() */,
        /*public static final*/ CONFIG_PROXY_DISABLING /* = new CONFIG_PROXY_DISABLING() */,
        /*public static final*/ CONFIG_PROXY_ENABLED /* = new CONFIG_PROXY_ENABLED() */,
        /*public static final*/ CONFIG_PROXY_DISABLED /* = new CONFIG_PROXY_DISABLED() */,
        /*public static final*/ CONFIG_PROXY_DELETED /* = new CONFIG_PROXY_DELETED() */,
        /*public static final*/ CONFIG_PROXY_DISABLING_TIMEOUT /* = new CONFIG_PROXY_DISABLING_TIMEOUT() */,
        /*public static final*/ CONFIG_MODEL_ADDING /* = new CONFIG_MODEL_ADDING() */,
        /*public static final*/ CONFIG_MODEL_REMOVING /* = new CONFIG_MODEL_REMOVING() */,
        /*public static final*/ CONFIG_MODEL_ADDED /* = new CONFIG_MODEL_ADDED() */,
        /*public static final*/ CONFIG_MODEL_REMOVED /* = new CONFIG_MODEL_REMOVED() */,
        /*public static final*/ CONFIG_MODEL_INVALID_MODEL /* = new CONFIG_MODEL_INVALID_MODEL() */,
        /*public static final*/ CONFIG_SUBSCRIPTION_ADDING /* = new CONFIG_SUBSCRIPTION_ADDING() */,
        /*public static final*/ CONFIG_SUBSCRIPTION_REMOVING /* = new CONFIG_SUBSCRIPTION_REMOVING() */,
        /*public static final*/ CONFIG_PUBLICATION_SETTING /* = new CONFIG_PUBLICATION_SETTING() */,
        /*public static final*/ CONFIG_PUBLICATION_CLEARING /* = new CONFIG_PUBLICATION_CLEARING() */,
        /*public static final*/ CONFIG_FRIEND_ENABLING /* = new CONFIG_FRIEND_ENABLING() */,
        /*public static final*/ CONFIG_FRIEND_ENABLED /* = new CONFIG_FRIEND_ENABLED() */,
        /*public static final*/ CONFIG_FRIEND_DISABLING /* = new CONFIG_FRIEND_DISABLING() */,
        /*public static final*/ CONFIG_FRIEND_DISABLED /* = new CONFIG_FRIEND_DISABLED() */,
        /*public static final*/ CONFIG_CLIENT_IDENTITY_ENABLING /* = new CONFIG_CLIENT_IDENTITY_ENABLING() */,
        /*public static final*/ CONFIG_CLIENT_IDENTITY_DISABLING /* = new CONFIG_CLIENT_IDENTITY_DISABLING() */,
        /*public static final*/ CONFIG_RELAY_ENABLING /* = new CONFIG_RELAY_ENABLING() */,
        /*public static final*/ CONFIG_RELAY_DISABLING /* = new CONFIG_RELAY_DISABLING() */,
        /*public static final*/ CONFIG_RELAY_ENABLED /* = new CONFIG_RELAY_ENABLED() */,
        /*public static final*/ CONFIG_RELAY_DISABLED /* = new CONFIG_RELAY_DISABLED() */,
        /*public static final*/ CONFIG_REQUESTING_DCD /* = new CONFIG_REQUESTING_DCD() */,
        /*public static final*/ CONFIG_REQUESTING_DCD_TIMEOUT /* = new CONFIG_REQUESTING_DCD_TIMEOUT() */,
        /*public static final*/ CONFIG_REQUESTING_DCD_ERROR /* = new CONFIG_REQUESTING_DCD_ERROR() */,
        /*public static final*/ CONFIG_REQUESTING_DCD_SUCCESS /* = new CONFIG_REQUESTING_DCD_SUCCESS() */;
        
        LOADING_DIALOG_MESSAGE() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView$TOAST_MESSAGE;", "", "(Ljava/lang/String;I)V", "ERROR_DELETE_DEVICE", "android_application_aarDebug"})
    public static enum TOAST_MESSAGE {
        /*public static final*/ ERROR_DELETE_DEVICE /* = new ERROR_DELETE_DEVICE() */;
        
        TOAST_MESSAGE() {
        }
    }
    
    /**
     * * @author Comarch S.A.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}