package com.tct.colossuscore.common.compatibilities;

import com.tct.colossuscore.common.compatibilities.waila.WailaCompatibility;
import cpw.mods.fml.common.Loader;

public class CompatibilityHandler {

    public static void registerWailaCompatibility() {
        if (Loader.isModLoaded("waila")) {
            WailaCompatibility.register();
        }
    }

}
