package com.zegocloud.uikit.plugin.adapter.plugins.signaling;

import java.util.List;

public interface CancelInvitationCallback {

    void onResult(int errorCode, String errorMessage, List<String> errorInvitees);
}
