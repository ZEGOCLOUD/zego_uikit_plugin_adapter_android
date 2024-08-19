package com.zegocloud.uikit.plugin.adapter.plugins.common;

public class CallbackNullChecker {

    public static void onSuccess(ZegoPluginCallback callback) {
        if (callback != null) {
            callback.onSuccess();
        }
    }

    public static void onError(ZegoPluginCallback callback, int errorCode, String errorMessage) {
        if (callback != null) {
            callback.onError(errorCode, errorMessage);
        }
    }
}
