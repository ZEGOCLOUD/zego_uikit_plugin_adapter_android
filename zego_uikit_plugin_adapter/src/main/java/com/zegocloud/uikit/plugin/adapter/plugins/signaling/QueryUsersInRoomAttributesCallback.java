package com.zegocloud.uikit.plugin.adapter.plugins.signaling;

import java.util.HashMap;
import java.util.Map;

public interface QueryUsersInRoomAttributesCallback {

    void onResult(int errorCode, String errorMessage, String nextFlag, Map<String, HashMap<String, String>> attributesMap);
}
