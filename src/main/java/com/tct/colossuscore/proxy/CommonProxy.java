package com.tct.colossuscore.proxy;

import cpw.mods.fml.relauncher.Side;

public class CommonProxy implements IProxy {

    @Override
    public Side getSide() {
        return Side.SERVER;
    }

    @Override
    public void preInit() {}

    @Override
    public void init() {}

    @Override
    public void postInit() {}

}
