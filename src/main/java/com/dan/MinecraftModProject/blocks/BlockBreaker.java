package com.dan.MinecraftModProject.blocks;

import com.dan.MinecraftModProject.Reference;
import com.dan.MinecraftModProject.blocks.item.IMetaBlockName;
import com.dan.MinecraftModProject.handlers.HandlerEnum;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

/**
 * com.dan.MinecraftModProject.blocks.MinecraftModProject
 * Created by dan on 8/14/17.
 */
public class BlockBreaker extends Block implements IMetaBlockName{

    public static final PropertyEnum TYPE = PropertyEnum.create("type", HandlerEnum.ChipTypes.class);

    public BlockBreaker(String unlocalizedName) {
        super(Material.ROCK);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, HandlerEnum.ChipTypes.BASIC));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{TYPE});
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        HandlerEnum.ChipTypes type = (HandlerEnum.ChipTypes) state.getValue(TYPE);
        return type.getId();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(TYPE, HandlerEnum.ChipTypes.values()[meta]);
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list) {
        for (int i = 0; i < HandlerEnum.ChipTypes.values().length; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }

    @Override
    public String getSpecialName(ItemStack stack) {
        return HandlerEnum.ChipTypes.values()[stack.getItemDamage()].getName();
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return getMetaFromState(state);
    }
}
