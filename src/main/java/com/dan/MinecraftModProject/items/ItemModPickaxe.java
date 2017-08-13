package com.dan.MinecraftModProject.items;

import com.dan.MinecraftModProject.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

/**
 * com.dan.MinecraftModProject.items.MinecraftModProject
 * Created by dan on 8/11/17.
 */
public class ItemModPickaxe extends ItemPickaxe{

    public ItemModPickaxe(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
    }
}
