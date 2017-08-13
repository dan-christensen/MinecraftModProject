package com.dan.MinecraftModProject.init;

import com.dan.MinecraftModProject.MinecraftModProject;
import com.dan.MinecraftModProject.Reference;
import com.dan.MinecraftModProject.items.ItemTitaniumIngot;
import com.dan.MinecraftModProject.utils.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * com.dan.MinecraftModProject.init.MinecraftModProject
 * Created by dan on 8/11/17.
 */
public class ModItems {

    public static Item titaniumIngot;

    public static void init(){
        titaniumIngot = new ItemTitaniumIngot("titanium_ingot", "titanium_ingot");
    }

    public static void register() {
        registerItem(titaniumIngot);
    }

    public static void registerRenders() {
        registerRender(titaniumIngot);
    }

    public static void registerItem(Item item){
        item.setCreativeTab(MinecraftModProject.MMP);
        ForgeRegistries.ITEMS.register(item);
        Utils.getLogger().info("Registered item " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
    }
}
