package com.siliconlabs.bluetoothmesh.App.Logic;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothStateReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "TAG", "", "listeners", "Ljava/util/ArrayList;", "Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothStateReceiver$BluetoothStateListener;", "Lkotlin/collections/ArrayList;", "addListener", "", "bluetoothStateListener", "notifyListeners", "enabled", "", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "removeListener", "BluetoothStateListener", "android_application_debug"})
public final class BluetoothStateReceiver extends android.content.BroadcastReceiver {
    private final java.lang.String TAG = null;
    private final java.util.ArrayList<com.siliconlabs.bluetoothmesh.App.Logic.BluetoothStateReceiver.BluetoothStateListener> listeners = null;
    
    public final void addListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.BluetoothStateReceiver.BluetoothStateListener bluetoothStateListener) {
    }
    
    public final void removeListener(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Logic.BluetoothStateReceiver.BluetoothStateListener bluetoothStateListener) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final void notifyListeners(boolean enabled) {
    }
    
    public BluetoothStateReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Logic/BluetoothStateReceiver$BluetoothStateListener;", "", "onBluetoothStateChanged", "", "enabled", "", "android_application_debug"})
    public static abstract interface BluetoothStateListener {
        
        public abstract void onBluetoothStateChanged(boolean enabled);
    }
}