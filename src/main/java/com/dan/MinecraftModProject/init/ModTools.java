package com.dan.MinecraftModProject.init;

import com.dan.MinecraftModProject.MinecraftModProject;
import com.dan.MinecraftModProject.Reference;
import com.dan.MinecraftModProject.items.*;
import com.dan.MinecraftModProject.utils.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.*;
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
    public static ItemTool titaniumAxe;
    public static ItemSpade titaniumShovel;
    public static ItemHoe titaniumHoe;
    public static ItemSword titaniumSword;

    public static void init(){
        titaniumPickaxe = new ItemModPickaxe(MATERIAL_TITANIUM, "titanium_pickaxe");
        titaniumAxe = new ItemModAxe(MATERIAL_TITANIUM, "titanium_axe");
        titaniumShovel = new ItemModShovel(MATERIAL_TITANIUM, "titanium_shovel");
        titaniumHoe = new ItemModHoe(MATERIAL_TITANIUM, "titanium_hoe");
        titaniumSword = new ItemModSword(MATERIAL_TITANIUM, "titanium_sword");
    }

    public static void register(){
        registerTool(titaniumPickaxe);
        registerTool(titaniumAxe);
        registerTool(titaniumShovel);
        registerTool(titaniumHoe);
        registerTool(titaniumSword);
    }

    public static void registerRenders(){
        registerRender(titaniumPickaxe);
        registerRender(titaniumAxe);
        registerRender(titaniumShovel);
        registerRender(titaniumHoe);
        registerRender(titaniumSword);
    }

    public static void registerTool(Item tool){
        tool.setCreativeTab(MinecraftModProject.MMP);
        ForgeRegistries.ITEMS.register(tool);
        Utils.getLogger().info("Registered tool: " + tool.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item tool) {
        ModelLoader.setCustomModelResourceLocation(tool, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, tool.getUnlocalizedName().substring(5)), "inventory"));
        Utils.getLogger().info("Registered render for " + tool.getUnlocalizedName().substring(5));
    }

}
