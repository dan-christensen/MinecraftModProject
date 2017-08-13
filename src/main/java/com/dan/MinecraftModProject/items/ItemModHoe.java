package com.dan.MinecraftModProject.items;

import com.dan.MinecraftModProject.Reference;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;

/**
 * com.dan.MinecraftModProject.items.MinecraftModProject
 * Created by Dan on 8/12/2017.
 */
public class ItemModHoe extends ItemHoe{
    public ItemModHoe(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
    }
}
