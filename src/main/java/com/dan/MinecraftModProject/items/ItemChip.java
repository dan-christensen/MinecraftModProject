package com.dan.MinecraftModProject.items;

import com.dan.MinecraftModProject.Reference;
import com.dan.MinecraftModProject.handlers.HandlerEnum;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

/**
 * com.dan.MinecraftModProject.items.MinecraftModProject
 * Created by dan on 8/14/17.
 */
public class ItemChip extends Item {

    public ItemChip(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
        this.setHasSubtypes(true);
    }

    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems) {
        for (int i = 0; i < HandlerEnum.ChipTypes.values().length; i++) {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        for (int i = 0; i < HandlerEnum.ChipTypes.values().length; i++) {
            if (stack.getItemDamage() == i) {
                return this.getUnlocalizedName() + "_" + HandlerEnum.ChipTypes.values()[i].getName();
            }
            else {
                continue;
            }
        }
        return this.getUnlocalizedName() + "_" + HandlerEnum.ChipTypes.BASIC.getName();
    }
}
