package com.zegocloud.uikit.pluin.adapter.plugins;

import android.app.Application;
import java.util.HashMap;
import java.util.List;

public interface ZegoSignalingPluginProtocol extends ZegoPluginProtocol {

    void init(Application application, Long appID, String appSign);

    void connectUser(String userID, String userName, ConnectUserCallback callback);

    void connectUser(String userID, String userName, String token, ConnectUserCallback callback);

    void disconnectUser();

    void renewToken(String token, RenewTokenCallback callback);

    void sendInvitation(List<String> invitees, int timeout, String data,ZegoSignalingPluginNotificationConfig notificationConfig, InvitationCallback callback);

    void cancelInvitation(List<String> invitees, String invitationID, String data, CancelInvitationCallback callback);

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

    void sendRoomMessage(String text, String roomID, SendRoomMessageCallback callback);

    void registerPluginEventHandler(ZegoSignalingPluginEventHandler handler);

    void enableNotifyWhenAppRunningInBackgroundOrQuit(boolean enable);
}
