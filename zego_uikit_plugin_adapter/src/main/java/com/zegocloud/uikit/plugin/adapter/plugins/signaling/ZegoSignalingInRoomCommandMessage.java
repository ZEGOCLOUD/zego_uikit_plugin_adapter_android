package com.zegocloud.uikit.plugin.adapter.plugins.signaling;

public class ZegoSignalingInRoomCommandMessage {

    public long messageID;
    public long timestamp;
    public long orderKey;
    public String senderUserID;
    public String text;

    @Override
    public String toString() {
        return "ZegoSignalingInRoomCommandMessage{" +
            "messageID=" + messageID +
            ", timestamp=" + timestamp +
            ", orderKey=" + orderKey +
            ", senderUserID='" + senderUserID + '\'' +
            ", text='" + text + '\'' +
            '}';
    }
}
