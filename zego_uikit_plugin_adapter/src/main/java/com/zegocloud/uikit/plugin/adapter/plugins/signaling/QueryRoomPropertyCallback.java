package com.zegocloud.uikit.plugin.adapter.plugins.signaling;

import java.util.HashMap;

public interface QueryRoomPropertyCallback {

    void onResult(int errorCode, String errorMessage, HashMap<String, String> properties);
}
