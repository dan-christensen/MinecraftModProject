package com.dan.MinecraftModProject.init;

import com.dan.MinecraftModProject.Reference;
import com.dan.MinecraftModProject.items.ItemModPickaxe;
import com.dan.MinecraftModProject.utils.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * com.dan.MinecraftModProject.init.MinecraftModProject
 * Created by dan on 8/11/17.
 */
public class ModTools {

    public static final Item.ToolMaterial MATERIAL_TITANIUM = EnumHelper.addToolMaterial(Reference.MODID + ":titanium", 3, 3124, 24.0f, 6.0f, 44);

    public static ItemPickaxe titaniumPickaxe;

    public static void init(){
        titaniumPickaxe = new ItemModPickaxe(MATERIAL_TITANIUM, "titanium_pickaxe");
    }

    public static void register(){
        registerTool(titaniumPickaxe);
    }

    public static void registerRenders(){
        registerRender(titaniumPickaxe);
    }

    public static void registerTool(Item item){
        ForgeRegistries.ITEMS.register(item);
        Utils.getLogger().info("Registered item " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
    }

}
