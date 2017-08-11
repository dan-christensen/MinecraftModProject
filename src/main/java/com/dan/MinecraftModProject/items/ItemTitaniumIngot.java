package com.dan.MinecraftModProject.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * com.dan.MinecraftModProject.items.MinecraftModProject
 * Created by dan on 8/11/17.
 */
public class ItemTitaniumIngot extends Item {

    public ItemTitaniumIngot(String unlocalizedName, String regestryName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(regestryName);
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }
}
