package com.zegocloud.uikit.pluin.adapter.plugins;

import java.util.List;

public interface InvitationCallback {
    void onResult(int errorCode,String errorMessage,String invitationID, List<String> errorInvitees);
}
