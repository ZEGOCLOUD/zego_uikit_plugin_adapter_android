package com.zegocloud.uikit.pluin.adapter.plugins;

import java.util.HashMap;
import java.util.Map;

public interface QueryRoomPropertyCallback {

    void onResult(int errorCode, String errorMessage, HashMap<String, String> properties);
}
