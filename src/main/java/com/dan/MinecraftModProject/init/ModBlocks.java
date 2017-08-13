package com.dan.MinecraftModProject.init;

import com.dan.MinecraftModProject.MinecraftModProject;
import com.dan.MinecraftModProject.Reference;
import com.dan.MinecraftModProject.blocks.BlockTitaniumOre;
import com.dan.MinecraftModProject.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * com.dan.MinecraftModProject.init.MinecraftModProject
 * Created by dan on 8/11/17.
 */
public class ModBlocks {

    public static Block titaniumOre;

    public static void init() {
        titaniumOre = new BlockTitaniumOre("titanium_ore", "titanium_ore");
    }

    public static void register() {
        registerBlock(titaniumOre);
    }

    public static void registerRenders() {
        registerRender(titaniumOre);
    }

    public static void registerBlock(Block block) {
        block.setCreativeTab(MinecraftModProject.MMP);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        Utils.getLogger().info("Registered block " + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
        Utils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
    }
}
