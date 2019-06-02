package com.siliconlabs.bluetoothmesh.App.Models;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality;", "", "()V", "Companion", "FUNCTIONALITY", "android_application_debug"})
public final class DeviceFunctionality {
    public static final com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.Companion Companion = null;
    
    public DeviceFunctionality() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$FUNCTIONALITY;", "", "functionalityName", "", "model", "", "Lcom/siliconlab/bluetoothmesh/adk/data_model/model/ModelIdentifier;", "(Ljava/lang/String;ILjava/lang/String;[Lcom/siliconlab/bluetoothmesh/adk/data_model/model/ModelIdentifier;)V", "getFunctionalityName", "()Ljava/lang/String;", "getModel", "()[Lcom/siliconlab/bluetoothmesh/adk/data_model/model/ModelIdentifier;", "[Lcom/siliconlab/bluetoothmesh/adk/data_model/model/ModelIdentifier;", "Unknown", "OnOff", "Level", "Lightness", "CTL", "OnOffClient", "LevelClient", "LightnessClient", "CTLClient", "android_application_debug"})
    public static enum FUNCTIONALITY {
        /*public static final*/ Unknown /* = new Unknown(null, null) */,
        /*public static final*/ OnOff /* = new OnOff(null, null) */,
        /*public static final*/ Level /* = new Level(null, null) */,
        /*public static final*/ Lightness /* = new Lightness(null, null) */,
        /*public static final*/ CTL /* = new CTL(null, null) */,
        /*public static final*/ OnOffClient /* = new OnOffClient(null, null) */,
        /*public static final*/ LevelClient /* = new LevelClient(null, null) */,
        /*public static final*/ LightnessClient /* = new LightnessClient(null, null) */,
        /*public static final*/ CTLClient /* = new CTLClient(null, null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String functionalityName = null;
        @org.jetbrains.annotations.NotNull()
        private final com.siliconlab.bluetoothmesh.adk.data_model.model.ModelIdentifier[] model = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFunctionalityName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.siliconlab.bluetoothmesh.adk.data_model.model.ModelIdentifier[] getModel() {
            return null;
        }
        
        FUNCTIONALITY(@org.jetbrains.annotations.NotNull()
        java.lang.String functionalityName, @org.jetbrains.annotations.NotNull()
        com.siliconlab.bluetoothmesh.adk.data_model.model.ModelIdentifier... model) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\r"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$Companion;", "", "()V", "getAdditionalModels", "", "Lcom/siliconlab/bluetoothmesh/adk/data_model/model/ModelIdentifier;", "functionality", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceFunctionality$FUNCTIONALITY;", "getFunctionalities", "node", "Lcom/siliconlab/bluetoothmesh/adk/data_model/node/Node;", "getSigModels", "Lcom/siliconlab/bluetoothmesh/adk/data_model/model/SigModel;", "android_application_debug"})
    public static final class Companion {
        
        private final java.util.Set<com.siliconlab.bluetoothmesh.adk.data_model.model.ModelIdentifier> getAdditionalModels(com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY functionality) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY> getFunctionalities(@org.jetbrains.annotations.NotNull()
        com.siliconlab.bluetoothmesh.adk.data_model.node.Node node) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<com.siliconlab.bluetoothmesh.adk.data_model.model.SigModel> getSigModels(@org.jetbrains.annotations.NotNull()
        com.siliconlab.bluetoothmesh.adk.data_model.node.Node node, @org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.Models.DeviceFunctionality.FUNCTIONALITY functionality) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}