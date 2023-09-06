package com.zegocloud.uikit.plugin.adapter.plugins.signaling;

public enum ZegoSignalingPluginConnectionState {
    DISCONNECTED(0), CONNECTING(1), CONNECTED(2), RECONNECTING(3);


    private int value;

    private ZegoSignalingPluginConnectionState(int value) {
        this.value = value;
    }


    public static ZegoSignalingPluginConnectionState getConnectionState(int value) {
        try {
            if (DISCONNECTED.value == value) {
                return DISCONNECTED;
            }

            if (CONNECTING.value == value) {
                return CONNECTING;
            }

            if (CONNECTED.value == value) {
                return CONNECTED;
            }

            if (RECONNECTING.value == value) {
                return RECONNECTING;
            }
        } catch (Exception var2) {
            throw new RuntimeException("The enumeration cannot be found");
        }

        return DISCONNECTED;
    }
}
