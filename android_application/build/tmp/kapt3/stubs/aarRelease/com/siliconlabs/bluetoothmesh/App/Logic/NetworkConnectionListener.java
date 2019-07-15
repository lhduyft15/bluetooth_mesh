package com.siliconlabs.bluetoothmesh.App.Logic;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\fJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionListener;", "", "connected", "", "connecting", "connectionErrorMessage", "error", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "connectionMessage", "message", "Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionListener$MESSAGE;", "disconnected", "MESSAGE", "android_application_aarRelease"})
public abstract interface NetworkConnectionListener {
    
    public abstract void connecting();
    
    public abstract void connected();
    
    public abstract void disconnected();
    
    public abstract void connectionMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.NetworkConnectionListener.MESSAGE message);
    
    public abstract void connectionErrorMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType error);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Logic/NetworkConnectionListener$MESSAGE;", "", "(Ljava/lang/String;I)V", "NO_NODE_IN_NETWORK", "GATT_NOT_CONNECTED", "GATT_PROXY_DISCONNECTED", "GATT_ERROR_DISCOVERING_SERVICES", "PROXY_SERVICE_NOT_FOUND", "PROXY_CHARACTERISTIC_NOT_FOUND", "PROXY_DESCRIPTOR_NOT_FOUND", "android_application_aarRelease"})
    public static enum MESSAGE {
        /*public static final*/ NO_NODE_IN_NETWORK /* = new NO_NODE_IN_NETWORK() */,
        /*public static final*/ GATT_NOT_CONNECTED /* = new GATT_NOT_CONNECTED() */,
        /*public static final*/ GATT_PROXY_DISCONNECTED /* = new GATT_PROXY_DISCONNECTED() */,
        /*public static final*/ GATT_ERROR_DISCOVERING_SERVICES /* = new GATT_ERROR_DISCOVERING_SERVICES() */,
        /*public static final*/ PROXY_SERVICE_NOT_FOUND /* = new PROXY_SERVICE_NOT_FOUND() */,
        /*public static final*/ PROXY_CHARACTERISTIC_NOT_FOUND /* = new PROXY_CHARACTERISTIC_NOT_FOUND() */,
        /*public static final*/ PROXY_DESCRIPTOR_NOT_FOUND /* = new PROXY_DESCRIPTOR_NOT_FOUND() */;
        
        MESSAGE() {
        }
    }
}