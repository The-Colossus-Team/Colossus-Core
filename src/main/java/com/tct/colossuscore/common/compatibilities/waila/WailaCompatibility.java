package com.tct.colossuscore.common.compatibilities.waila;

import com.tct.colossuscore.common.compatibilities.waila.interfaces.IWailaInfo;
import com.tct.colossuscore.common.compatibilities.waila.interfaces.IWailaMimic;
import cpw.mods.fml.common.event.FMLInterModComms;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaDataProvider;
import mcp.mobius.waila.api.IWailaRegistrar;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.List;

public class WailaCompatibility implements IWailaDataProvider {

    public static final WailaCompatibility INSTANCE = new WailaCompatibility();

    public WailaCompatibility() {}

    private static boolean registered;
    private static boolean loaded;

    public static void load(IWailaRegistrar registrar) {
        if (!registered) {
            throw new RuntimeException("Please register this handler using the provided method");
        }
        if (!loaded) {
            loaded = true;
        }
    }

    public static void register() {
        if (registered) {
            return;
        }
        registered = true;
        FMLInterModComms.sendMessage("waila", "register", "com.tct.colossuscore.common.compatibilities.waila.WailaCompatibility.load");
    }

    @Override
    public ItemStack getWailaStack(IWailaDataAccessor accessor, IWailaConfigHandler config) {
        Block block = accessor.getBlock();
        return block instanceof IWailaMimic ? ((IWailaMimic) block).getWailaStack(accessor, config) : null;
    }

    @Override
    public List<String> getWailaHead(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
        return currenttip;
    }

    @Override
    public List<String> getWailaBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
        Block block = accessor.getBlock();
        if (block instanceof IWailaInfo) {
            return ((IWailaInfo) block).getWailaBody(itemStack, currenttip, accessor, config);
        }
        return currenttip;
    }

    @Override
    public List<String> getWailaTail(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
        return currenttip;
    }

    @Override
    public NBTTagCompound getNBTData(EntityPlayerMP player, TileEntity te, NBTTagCompound tag, World world, int x, int y, int z) {
        return tag;
    }
}
