package com.tct.colossuscore.common.compatibilities.waila.interfaces;

import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import net.minecraft.item.ItemStack;

public interface IWailaMimic {

    /**
     * Make a block look like something else when looked at in Waila display UI
     *
     * @param accessor get access to tons of shit like world & stuff
     * @param config access waila config for settings
     * @return return a itemstack for the block to mimic in the Waila display
     */
    ItemStack getWailaStack(IWailaDataAccessor accessor, IWailaConfigHandler config);

}
