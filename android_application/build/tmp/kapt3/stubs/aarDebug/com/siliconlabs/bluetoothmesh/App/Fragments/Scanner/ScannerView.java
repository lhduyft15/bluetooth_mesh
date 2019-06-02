package com.siliconlabs.bluetoothmesh.App.Fragments.Scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u0010"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerView;", "", "addDevice", "", "deviceDescription", "Lcom/siliconlabs/bluetoothmesh/App/Models/DeviceDescription;", "clearAdapter", "getActivity", "Landroid/app/Activity;", "setScanMenuToActive", "active", "", "showToast", "toastMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerView$TOAST_MESSAGE;", "TOAST_MESSAGE", "android_application_aarDebug"})
public abstract interface ScannerView {
    
    public abstract void addDevice(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Models.DeviceDescription deviceDescription);
    
    public abstract void setScanMenuToActive(boolean active);
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.app.Activity getActivity();
    
    public abstract void clearAdapter();
    
    public abstract void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerView.TOAST_MESSAGE toastMessage);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerView$TOAST_MESSAGE;", "", "(Ljava/lang/String;I)V", "NO_NETWORK_AVAILABLE", "android_application_aarDebug"})
    public static enum TOAST_MESSAGE {
        /*public static final*/ NO_NETWORK_AVAILABLE /* = new NO_NETWORK_AVAILABLE() */;
        
        TOAST_MESSAGE() {
        }
    }
}