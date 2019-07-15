package com.siliconlabs.bluetoothmesh.App.Dialogs;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Dialogs/DeviceEditionDialogsListener;", "", "onDeviceConfigUpdated", "", "meshNode", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "deviceConfig", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;", "exitFromNetworkOnFinish", "", "android_application_aarRelease"})
public abstract interface DeviceEditionDialogsListener {
    
    public abstract void onDeviceConfigUpdated(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode meshNode, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig deviceConfig, boolean exitFromNetworkOnFinish);
    
    /**
     * * @author Comarch S.A.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}