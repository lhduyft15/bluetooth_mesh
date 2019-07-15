package com.siliconlabs.bluetoothmesh.App.Dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Dialogs/AuthDialogs;", "", "()V", "Companion", "android_application_aarRelease"})
public final class AuthDialogs {
    public static final com.siliconlabs.bluetoothmesh.App.Dialogs.AuthDialogs.Companion Companion = null;
    
    public AuthDialogs() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bJ.\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Dialogs/AuthDialogs$Companion;", "", "()V", "oob_display_UI", "", "context", "Landroid/content/Context;", "uuid", "", "input_action", "", "input_size", "auth_data", "oob_request_UI", "activity", "Landroid/app/Activity;", "output_action", "output_size", "presenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/Scanner/ScannerPresenter;", "android_application_aarRelease"})
    public static final class Companion {
        
        public final void oob_display_UI(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        byte[] uuid, int input_action, int input_size, @org.jetbrains.annotations.NotNull()
        byte[] auth_data) {
        }
        
        public final void oob_request_UI(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        byte[] uuid, int output_action, int output_size, @org.jetbrains.annotations.NotNull()
        com.siliconlabs.bluetoothmesh.App.Fragments.Scanner.ScannerPresenter presenter) {
        }
        
        private Companion() {
            super();
        }
    }
}