package com.dan.MinecraftModProject.init;

import com.dan.MinecraftModProject.MinecraftModProject;
import com.dan.MinecraftModProject.Reference;
import com.dan.MinecraftModProject.handlers.HandlerEnum;
import com.dan.MinecraftModProject.items.ItemChip;
import com.dan.MinecraftModProject.items.ItemTitaniumIngot;
import com.dan.MinecraftModProject.utils.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * com.dan.MinecraftModProject.init.MinecraftModProject
 * Created by dan on 8/11/17.
 */
public class ModItems {

    public static Item titaniumIngot;
    public static Item chip;

    public static void init() {
        titaniumIngot = new ItemTitaniumIngot("titanium_ingot");
        chip = new ItemChip("chip");
    }

    public static void register() {
        registerItem(titaniumIngot);
        registerItem(chip);
    }

    public static void registerRenders() {
        registerRender(titaniumIngot);
        for (int i = 0; i < HandlerEnum.ChipTypes.values().length; i++) {
            registerRender(chip, i, "chip_" + HandlerEnum.ChipTypes.values()[i].getName());
        }
    }

    public static void registerItem(Item item) {
        item.setCreativeTab(MinecraftModProject.MMP);
        ForgeRegistries.ITEMS.register(item);
        Utils.printRegistered("item", item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        Utils.printRegisteredRender(item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item, int meta, String fileName) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
        Utils.printRegisteredRender(item.getUnlocalizedName().substring(5));
    }
}
