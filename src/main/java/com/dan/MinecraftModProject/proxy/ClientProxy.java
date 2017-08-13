package com.dan.MinecraftModProject.proxy;

import com.dan.MinecraftModProject.init.ModBlocks;
import com.dan.MinecraftModProject.init.ModItems;
import com.dan.MinecraftModProject.init.ModTools;

/**
 * com.dan.MinecraftModProject.proxy.MinecraftModProject
 * Created by dan on 8/11/17.
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void registerRenders() {
        ModItems.registerRenders();
        ModTools.registerRenders();
        ModBlocks.registerRenders();
    }
}
