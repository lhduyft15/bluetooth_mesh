package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Config;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u001a\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0013\u001a\u00020\u0003H&\u00a8\u0006\u0014"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Config/DeviceConfigView;", "", "dismissLoadingDialog", "", "setDeviceConfig", "deviceInfo", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "groupsInfo", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;", "groupsInSubnet", "", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "setLoadingDialogMessage", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "showCloseButton", "", "message", "", "showLoadingDialog", "android_application_aarRelease"})
public abstract interface DeviceConfigView {
    
    public abstract void setDeviceConfig(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig groupsInfo, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.group.Group> groupsInSubnet);
    
    public abstract void showLoadingDialog();
    
    public abstract void setLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean showCloseButton);
    
    public abstract void setLoadingDialogMessage(@org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, boolean showCloseButton);
    
    public abstract void dismissLoadingDialog();
}