package com.zegocloud.uikit.plugin.adapter.plugins.beauty;

import java.util.Arrays;
import java.util.List;

public class ZegoBeautyPluginConfig {

    public List<ZegoBeautyPluginEffectsType> effectsTypes = Arrays.asList(ZegoBeautyPluginEffectsType.values());
    public ZegoBeautyPluginInnerText innerText = new ZegoBeautyPluginInnerText();
    public ZegoBeautyPluginUIConfig uiConfig = new ZegoBeautyPluginUIConfig();
    public boolean enableFaceDetection;
    public IBeautyEventHandler beautyEventHandler;
}
