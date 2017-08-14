package com.dan.MinecraftModProject.init;

import com.dan.MinecraftModProject.MinecraftModProject;
import com.dan.MinecraftModProject.Reference;
import com.dan.MinecraftModProject.blocks.BlockBreaker;
import com.dan.MinecraftModProject.blocks.BlockTitaniumOre;
import com.dan.MinecraftModProject.blocks.item.ItemBlockBreaker;
import com.dan.MinecraftModProject.handlers.HandlerEnum;
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

//    public static final PropertyEnum TYPE = PropertyEnum.create("type", OreType.class);

    public static Block titaniumOre;
    public static Block blockBreaker;

    public static void init() {
        titaniumOre = new BlockTitaniumOre("titanium_ore");
        blockBreaker = new BlockBreaker("block_breaker");
    }

    public static void register() {
        registerBlock(titaniumOre);
        registerBlock(blockBreaker, new ItemBlockBreaker(blockBreaker));
    }

    public static void registerRenders() {
        registerRender(titaniumOre);
        for (int i = 0; i < HandlerEnum.ChipTypes.values().length; i++) {
            registerRender(blockBreaker, i, "block_breaker_" + HandlerEnum.ChipTypes.values()[i].getName());
        }
    }

    public static void registerBlock(Block block) {
        block.setCreativeTab(MinecraftModProject.MMP);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        Utils.printRegistered("block", block.getUnlocalizedName().substring(5));
    }

    public static void registerBlock(Block block, ItemBlock itemBlock) {
        block.setCreativeTab(MinecraftModProject.MMP);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock.setRegistryName(block.getRegistryName()));
        Utils.printRegistered("block", block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
        Utils.printRegisteredRender(block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block, int meta, String fileName) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
        Utils.printRegisteredRender(block.getUnlocalizedName().substring(5));
    }
}
