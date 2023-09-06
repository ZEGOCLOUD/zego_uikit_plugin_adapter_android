package com.zegocloud.uikit.plugin.adapter.plugins.signaling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SetUsersInRoomAttributesCallback {

    void onResult(int errorCode, String errorMessage, List<String> errorUserList,
        Map<String, HashMap<String, String>> attributesMap, Map<String, ArrayList<String>> errorKeysMap);
}
