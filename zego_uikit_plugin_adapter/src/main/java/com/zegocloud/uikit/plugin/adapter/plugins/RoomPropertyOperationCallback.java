package com.zegocloud.uikit.plugin.adapter.plugins;

import java.util.List;

public interface RoomPropertyOperationCallback {

    void onResult(int errorCode, String errorMessage, List<String> errorKeys);
}
