package com.dan.MinecraftModProject.creativetabs;

import com.dan.MinecraftModProject.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * com.dan.MinecraftModProject.creativetabs.MinecraftModProject
 * Created by Dan on 8/12/2017.
 */
public class TabMMP extends CreativeTabs{
    public TabMMP(String label) {
        super("mmp");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.titaniumIngot);
    }
}
