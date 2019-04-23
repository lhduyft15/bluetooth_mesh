package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigListener;", "", "getDeviceConfig", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;", "onDeviceNameErrorMessage", "", "message", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigListener$ERROR_MESSAGE;", "ERROR_MESSAGE", "android_application_debug"})
public abstract interface DeviceConfigListener {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig getDeviceConfig();
    
    public abstract void onDeviceNameErrorMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config.DeviceConfigListener.ERROR_MESSAGE message);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigListener$ERROR_MESSAGE;", "", "(Ljava/lang/String;I)V", "DEVICE_NAME_EMPTY", "android_application_debug"})
    public static enum ERROR_MESSAGE {
        /*public static final*/ DEVICE_NAME_EMPTY /* = new DEVICE_NAME_EMPTY() */;
        
        ERROR_MESSAGE() {
        }
    }
}