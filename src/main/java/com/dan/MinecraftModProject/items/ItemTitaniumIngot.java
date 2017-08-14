package com.dan.MinecraftModProject.items;

import com.dan.MinecraftModProject.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

/**
 * com.dan.MinecraftModProject.items.MinecraftModProject
 * Created by dan on 8/11/17.
 */
public class ItemTitaniumIngot extends Item {

    public ItemTitaniumIngot(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
    }
}
