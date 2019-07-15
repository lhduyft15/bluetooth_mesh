package com.siliconlabs.bluetoothmesh.App.Models;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0007J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bJ\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/MeshNodeManager;", "", "deviceFunctionalityDb", "Lcom/siliconlabs/bluetoothmesh/App/Database/DeviceFunctionalityDb;", "(Lcom/siliconlabs/bluetoothmesh/App/Database/DeviceFunctionalityDb;)V", "meshNodes", "", "Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "getMeshNode", "node", "getMeshNodes", "", "group", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "subnet", "Lcom/siliconlab/bluetoothmesh/adk/data_model/subnet/Subnet;", "removeNodeFunc", "", "meshNode", "updateNodeFunc", "functionality", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$FUNCTIONALITY;", "wrapNode", "wrapNodes", "nodes", "android_application_aarRelease"})
public final class MeshNodeManager {
    private final java.util.Map<com.siliconlab.bluetoothmesh.adk.data_model.node.Node, com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> meshNodes = null;
    private final com.siliconlabs.bluetoothmesh.App.Database.DeviceFunctionalityDb deviceFunctionalityDb = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode getMeshNode(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.node.Node node) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> getMeshNodes(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.subnet.Subnet subnet) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> getMeshNodes(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group group) {
        return null;
    }
    
    private final java.util.Set<com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode> wrapNodes(java.util.Set<? extends com.siliconlab.bluetoothmesh.adk.data_model.node.Node> nodes) {
        return null;
    }
    
    private final com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode wrapNode(com.siliconlab.bluetoothmesh.adk.data_model.node.Node node) {
        return null;
    }
    
    public final void updateNodeFunc(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode meshNode, @org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY functionality) {
    }
    
    public final void removeNodeFunc(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode meshNode) {
    }
    
    public MeshNodeManager(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Database.DeviceFunctionalityDb deviceFunctionalityDb) {
        super();
    }
}