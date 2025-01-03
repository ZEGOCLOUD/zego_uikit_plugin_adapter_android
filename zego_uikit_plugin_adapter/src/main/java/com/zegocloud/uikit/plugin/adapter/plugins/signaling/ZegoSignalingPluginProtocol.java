package com.zegocloud.uikit.plugin.adapter.plugins.signaling;

import android.app.Application;
import com.zegocloud.uikit.plugin.adapter.plugins.ZegoPluginProtocol;
import java.util.HashMap;
import java.util.List;

public interface ZegoSignalingPluginProtocol extends ZegoPluginProtocol {

    void init(Application application, Long appID, String appSign);

    boolean isZIMInitSuccess();

    void connectUser(String userID, String userName, ConnectUserCallback callback);

    void connectUser(String userID, String userName, String token, ConnectUserCallback callback);

    PluginZIMUser getCurrentUser();

    void disconnectUser();

    void renewToken(String token, RenewTokenCallback callback);

    void destroy();

    void renewToken(String token);

    void sendInvitation(List<String> invitees, int timeout, String data,
        ZegoSignalingPluginNotificationConfig notificationConfig, InvitationCallback callback);

    void cancelInvitation(List<String> invitees, String invitationID, String data,
        ZegoSignalingPluginNotificationConfig pushConfig, CancelInvitationCallback callback);

    void refuseInvitation(String invitationID, String data, ResponseInvitationCallback callback);

    void acceptInvitation(String invitationID, String data, ResponseInvitationCallback callback);

    void joinRoom(String roomID, RoomCallback callback);

    void joinRoom(String roomID, String roomName, RoomCallback callback);

    void leaveRoom(String roomID, RoomCallback callback);

    void setUsersInRoomAttributes(HashMap<String, String> attributes, List<String> userIDs, String roomID,
        SetUsersInRoomAttributesCallback callback);

    void queryUsersInRoomAttributes(String roomID, int count, String nextFlag,
        QueryUsersInRoomAttributesCallback callback);

    void updateRoomProperty(HashMap<String, String> attributes, String roomID, boolean isForce,
        boolean isDeleteAfterOwnerLeft, boolean isUpdateOwner, RoomPropertyOperationCallback callback);

    void deleteRoomProperties(List<String> keys, String roomID, boolean isForce,
        RoomPropertyOperationCallback callback);

    void queryRoomProperties(String roomID, QueryRoomPropertyCallback callback);

    void beginRoomPropertiesBatchOperation(String roomID, boolean isDeleteAfterOwnerLeft, boolean isForce,
        boolean isUpdateOwner);

    void endRoomPropertiesBatchOperation(String roomID, EndRoomBatchOperationCallback callback);

    void sendRoomTextMessage(String text, String roomID, SendRoomMessageCallback callback);

    void sendRoomCommandMessage(String command, String roomID, SendRoomMessageCallback callback);

    void registerPluginEventHandler(ZegoSignalingPluginEventHandler handler);

    void enableNotifyWhenAppRunningInBackgroundOrQuit(boolean enable);

    void enableFCMPush();

    void disableFCMPush();

    void enableHWPush(String hwAppID);

    void enableMiPush(String miAppID, String miAppKey);

    void enableVivoPush(String vivoAppID, String vivoAppKey);

    void enableOppoPush(String oppoAppID, String oppoAppKey, String oppoAppSecret);

    void registerPush();

    void unregisterPush();

    boolean isOtherPushEnabled();

    boolean isFCMPushEnabled();

    void setAppType(int appType);

    String getVersion();
}
