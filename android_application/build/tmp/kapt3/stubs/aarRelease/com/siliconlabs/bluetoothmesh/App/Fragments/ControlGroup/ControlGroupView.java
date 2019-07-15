package com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002()J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000fH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\fH&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0016\u0010\u0017\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u0003H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H&J$\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u001e2\b\b\u0002\u0010\'\u001a\u00020\fH&\u00a8\u0006*"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupView;", "", "notifyItemChanged", "", "deviceInfo", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "refreshView", "setDevicesList", "devicesInfo", "", "setMasterControlEnabled", "enabled", "", "setMasterControlVisibility", "visibility", "", "setMasterLevel", "progress", "setMasterSwitch", "isChecked", "setMeshIconState", "iconState", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupView$MESH_ICON_STATE;", "showDeleteDeviceDialog", "", "showDeviceConfigDialog", "showErrorToast", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "message", "", "showLoadingDialog", "showToast", "toastMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupView$TOAST_MESSAGE;", "updateLoadingDialogMessage", "loadingMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceList/DeviceListView$LOADING_DIALOG_MESSAGE;", "errorCode", "showCloseButton", "MESH_ICON_STATE", "TOAST_MESSAGE", "android_application_aarRelease"})
public abstract interface ControlGroupView {
    
    public abstract void refreshView();
    
    public abstract void setMeshIconState(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupView.MESH_ICON_STATE iconState);
    
    public abstract void setMasterSwitch(boolean isChecked);
    
    public abstract void setMasterLevel(int progress);
    
    public abstract void setMasterControlEnabled(boolean enabled);
    
    public abstract void setMasterControlVisibility(int visibility);
    
    public abstract void setDevicesList(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> devicesInfo);
    
    public abstract void notifyItemChanged(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo);
    
    public abstract void showErrorToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void showErrorToast(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType);
    
    public abstract void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.ControlGroup.ControlGroupView.TOAST_MESSAGE toastMessage);
    
    public abstract void showDeleteDeviceDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> deviceInfo);
    
    public abstract void showDeviceConfigDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo);
    
    public abstract void showLoadingDialog();
    
    public abstract void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceList.DeviceListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String errorCode, boolean showCloseButton);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupView$MESH_ICON_STATE;", "", "(Ljava/lang/String;I)V", "DISCONNECTED", "CONNECTING", "CONNECTED", "android_application_aarRelease"})
    public static enum MESH_ICON_STATE {
        /*public static final*/ DISCONNECTED /* = new DISCONNECTED() */,
        /*public static final*/ CONNECTING /* = new CONNECTING() */,
        /*public static final*/ CONNECTED /* = new CONNECTED() */;
        
        MESH_ICON_STATE() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/ControlGroup/ControlGroupView$TOAST_MESSAGE;", "", "(Ljava/lang/String;I)V", "NOT_CONNECTED_TO_MESH_NETWORK", "TO_DO", "android_application_aarRelease"})
    public static enum TOAST_MESSAGE {
        /*public static final*/ NOT_CONNECTED_TO_MESH_NETWORK /* = new NOT_CONNECTED_TO_MESH_NETWORK() */,
        /*public static final*/ TO_DO /* = new TO_DO() */;
        
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