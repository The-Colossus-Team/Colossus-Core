package com.tct.colossuscore.common.loader;

import com.tct.colossuscore.utillity.Logger;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import java.lang.reflect.Field;
import java.util.Locale;

public class BlockLoader {

    public static void registerBlocks(Class blockRegister) {
        try {
            for (Field field : blockRegister.getDeclaredFields()) {
                Object obj = field.get(null);
                if (obj instanceof Block) {
                    Block block = (Block) obj;
                    String name = field.getName().toLowerCase(Locale.ENGLISH);
                    registerBlock(block, name);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static void registerBlock(Block block, String name) {
        block.setBlockName(name);
        GameRegistry.registerBlock(block, name);
        Logger.info("[BLOCK]: " + name + " has been registered by Bibliotheca");
    }

}
