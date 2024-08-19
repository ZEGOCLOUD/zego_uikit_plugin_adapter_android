package com.zegocloud.uikit.plugin.adapter.plugins.common;

public interface ZegoPluginCallback {
    
    void onSuccess();

    void onError(int errorCode, String errorMessage);
}
