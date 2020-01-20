package com.tct.colossuscore.proxy;

import cpw.mods.fml.relauncher.Side;

public interface IProxy {

    Side getSide();

    void preInit();

    void init();

    void postInit();

}
