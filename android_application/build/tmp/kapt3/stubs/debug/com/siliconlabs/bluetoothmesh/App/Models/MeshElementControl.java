package com.siliconlabs.bluetoothmesh.App.Models;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007&\'()*+,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0018J&\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001fJ\u0016\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001fJ\u0016\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u001fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl;", "", "element", "Lcom/siliconlab/bluetoothmesh/adk/data_model/element/Element;", "group", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "(Lcom/siliconlab/bluetoothmesh/adk/data_model/element/Element;Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;)V", "controlElement", "Lcom/siliconlab/bluetoothmesh/adk/functionality_control/ControlElement;", "getGroup", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "parameters", "Lcom/siliconlab/bluetoothmesh/adk/functionality_control/base/ControlRequestParameters;", "getColorDeltaUv", "", "callback", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$GetColorDeltaUvCallback;", "getColorTemperature", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$GetColorTemperatureCallback;", "getLevel", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$GetLevelCallback;", "getLightness", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$GetLightnessCallback;", "getOnOff", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$GetOnOffCallback;", "setColorTemperature", "lightnessPercentage", "", "temperaturePercentage", "deltaUvPercentage", "callbackPercentage", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$SetCallback;", "setLevel", "levelPercentage", "setLightness", "setOnOff", "on", "", "BaseCallback", "GetColorDeltaUvCallback", "GetColorTemperatureCallback", "GetLevelCallback", "GetLightnessCallback", "GetOnOffCallback", "SetCallback", "android_application_debug"})
public final class MeshElementControl {
    private final com.siliconlab.bluetoothmesh.adk.functionality_control.ControlElement controlElement = null;
    private final com.siliconlab.bluetoothmesh.adk.functionality_control.base.ControlRequestParameters parameters = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlab.bluetoothmesh.adk.data_model.group.Group group = null;
    
    public final void getOnOff(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.GetOnOffCallback callback) {
    }
    
    public final void setOnOff(boolean on, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.SetCallback callback) {
    }
    
    public final void getLevel(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.GetLevelCallback callback) {
    }
    
    public final void setLevel(int levelPercentage, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.SetCallback callback) {
    }
    
    public final void getLightness(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.GetLightnessCallback callback) {
    }
    
    public final void setLightness(int lightnessPercentage, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.SetCallback callback) {
    }
    
    public final void getColorTemperature(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.GetColorTemperatureCallback callback) {
    }
    
    public final void setColorTemperature(int lightnessPercentage, int temperaturePercentage, int deltaUvPercentage, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.SetCallback callbackPercentage) {
    }
    
    public final void getColorDeltaUv(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.GetColorDeltaUvCallback callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlab.bluetoothmesh.adk.data_model.group.Group getGroup() {
        return null;
    }
    
    public MeshElementControl(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.element.Element element, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group group) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$SetCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$BaseCallback;", "android_application_debug"})
    public static abstract interface SetCallback extends com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.BaseCallback {
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$GetOnOffCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$BaseCallback;", "success", "", "on", "", "android_application_debug"})
    public static abstract interface GetOnOffCallback extends com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.BaseCallback {
        
        public abstract void success(boolean on);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$GetLevelCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$BaseCallback;", "success", "", "level", "", "android_application_debug"})
    public static abstract interface GetLevelCallback extends com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.BaseCallback {
        
        public abstract void success(int level);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$GetLightnessCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$BaseCallback;", "success", "", "lightness", "", "android_application_debug"})
    public static abstract interface GetLightnessCallback extends com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.BaseCallback {
        
        public abstract void success(int lightness);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$GetColorTemperatureCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$BaseCallback;", "success", "", "lightness", "", "temperature", "android_application_debug"})
    public static abstract interface GetColorTemperatureCallback extends com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.BaseCallback {
        
        public abstract void success(int lightness, int temperature);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$GetColorDeltaUvCallback;", "Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$BaseCallback;", "success", "", "temperature", "", "deltaUv", "android_application_debug"})
    public static abstract interface GetColorDeltaUvCallback extends com.siliconlabs.bluetoothmesh.App.Models.MeshElementControl.BaseCallback {
        
        public abstract void success(int temperature, int deltaUv);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshElementControl$BaseCallback;", "", "error", "", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "android_application_debug"})
    public static abstract interface BaseCallback {
        
        public abstract void error(@org.jetbrains.annotations.NotNull()
        com.siliconlab.bluetoothmesh.adk.ErrorType error);
    }
}