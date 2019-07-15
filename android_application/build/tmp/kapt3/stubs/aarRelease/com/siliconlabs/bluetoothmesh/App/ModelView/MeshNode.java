package com.siliconlabs.bluetoothmesh.App.ModelView;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010-\u001a\u00020#2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0006H\u00d6\u0001J\t\u00100\u001a\u000201H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010\n\u00a8\u00062"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "", "node", "Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "(Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;)V", "alarmSignal", "", "getAlarmSignal", "()I", "setAlarmSignal", "(I)V", "battery", "getBattery", "setBattery", "deltaUvPercentage", "getDeltaUvPercentage", "setDeltaUvPercentage", "functionality", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$FUNCTIONALITY;", "getFunctionality", "()Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$FUNCTIONALITY;", "setFunctionality", "(Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$FUNCTIONALITY;)V", "heartBeat", "getHeartBeat", "setHeartBeat", "levelPercentage", "getLevelPercentage", "setLevelPercentage", "lightnessPercentage", "getLightnessPercentage", "setLightnessPercentage", "getNode", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "onOffState", "", "getOnOffState", "()Z", "setOnOffState", "(Z)V", "temperaturePercentage", "getTemperaturePercentage", "setTemperaturePercentage", "component1", "copy", "equals", "other", "hashCode", "toString", "", "android_application_aarRelease"})
public final class MeshNode {
    private boolean onOffState;
    private int levelPercentage;
    private int lightnessPercentage;
    private int temperaturePercentage;
    private int deltaUvPercentage;
    private int heartBeat;
    private int battery;
    private int alarmSignal;
    @org.jetbrains.annotations.NotNull()
    private com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY functionality;
    @org.jetbrains.annotations.NotNull()
    private final com.siliconlab.bluetoothmesh.adk.data_model.node.Node node = null;
    
    public final boolean getOnOffState() {
        return false;
    }
    
    public final void setOnOffState(boolean p0) {
    }
    
    public final int getLevelPercentage() {
        return 0;
    }
    
    public final void setLevelPercentage(int p0) {
    }
    
    public final int getLightnessPercentage() {
        return 0;
    }
    
    public final void setLightnessPercentage(int p0) {
    }
    
    public final int getTemperaturePercentage() {
        return 0;
    }
    
    public final void setTemperaturePercentage(int p0) {
    }
    
    public final int getDeltaUvPercentage() {
        return 0;
    }
    
    public final void setDeltaUvPercentage(int p0) {
    }
    
    public final int getHeartBeat() {
        return 0;
    }
    
    public final void setHeartBeat(int p0) {
    }
    
    public final int getBattery() {
        return 0;
    }
    
    public final void setBattery(int p0) {
    }
    
    public final int getAlarmSignal() {
        return 0;
    }
    
    public final void setAlarmSignal(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY getFunctionality() {
        return null;
    }
    
    public final void setFunctionality(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlab.bluetoothmesh.adk.data_model.node.Node getNode() {
        return null;
    }
    
    public MeshNode(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.node.Node node) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlab.bluetoothmesh.adk.data_model.node.Node component1() {
        return null;
    }
    
    /**
     * * @author Comarch S.A.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode copy(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.node.Node node) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}