package com.zegocloud.uikit.plugin.adapter.plugins.signaling;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * callbacks from signal
 */
public interface ZegoSignalingPluginEventHandler {

    void onConnectionStateChanged(ZegoSignalingPluginConnectionState state);

    void onTokenWillExpire(int second);

    void onCallInvitationReceived(String invitationID, String inviterID, String data);

    void onCallInvitationCancelled(String invitationID, String inviterID, String data);

    void onCallInvitationAccepted(String invitationID, String invitee, String data);

    void onCallInvitationRejected(String invitationID, String invitee, String data);

    void onCallInvitationTimeout(String invitationID);

    void onCallInviteesAnsweredTimeout(String invitationID, List<String> invitees);

    void onUsersInRoomAttributesUpdated(Map<String, HashMap<String, String>> attributesMap, String editor, String roomID);

    void onRoomPropertiesUpdated(List<Map<String, String>> setProperties, List<Map<String, String>> deleteProperties,
        String roomID);

    void onRoomMemberLeft(List<String> userIDList, String roomID);

    void onRoomMemberJoined(List<String> userIDList, String roomID);

    void onInRoomTextMessageReceived(List<ZegoSignalingInRoomTextMessage> messages,String roomID);
}
