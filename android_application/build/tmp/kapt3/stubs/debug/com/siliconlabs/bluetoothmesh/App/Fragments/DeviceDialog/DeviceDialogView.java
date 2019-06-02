package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/DeviceDialogView;", "", "showDisableProxyAttentionDialog", "", "deviceConfig", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;", "clickListener", "Landroid/content/DialogInterface$OnClickListener;", "android_application_debug"})
public abstract interface DeviceDialogView {
    
    public abstract void showDisableProxyAttentionDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig deviceConfig, @org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener clickListener);
}