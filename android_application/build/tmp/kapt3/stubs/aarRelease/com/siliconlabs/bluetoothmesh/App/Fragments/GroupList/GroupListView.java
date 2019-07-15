package com.siliconlabs.bluetoothmesh.App.Fragments.GroupList;

import java.lang.System;

/**
 * * @author Comarch S.A.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u001e\u001fJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\"\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u001bH&J$\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH&\u00a8\u0006 "}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListView;", "", "dismissLoadingDialog", "", "onGroupClickListener", "groupInfo", "Lcom/siliconlab/bluetoothmesh/adk/data_model/group/Group;", "refreshList", "setGroupsList", "groupsInfo", "", "showAddGroupDialog", "showDeleteGroupDialog", "", "showDeleteGroupLocallyDialog", "errorType", "Lcom/siliconlab/bluetoothmesh/adk/ErrorType;", "group", "showEditGroupDialog", "showLoadingDialog", "showToast", "toastMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListView$TOAST_MESSAGE;", "updateLoadingDialogMessage", "loadingMessage", "Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListView$LOADING_DIALOG_MESSAGE;", "showCloseButton", "", "message", "", "LOADING_DIALOG_MESSAGE", "TOAST_MESSAGE", "android_application_aarRelease"})
public abstract interface GroupListView {
    
    public abstract void setGroupsList(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.siliconlab.bluetoothmesh.adk.data_model.group.Group> groupsInfo);
    
    public abstract void showToast(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListView.TOAST_MESSAGE toastMessage);
    
    public abstract void showAddGroupDialog();
    
    public abstract void showEditGroupDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group groupInfo);
    
    public abstract void showDeleteGroupDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconlab.bluetoothmesh.adk.data_model.group.Group> groupInfo);
    
    public abstract void showDeleteGroupLocallyDialog(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group group);
    
    public abstract void onGroupClickListener(@org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.data_model.group.Group groupInfo);
    
    public abstract void showLoadingDialog();
    
    public abstract void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean showCloseButton);
    
    public abstract void updateLoadingDialogMessage(@org.jetbrains.annotations.NotNull()
    com.siliconlabs.bluetoothmesh.App.Fragments.GroupList.GroupListView.LOADING_DIALOG_MESSAGE loadingMessage, @org.jetbrains.annotations.NotNull()
    com.siliconlab.bluetoothmesh.adk.ErrorType errorType, boolean showCloseButton);
    
    public abstract void dismissLoadingDialog();
    
    public abstract void refreshList();
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListView$LOADING_DIALOG_MESSAGE;", "", "(Ljava/lang/String;I)V", "REMOVING_GROUP", "REMOVING_GROUP_ERROR", "android_application_aarRelease"})
    public static enum LOADING_DIALOG_MESSAGE {
        /*public static final*/ REMOVING_GROUP /* = new REMOVING_GROUP() */,
        /*public static final*/ REMOVING_GROUP_ERROR /* = new REMOVING_GROUP_ERROR() */;
        
        LOADING_DIALOG_MESSAGE() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/siliconlabs/bluetoothmesh/App/Fragments/GroupList/GroupListView$TOAST_MESSAGE;", "", "(Ljava/lang/String;I)V", "ERROR_DELETE_GROUP_EXISTED_NODES", "ERROR_CREATING_GROUP", "android_application_aarRelease"})
    public static enum TOAST_MESSAGE {
        /*public static final*/ ERROR_DELETE_GROUP_EXISTED_NODES /* = new ERROR_DELETE_GROUP_EXISTED_NODES() */,
        /*public static final*/ ERROR_CREATING_GROUP /* = new ERROR_CREATING_GROUP() */;
        
        TOAST_MESSAGE() {
        }
    }
    
    /**
     * * @author Comarch S.A.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}