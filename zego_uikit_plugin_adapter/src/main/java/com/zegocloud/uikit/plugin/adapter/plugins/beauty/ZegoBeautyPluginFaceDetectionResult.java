package com.zegocloud.uikit.plugin.adapter.plugins.beauty;

public class ZegoBeautyPluginFaceDetectionResult {

    public float score;
    public ZegoBeautyPluginRect rect;

    public ZegoBeautyPluginFaceDetectionResult() {
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getScore() {
        return this.score;
    }

    public void setRect(ZegoBeautyPluginRect rect) {
        this.rect = rect;
    }

    public ZegoBeautyPluginRect getRect() {
        return this.rect;
    }
}
