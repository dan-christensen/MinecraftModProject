package com.dan.MinecraftModProject.blocks.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * com.dan.MinecraftModProject.blocks.item.MinecraftModProject
 * Created by dan on 8/14/17.
 */
public class ItemBlockBreaker extends ItemBlock {
    public ItemBlockBreaker(Block block) {
        super(block);
        if (!(block instanceof IMetaBlockName)) {
            throw new IllegalArgumentException(String.format("The given block %s is not an instance of IMetaBlockName.", block.getUnlocalizedName()));
        }
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack) + "_" + ((IMetaBlockName) this.block).getSpecialName(stack);
    }

    public int getMetadata(int damage) {
        return damage;
    }
}
