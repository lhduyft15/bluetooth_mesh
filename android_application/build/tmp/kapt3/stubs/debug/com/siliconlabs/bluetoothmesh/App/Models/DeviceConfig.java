package com.siliconlabs.bluetoothmesh.App.Models;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010*\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fH\u00c6\u0003Jb\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011\u00a8\u00063"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;", "", "name", "", "proxy", "", "relay", "friend", "lowPower", "functionality", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$FUNCTIONALITY;", "group", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$FUNCTIONALITY;Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;)V", "getFriend", "()Ljava/lang/Boolean;", "setFriend", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getFunctionality", "()Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$FUNCTIONALITY;", "setFunctionality", "(Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$FUNCTIONALITY;)V", "getGroup", "()Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "setGroup", "(Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;)V", "getLowPower", "setLowPower", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getProxy", "setProxy", "getRelay", "setRelay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$FUNCTIONALITY;Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;)Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceConfig;", "equals", "other", "hashCode", "", "toString", "android_application_debug"})
public final class DeviceConfig {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean proxy;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean relay;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean friend;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean lowPower;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY functionality;
    @org.jetbrains.annotations.Nullable()
    private com.siliconlab.bluetoothmesh.adk.data_model.group.Group group;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getProxy() {
        return null;
    }
    
    public final void setProxy(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getRelay() {
        return null;
    }
    
    public final void setRelay(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getFriend() {
        return null;
    }
    
    public final void setFriend(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getLowPower() {
        return null;
    }
    
    public final void setLowPower(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY getFunctionality() {
        return null;
    }
    
    public final void setFunctionality(@org.jetbrains.annotations.Nullable()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.data_model.group.Group getGroup() {
        return null;
    }
    
    public final void setGroup(@org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group p0) {
    }
    
    public DeviceConfig(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean proxy, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean relay, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean friend, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean lowPower, @org.jetbrains.annotations.Nullable()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY functionality, @org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group group) {
        super();
    }
    
    public DeviceConfig() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconlab.bluetoothmesh.adk.data_model.group.Group component7() {
        return null;
    }
    
    /**
     * * @author Comarch S.A.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Models.DeviceConfig copy(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean proxy, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean relay, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean friend, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean lowPower, @org.jetbrains.annotations.Nullable()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY functionality, @org.jetbrains.annotations.Nullable()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group group) {
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