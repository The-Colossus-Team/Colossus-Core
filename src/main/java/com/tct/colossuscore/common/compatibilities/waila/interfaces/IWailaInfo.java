package com.tct.colossuscore.common.compatibilities.waila.interfaces;

import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import net.minecraft.item.ItemStack;

import java.util.List;

public interface IWailaInfo {


    /**
     * Add information to the Waila display UI
     * @param stack
     * @param currenttip
     * @param accessor
     * @param config
     * @return currenttip
     */
    List<String> getWailaBody(ItemStack stack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config);

}
