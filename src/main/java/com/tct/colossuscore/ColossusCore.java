package com.tct.colossuscore;

import com.tct.colossuscore.proxy.CommonProxy;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = ColossusCore.MOD_ID, name = ColossusCore.NAME, version = ColossusCore.VERSION)
public class ColossusCore {

    @Mod.Instance(ColossusCore.MOD_ID)
    public static ColossusCore instance;

    @SidedProxy(modId = ColossusCore.MOD_ID, clientSide = "com.tct.colossuscore.proxy.ClientProxy", serverSide = "com.tct.colossuscore.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final String MOD_ID = "colossuscore";
    public static final String NAME = "Colossus Core";
    public static final String VERSION = "1.7.10-1.0.0";


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
