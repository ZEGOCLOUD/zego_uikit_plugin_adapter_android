package com.zegocloud.uikit.pluin.adapter.plugins;

import java.util.List;

public interface CancelInvitationCallback {

    void onResult(int errorCode, String errorMessage, List<String> errorInvitees);
}
