package com.tct.colossuscore.common.loader;

import com.tct.colossuscore.utillity.Logger;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.lang.reflect.Field;
import java.util.Locale;

public class ItemLoader {

    public static void registerItems(Class itemRegister) {
        try {
            for (Field field : itemRegister.getDeclaredFields()) {
                Object obj = field.get(null);
                if (obj instanceof Item) {
                    Item item = (Item) obj;
                    String name = field.getName().toLowerCase(Locale.ENGLISH);
                    registerItem(item, name);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static void registerItem(Item item, String name) {
        item.setUnlocalizedName(name);
        GameRegistry.registerItem(item, name);
        Logger.info("[ITEM]: " + name + " has been registered by Bibliotheca");
    }

}
