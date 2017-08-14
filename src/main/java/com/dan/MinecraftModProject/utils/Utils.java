package com.dan.MinecraftModProject.utils;

import com.dan.MinecraftModProject.Reference;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * com.dan.MinecraftModProject.utils.MinecraftModProject
 * Created by dan on 8/11/17.
 */
public class Utils {
    private static Logger logger;

    public static Logger getLogger() {
        if (logger == null) {
            logger = LogManager.getFormatterLogger(Reference.MODID);
        }
        return logger;
    }

    public static void printRegistered(String type, String item) {
        getLogger().info("Registered " + type + ": " + item);
    }

    public static void printRegisteredRender(String item) {
        getLogger().info("Registered render for: " + item);
    }
}
