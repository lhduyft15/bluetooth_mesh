package com.siliconlabs.bluetoothmesh.App.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u001d\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b\u000eJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0000\u00a2\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningStatusPropagator;", "", "()V", "provisioningStatusListeners", "Ljava/util/ArrayList;", "Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningStatusPropagator$ProvisioningListener;", "addProvisioningStatusListener", "", "provisioningListener", "propagateProvisioningError", "provisioningStatus", "Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningStatusPropagator$ProvisioningStatus;", "error", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "propagateProvisioningError$android_application_aarRelease", "propagateProvisioningStatus", "status", "", "propagateProvisioningStatus$android_application_aarRelease", "removeProvisioningStatusListener", "ProvisioningListener", "ProvisioningStatus", "android_application_aarRelease"})
public final class ProvisioningStatusPropagator {
    private final java.util.ArrayList<com.siliconlabs.bluetoothmesh.App.Models.ProvisioningStatusPropagator.ProvisioningListener> provisioningStatusListeners = null;
    
    public final void propagateProvisioningStatus$android_application_aarRelease(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.ProvisioningStatusPropagator.ProvisioningStatus provisioningStatus, int status) {
    }
    
    public final void propagateProvisioningError$android_application_aarRelease(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.ProvisioningStatusPropagator.ProvisioningStatus provisioningStatus, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType error) {
    }
    
    public final void addProvisioningStatusListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.ProvisioningStatusPropagator.ProvisioningListener provisioningListener) {
    }
    
    public final void removeProvisioningStatusListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.ProvisioningStatusPropagator.ProvisioningListener provisioningListener) {
    }
    
    public ProvisioningStatusPropagator() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningStatusPropagator$ProvisioningStatus;", "", "(Ljava/lang/String;I)V", "ProvisioningSuccessful", "ProvisioningError", "DeviceProvisionedGattDisconnected", "DeviceAlreadyAdded", "ErrorDuringProvisioning", "ErrorRetrying", "android_application_aarRelease"})
    public static enum ProvisioningStatus {
        /*public static final*/ ProvisioningSuccessful /* = new ProvisioningSuccessful() */,
        /*public static final*/ ProvisioningError /* = new ProvisioningError() */,
        /*public static final*/ DeviceProvisionedGattDisconnected /* = new DeviceProvisionedGattDisconnected() */,
        /*public static final*/ DeviceAlreadyAdded /* = new DeviceAlreadyAdded() */,
        /*public static final*/ ErrorDuringProvisioning /* = new ErrorDuringProvisioning() */,
        /*public static final*/ ErrorRetrying /* = new ErrorRetrying() */;
        
        ProvisioningStatus() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningStatusPropagator$ProvisioningListener;", "", "provisioningStatusChanged", "", "provisioningStatus", "Lcom/siliconlabs/bluetoothmesh/App/Models/ProvisioningStatusPropagator$ProvisioningStatus;", "provisioningUnsuccessful", "error", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "android_application_aarRelease"})
    public static abstract interface ProvisioningListener {
        
        public abstract void provisioningStatusChanged(@org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.Models.ProvisioningStatusPropagator.ProvisioningStatus provisioningStatus);
        
        public abstract void provisioningUnsuccessful(@org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.Models.ProvisioningStatusPropagator.ProvisioningStatus provisioningStatus, @org.jetbrains.annotations.NotNull()
        com.siliconlab.bluetoothmesh.adk.ErrorType error);
    }
}