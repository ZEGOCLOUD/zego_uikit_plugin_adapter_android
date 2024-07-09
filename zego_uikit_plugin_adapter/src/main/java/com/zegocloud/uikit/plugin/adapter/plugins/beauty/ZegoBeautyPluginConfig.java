package com.zegocloud.uikit.plugin.adapter.plugins.beauty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZegoBeautyPluginConfig {

    public List<ZegoBeautyPluginEffectsType> effectsTypes = new ArrayList<>(
        Arrays.asList(ZegoBeautyPluginEffectsType.values()));
    public ZegoBeautyPluginInnerText innerText = new ZegoBeautyPluginInnerText();
    public ZegoBeautyPluginUIConfig uiConfig = new ZegoBeautyPluginUIConfig();
    public boolean enableFaceDetection;
    public IBeautyEventHandler beautyEventHandler;
    public String segmentationBackgroundImageName;
    public boolean saveLastBeautyParam;

    public static List<ZegoBeautyPluginEffectsType> basicTypes() {
        List<ZegoBeautyPluginEffectsType> effectsTypeList = new ArrayList<>();
        for (ZegoBeautyPluginEffectsType type : ZegoBeautyPluginEffectsType.values()) {
            if (type.name().startsWith("BASIC_")) {
                effectsTypeList.add(type);
            }
        }
        return effectsTypeList;
    }

    public static List<ZegoBeautyPluginEffectsType> advancedTypes() {
        List<ZegoBeautyPluginEffectsType> effectsTypeList = new ArrayList<>();
        for (ZegoBeautyPluginEffectsType type : ZegoBeautyPluginEffectsType.values()) {
            if (type.name().startsWith("ADVANCED_")) {
                effectsTypeList.add(type);
            }
        }
        return effectsTypeList;
    }

    public static List<ZegoBeautyPluginEffectsType> makeupTypes() {
        List<ZegoBeautyPluginEffectsType> effectsTypeList = new ArrayList<>();
        for (ZegoBeautyPluginEffectsType type : ZegoBeautyPluginEffectsType.values()) {
            if (type.name().startsWith("MAKEUP_")) {
                effectsTypeList.add(type);
            }
        }
        return effectsTypeList;
    }

    public static List<ZegoBeautyPluginEffectsType> styleMakeupTypes() {
        List<ZegoBeautyPluginEffectsType> effectsTypeList = new ArrayList<>();
        for (ZegoBeautyPluginEffectsType type : ZegoBeautyPluginEffectsType.values()) {
            if (type.name().startsWith("STYLE_MAKEUP_")) {
                effectsTypeList.add(type);
            }
        }
        return effectsTypeList;
    }

    public static List<ZegoBeautyPluginEffectsType> filterTypes() {
        List<ZegoBeautyPluginEffectsType> effectsTypeList = new ArrayList<>();
        for (ZegoBeautyPluginEffectsType type : ZegoBeautyPluginEffectsType.values()) {
            if (type.name().startsWith("FILTER_")) {
                effectsTypeList.add(type);
            }
        }
        return effectsTypeList;
    }

    public static List<ZegoBeautyPluginEffectsType> stickerTypes() {
        List<ZegoBeautyPluginEffectsType> effectsTypeList = new ArrayList<>();
        for (ZegoBeautyPluginEffectsType type : ZegoBeautyPluginEffectsType.values()) {
            if (type.name().startsWith("STICKER_")) {
                effectsTypeList.add(type);
            }
        }
        return effectsTypeList;
    }

    public static List<ZegoBeautyPluginEffectsType> backgroundTypes() {
        List<ZegoBeautyPluginEffectsType> effectsTypeList = new ArrayList<>();
        for (ZegoBeautyPluginEffectsType type : ZegoBeautyPluginEffectsType.values()) {
            if (type.name().startsWith("BACKGROUND_")) {
                effectsTypeList.add(type);
            }
        }
        return effectsTypeList;
    }
}
