package com.siliconlabs.bluetoothmesh.App.Fragments.Network;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&\u00a8\u0006\u0018"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkView;", "", "setActionBarTitle", "", "title", "", "setMeshIconState", "iconState", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkView$MESH_ICON_STATE;", "showConfigDeviceFragment", "deviceInfo", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "showErrorToast", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "showFragment", "fragment", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkView$FRAGMENT;", "showToast", "toastMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkView$TOAST_MESSAGE;", "FRAGMENT", "MESH_ICON_STATE", "TOAST_MESSAGE", "android_application_debug"})
public abstract interface NetworkView {
    
    public abstract void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkView.TOAST_MESSAGE toastMessage);
    
    public abstract void showErrorToast(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType);
    
    public abstract void setMeshIconState(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkView.MESH_ICON_STATE iconState);
    
    public abstract void showConfigDeviceFragment(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo);
    
    public abstract void setActionBarTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    public abstract void showFragment(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Network.NetworkView.FRAGMENT fragment);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkView$FRAGMENT;", "", "(Ljava/lang/String;I)V", "GROUP_LIST", "DEVICE_LIST", "android_application_debug"})
    public static enum FRAGMENT {
        /*public static final*/ GROUP_LIST /* = new GROUP_LIST() */,
        /*public static final*/ DEVICE_LIST /* = new DEVICE_LIST() */;
        
        FRAGMENT() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkView$MESH_ICON_STATE;", "", "(Ljava/lang/String;I)V", "DISCONNECTED", "CONNECTING", "CONNECTED", "android_application_debug"})
    public static enum MESH_ICON_STATE {
        /*public static final*/ DISCONNECTED /* = new DISCONNECTED() */,
        /*public static final*/ CONNECTING /* = new CONNECTING() */,
        /*public static final*/ CONNECTED /* = new CONNECTED() */;
        
        MESH_ICON_STATE() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/Network/NetworkView$TOAST_MESSAGE;", "", "(Ljava/lang/String;I)V", "NO_NODE_IN_NETWORK", "NO_PROXY_NODE_IN_NETWORK", "MESH_NETWORK_DISCONNECTED", "GATT_NOT_CONNECTED", "GATT_PROXY_DISCONNECTED", "GATT_ERROR_DISCOVERING_SERVICES", "PROXY_SERVICE_NOT_FOUND", "PROXY_CHARACTERISTIC_NOT_FOUND", "PROXY_DESCRIPTOR_NOT_FOUND", "CONNECTION_TIMEOUT", "android_application_debug"})
    public static enum TOAST_MESSAGE {
        /*public static final*/ NO_NODE_IN_NETWORK /* = new NO_NODE_IN_NETWORK() */,
        /*public static final*/ NO_PROXY_NODE_IN_NETWORK /* = new NO_PROXY_NODE_IN_NETWORK() */,
        /*public static final*/ MESH_NETWORK_DISCONNECTED /* = new MESH_NETWORK_DISCONNECTED() */,
        /*public static final*/ GATT_NOT_CONNECTED /* = new GATT_NOT_CONNECTED() */,
        /*public static final*/ GATT_PROXY_DISCONNECTED /* = new GATT_PROXY_DISCONNECTED() */,
        /*public static final*/ GATT_ERROR_DISCOVERING_SERVICES /* = new GATT_ERROR_DISCOVERING_SERVICES() */,
        /*public static final*/ PROXY_SERVICE_NOT_FOUND /* = new PROXY_SERVICE_NOT_FOUND() */,
        /*public static final*/ PROXY_CHARACTERISTIC_NOT_FOUND /* = new PROXY_CHARACTERISTIC_NOT_FOUND() */,
        /*public static final*/ PROXY_DESCRIPTOR_NOT_FOUND /* = new PROXY_DESCRIPTOR_NOT_FOUND() */,
        /*public static final*/ CONNECTION_TIMEOUT /* = new CONNECTION_TIMEOUT() */;
        
        TOAST_MESSAGE() {
        }
    }
}