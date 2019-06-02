package com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001f"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Info/DeviceInfoFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Info/DeviceInfoView;", "()V", "deviceInfoPresenter", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Info/DeviceInfoPresenter;", "getDeviceInfoPresenter", "()Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Info/DeviceInfoPresenter;", "setDeviceInfoPresenter", "(Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Info/DeviceInfoPresenter;)V", "createRowElement", "Landroid/widget/TableRow;", "modelInfo", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Info/DeviceInfoFragment$DeviceModelInfo;", "lightBackground", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "", "onResume", "setDeviceInfo", "deviceInfo", "Lcom/siliconlabs/bluetoothmesh/App/ModelView/MeshNode;", "DeviceModelInfo", "android_application_debug"})
public final class DeviceInfoFragment extends dagger.android.support.DaggerFragment implements com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoView {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoPresenter deviceInfoPresenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoPresenter getDeviceInfoPresenter() {
        return null;
    }
    
    public final void setDeviceInfoPresenter(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoPresenter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void setDeviceInfo(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.ModelView.MeshNode deviceInfo) {
    }
    
    private final android.widget.TableRow createRowElement(com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoFragment.DeviceModelInfo modelInfo, boolean lightBackground) {
        return null;
    }
    
    public DeviceInfoFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/DeviceDialog/Info/DeviceInfoFragment$DeviceModelInfo;", "", "elementIndex", "", "modelType", "", "modelId", "modelName", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getElementIndex", "()I", "getModelId", "()Ljava/lang/String;", "getModelName", "getModelType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "android_application_debug"})
    public static final class DeviceModelInfo {
        private final int elementIndex = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String modelType = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String modelId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String modelName = null;
        
        public final int getElementIndex() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getModelType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getModelId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getModelName() {
            return null;
        }
        
        public DeviceModelInfo(int elementIndex, @org.jetbrains.annotations.NotNull()
        java.lang.String modelType, @org.jetbrains.annotations.NotNull()
        java.lang.String modelId, @org.jetbrains.annotations.NotNull()
        java.lang.String modelName) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.siliconlabs.bluetoothmesh.App.Fragments.DeviceDialog.Info.DeviceInfoFragment.DeviceModelInfo copy(int elementIndex, @org.jetbrains.annotations.NotNull()
        java.lang.String modelType, @org.jetbrains.annotations.NotNull()
        java.lang.String modelId, @org.jetbrains.annotations.NotNull()
        java.lang.String modelName) {
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
}