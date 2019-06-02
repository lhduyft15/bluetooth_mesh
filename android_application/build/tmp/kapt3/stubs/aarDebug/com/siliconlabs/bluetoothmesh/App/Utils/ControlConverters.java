package com.siliconlabs.bluetoothmesh.App.Utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Utils/ControlConverters;", "", "()V", "Companion", "android_application_aarDebug"})
public final class ControlConverters {
    private static int INT_16_MIN;
    private static int INT_16_MAX;
    private static int UINT_16_MIN;
    private static int UINT_16_MAX;
    private static int TEMPERATURE_MIN;
    private static int TEMPERATURE_MAX;
    private static float DELTA_UV_MIN;
    private static float DELTA_UV_MAX;
    public static final com.siliconlabs.bluetoothmesh.App.Utils.ControlConverters.Companion Companion = null;
    
    public ControlConverters() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Utils/ControlConverters$Companion;", "", "()V", "DELTA_UV_MAX", "", "DELTA_UV_MIN", "INT_16_MAX", "", "INT_16_MIN", "TEMPERATURE_MAX", "TEMPERATURE_MIN", "UINT_16_MAX", "UINT_16_MIN", "getDeltaUv", "percentage", "getDeltaUvToShow", "getLevel", "getLightness", "getTemperature", "android_application_aarDebug"})
    public static final class Companion {
        
        public final int getLevel(int percentage) {
            return 0;
        }
        
        public final int getLightness(int percentage) {
            return 0;
        }
        
        public final int getTemperature(int percentage) {
            return 0;
        }
        
        public final int getDeltaUv(int percentage) {
            return 0;
        }
        
        public final float getDeltaUvToShow(int percentage) {
            return 0.0F;
        }
        
        private Companion() {
            super();
        }
    }
}