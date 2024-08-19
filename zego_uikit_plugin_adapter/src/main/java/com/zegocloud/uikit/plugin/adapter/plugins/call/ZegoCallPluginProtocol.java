package com.zegocloud.uikit.plugin.adapter.plugins.call;

import android.app.Activity;
import android.app.Application;
import com.zegocloud.uikit.plugin.adapter.plugins.ZegoPluginProtocol;
import com.zegocloud.uikit.plugin.adapter.plugins.common.ZegoPluginCallback;
import com.zegocloud.uikit.plugin.adapter.plugins.signaling.ZegoSignalingPluginNotificationConfig;
import java.util.List;

public interface ZegoCallPluginProtocol extends ZegoPluginProtocol {

    void init(Application application, long appID, String appSign, String userID, String userName,
        ZegoCallPluginConfig callPluginConfig);

    void initWithToken(Application application, long appID, String token, String userID, String userName,
        ZegoCallPluginConfig callPluginConfig);

    void unInit();

    void logoutUser();

    void sendInvitationWithUIChange(Activity activity, List<PluginCallUser> invitees, PluginCallType invitationType,
        String customData, int timeout, String callID, ZegoSignalingPluginNotificationConfig notificationConfig,
        ZegoPluginCallback callbackListener);
}
