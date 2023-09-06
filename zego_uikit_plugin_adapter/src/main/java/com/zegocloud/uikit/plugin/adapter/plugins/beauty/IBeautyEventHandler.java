package com.zegocloud.uikit.plugin.adapter.plugins.beauty;

public abstract class IBeautyEventHandler {

    public void onInitResult(int errorCode, String message) {

    }

    public void onError(int errorCode, String message) {
    }

    public void onFaceDetectionResult(ZegoBeautyPluginFaceDetectionResult[] results) {

    }
}
