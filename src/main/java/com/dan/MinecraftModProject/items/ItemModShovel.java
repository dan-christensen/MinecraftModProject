package com.dan.MinecraftModProject.items;

import com.dan.MinecraftModProject.Reference;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

/**
 * com.dan.MinecraftModProject.items.MinecraftModProject
 * Created by Dan on 8/12/2017.
 */
public class ItemModShovel extends ItemSpade{
    public ItemModShovel(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
    }
}
