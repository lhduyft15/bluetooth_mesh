package com.siliconlabs.bluetoothmesh.App.Database;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Database/DeviceFunctionalityDb;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "FILE_NAME", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "getFunctionality", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$FUNCTIONALITY;", "node", "Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "removeFunctionality", "", "saveFunctionality", "func", "android_application_aarDebug"})
public final class DeviceFunctionalityDb {
    private final java.lang.String FILE_NAME = "nodeFunctionality";
    private final android.content.SharedPreferences sharedPreferences = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY getFunctionality(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.node.Node node) {
        return null;
    }
    
    public final void saveFunctionality(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.node.Node node, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY func) {
    }
    
    public final void removeFunctionality(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.node.Node node) {
    }
    
    public DeviceFunctionalityDb(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}