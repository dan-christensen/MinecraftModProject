package com.dan.MinecraftModProject.handlers;

import com.dan.MinecraftModProject.init.ModBlocks;
import com.dan.MinecraftModProject.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

/**
 * com.dan.MinecraftModProject.handlers.MinecraftModProject
 * Created by dan on 8/14/17.
 */
public class HandlerOreDicionary {

    public static void registerOreDictionary() {
        OreDictionary.registerOre("ore_titanium", ModBlocks.titaniumOre);
        OreDictionary.registerOre("ingot_titanium", ModItems.titaniumIngot);
    }
}
