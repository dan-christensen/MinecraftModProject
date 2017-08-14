package com.dan.MinecraftModProject;

import com.dan.MinecraftModProject.creativetabs.TabMMP;
import com.dan.MinecraftModProject.handlers.HandlerOreDicionary;
import com.dan.MinecraftModProject.handlers.HandlerRecipe;
import com.dan.MinecraftModProject.init.ModArmor;
import com.dan.MinecraftModProject.init.ModBlocks;
import com.dan.MinecraftModProject.init.ModItems;
import com.dan.MinecraftModProject.init.ModTools;
import com.dan.MinecraftModProject.proxy.CommonProxy;
import com.dan.MinecraftModProject.utils.Utils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * com.dan.MinecraftModProject.MinecraftModProject
 * Created by dan on 8/11/17.
 */

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MinecraftModProject {
    @Mod.Instance(Reference.MODID)
    public static MinecraftModProject instance;
    public static final CreativeTabs MMP = new TabMMP("mmp");

    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Utils.getLogger().info("Pre-Initialization");
        ModItems.init();
        ModTools.init();
        ModArmor.init();
        ModBlocks.init();
        ModItems.register();
        ModTools.register();
        ModArmor.register();
        ModBlocks.register();

        proxy.registerRenders();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Utils.getLogger().info("Initialization");
        proxy.registerModelBakeryVariants();
        HandlerRecipe.registerCraftingRecipes();
        HandlerRecipe.registerSmeltingRecipes();
        HandlerOreDicionary.registerOreDictionary();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        Utils.getLogger().info("Post-Initialization");
    }
}
