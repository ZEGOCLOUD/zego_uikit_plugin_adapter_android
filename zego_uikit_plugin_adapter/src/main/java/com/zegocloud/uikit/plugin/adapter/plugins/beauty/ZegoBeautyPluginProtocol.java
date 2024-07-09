package com.zegocloud.uikit.plugin.adapter.plugins.beauty;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import com.zegocloud.uikit.plugin.adapter.plugins.ZegoPluginProtocol;

public interface ZegoBeautyPluginProtocol extends ZegoPluginProtocol {

    void init(Application application, long appID, String appSign, ZegoBeautyPluginInitCallback callback);

    void setLicenceProvider(LicenceProvider provider);

    void unInit();

    void initEnv(int captureWidth, int captureHeight);

    void unInitEnv();

    boolean isEffectSDKInit();

    void setZegoBeautyPluginConfig(ZegoBeautyPluginConfig config);

    int processTexture(int textureID, int width, int height);

    void resetAllFeatures();

    Dialog getBeautyDialog(Context context);

    void enableBeautyFeature(ZegoBeautyPluginEffectsType beautyType, boolean enable);

    int getBeautyFeatureValue(ZegoBeautyPluginEffectsType beautyType);

    void setBeautyFeatureValue(ZegoBeautyPluginEffectsType beautyType, int value);

    void resetBeautyValueToDefault(ZegoBeautyPluginEffectsType beautyType);

    void resetBeautyValueToNone(ZegoBeautyPluginEffectsType beautyType);

}