package com.zegocloud.uikit.plugin.adapter;

import androidx.annotation.Nullable;
import com.zegocloud.uikit.plugin.adapter.plugins.ZegoPluginProtocol;
import com.zegocloud.uikit.plugin.adapter.plugins.ZegoPluginType;
import com.zegocloud.uikit.plugin.adapter.plugins.signaling.ZegoSignalingPluginProtocol;
import com.zegocloud.uikit.plugin.adapter.plugins.beauty.ZegoBeautyPluginProtocol;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZegoPluginAdapter {

    private static Map<ZegoPluginType, ZegoPluginProtocol> mPlugins = new HashMap<>();

    public static void installPlugins(@Nullable List<ZegoPluginProtocol> plugins) {
        for (ZegoPluginProtocol plugin : plugins) {
            mPlugins.put(plugin.getPluginType(), plugin);
        }
    }

    @Nullable
    public static ZegoSignalingPluginProtocol signalingPlugin() {
        ZegoPluginProtocol plugin = getPlugin(ZegoPluginType.SIGNALING);
        if (plugin instanceof ZegoSignalingPluginProtocol) {
            return (ZegoSignalingPluginProtocol) mPlugins.get(ZegoPluginType.SIGNALING);
        }
        return null;
    }

    public static ZegoBeautyPluginProtocol beautyPlugin() {
        ZegoPluginProtocol plugin = getPlugin(ZegoPluginType.BEAUTY);
        if (plugin instanceof ZegoBeautyPluginProtocol) {
            return (ZegoBeautyPluginProtocol) mPlugins.get(ZegoPluginType.BEAUTY);
        }
        return null;
    }

    @Nullable
    public static ZegoPluginProtocol getPlugin(ZegoPluginType pluginType) {
        ZegoPluginProtocol pluginProtocol = mPlugins.get(pluginType);
        if (pluginProtocol != null) {
            return pluginProtocol;
        }
        switch (pluginType) {
            case SIGNALING: {
                pluginProtocol = reflectGetSignalPlugin();
            }
            break;
            case BEAUTY:
                pluginProtocol = reflectGetBeautyPlugin();
                break;
            default:
                break;
        }
        if (pluginProtocol != null) {
            installPlugins(Collections.singletonList(pluginProtocol));
            return pluginProtocol;
        }
        return null;
    }

    private static ZegoPluginProtocol reflectGetBeautyPlugin() {
        try {
            Class beautyPlugin = Class.forName("com.zegocloud.uikit.plugin.beauty.ZegoUIKitBeautyPlugin");
            Method m = beautyPlugin.getDeclaredMethod("getInstance");
            Object invoke = m.invoke(null);
            if (invoke instanceof ZegoPluginProtocol) {
                return (ZegoPluginProtocol) invoke;
            }
        } catch (Exception e) {
        }
        return null;
    }

    @Nullable
    private static ZegoPluginProtocol reflectGetSignalPlugin() {
        try {
            Class signalPlugin = Class.forName("com.zegocloud.uikit.plugin.signaling.ZegoSignalingPlugin");
            Method m = signalPlugin.getDeclaredMethod("getInstance");
            Object invoke = m.invoke(null);
            if (invoke instanceof ZegoPluginProtocol) {
                return (ZegoPluginProtocol) invoke;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
