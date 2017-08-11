package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.creativetab.CreativeTabs;

/**
 * com.example.examplemod.MinecraftModProject
 * Created by dan on 8/8/17.
 */
public class BlockTest extends Block {

    public BlockTest(Material materialIn) {
        super(materialIn);
        this.setUnlocalizedName("testBlock");
        this.setRegistryName("test_block");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setDefaultState(this.blockState.getBaseState());
    }

    @Override
    public BlockStateContainer createBlockState(){
        return new BlockStateContainer(this);
    }
}
