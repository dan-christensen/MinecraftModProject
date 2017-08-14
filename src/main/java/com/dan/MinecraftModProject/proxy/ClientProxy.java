package com.dan.MinecraftModProject.proxy;

import com.dan.MinecraftModProject.init.ModArmor;
import com.dan.MinecraftModProject.init.ModBlocks;
import com.dan.MinecraftModProject.init.ModItems;
import com.dan.MinecraftModProject.init.ModTools;
import com.dan.MinecraftModProject.utils.Utils;

/**
 * com.dan.MinecraftModProject.proxy.MinecraftModProject
 * Created by dan on 8/11/17.
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void registerRenders() {
        Utils.getLogger().info("Client Proxy registering renders");
        ModItems.registerRenders();
        ModTools.registerRenders();
        ModArmor.registerRenders();
        ModBlocks.registerRenders();
    }
}
