package com.siliconlabs.bluetoothmesh.App.Models;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007#$%&\'()B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0016J&\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u001cJ\u0016\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u001cJ\u0016\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl;", "", "group", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "(Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;)V", "controlGroup", "Lcom/siliconlab/bluetoothmesh/adk/functionality_control/ControlGroup;", "getGroup", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "parameters", "Lcom/siliconlab/bluetoothmesh/adk/functionality_control/base/ControlRequestParameters;", "getColorDeltaUv", "", "callback", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$GetColorDeltaUvCallback;", "getColorTemperature", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$GetColorTemperatureCallback;", "getLevel", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$GetLevelCallback;", "getLightness", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$GetLightnessCallback;", "getOnOff", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$GetOnOffCallback;", "setColorTemperature", "lightnessPercentage", "", "temperaturePercentage", "deltaUvPercentage", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$SetCallback;", "setLevel", "levelPercentage", "setLightness", "setOnOff", "on", "", "BaseCallback", "GetColorDeltaUvCallback", "GetColorTemperatureCallback", "GetLevelCallback", "GetLightnessCallback", "GetOnOffCallback", "SetCallback", "android_application_debug"})
public final class MeshGroupControl {
    private final com.siliconlab.bluetoothmesh.adk.functionality_control.ControlGroup controlGroup = null;
    private final com.siliconlab.bluetoothmesh.adk.functionality_control.base.ControlRequestParameters parameters = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlab.bluetoothmesh.adk.data_model.group.Group group = null;
    
    public final void getOnOff(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.GetOnOffCallback callback) {
    }
    
    public final void setOnOff(boolean on, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.SetCallback callback) {
    }
    
    public final void getLevel(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.GetLevelCallback callback) {
    }
    
    public final void setLevel(int levelPercentage, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.SetCallback callback) {
    }
    
    public final void getLightness(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.GetLightnessCallback callback) {
    }
    
    public final void setLightness(int lightnessPercentage, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.SetCallback callback) {
    }
    
    public final void getColorTemperature(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.GetColorTemperatureCallback callback) {
    }
    
    public final void setColorTemperature(int lightnessPercentage, int temperaturePercentage, int deltaUvPercentage, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.SetCallback callback) {
    }
    
    public final void getColorDeltaUv(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.GetColorDeltaUvCallback callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlab.bluetoothmesh.adk.data_model.group.Group getGroup() {
        return null;
    }
    
    public MeshGroupControl(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group group) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$SetCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$BaseCallback;", "android_application_debug"})
    public static abstract interface SetCallback extends com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.BaseCallback {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$GetOnOffCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$BaseCallback;", "success", "", "on", "", "android_application_debug"})
    public static abstract interface GetOnOffCallback extends com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.BaseCallback {
        
        public abstract void success(boolean on);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$GetLevelCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$BaseCallback;", "success", "", "level", "", "android_application_debug"})
    public static abstract interface GetLevelCallback extends com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.BaseCallback {
        
        public abstract void success(int level);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$GetLightnessCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$BaseCallback;", "success", "", "lightness", "", "android_application_debug"})
    public static abstract interface GetLightnessCallback extends com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.BaseCallback {
        
        public abstract void success(int lightness);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$GetColorTemperatureCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$BaseCallback;", "success", "", "lightness", "", "temperature", "android_application_debug"})
    public static abstract interface GetColorTemperatureCallback extends com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.BaseCallback {
        
        public abstract void success(int lightness, int temperature);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$GetColorDeltaUvCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$BaseCallback;", "success", "", "temperature", "", "deltaUv", "android_application_debug"})
    public static abstract interface GetColorDeltaUvCallback extends com.siliconlabs.bluetoothmesh.App.Models.MeshGroupControl.BaseCallback {
        
        public abstract void success(int temperature, int deltaUv);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshGroupControl$BaseCallback;", "", "error", "", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "android_application_debug"})
    public static abstract interface BaseCallback {
        
        public abstract void error(@org.jetbrains.annotations.NotNull()
        com.siliconlab.bluetoothmesh.adk.ErrorType error);
    }
}