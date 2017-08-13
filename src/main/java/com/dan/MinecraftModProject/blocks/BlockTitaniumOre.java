package com.dan.MinecraftModProject.blocks;

import com.dan.MinecraftModProject.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import java.util.Random;

/**
 * com.dan.MinecraftModProject.blocks.MinecraftModProject
 * Created by dan on 8/11/17.
 */
public class BlockTitaniumOre extends Block{
    public BlockTitaniumOre(String unlocalizedName, String registryName) {
        super(Material.ROCK);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
        this.setHardness(20);
        this.setResistance(20);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
