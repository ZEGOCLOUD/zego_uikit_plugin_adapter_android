package com.zegocloud.uikit.plugin.adapter.plugins;

import java.util.HashMap;

public interface QueryRoomPropertyCallback {

    void onResult(int errorCode, String errorMessage, HashMap<String, String> properties);
}
