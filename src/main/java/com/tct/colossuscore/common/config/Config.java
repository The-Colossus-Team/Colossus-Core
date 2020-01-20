package com.tct.colossuscore.common.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class Config {

    public static void init(File file) {
        Configuration config = new Configuration(file);

        config.load();
            // Config shit in here
        if (config.hasChanged()) {
            config.save();
        }
    }

}
