package com.dan.MinecraftModProject.init;

import com.dan.MinecraftModProject.MinecraftModProject;
import com.dan.MinecraftModProject.Reference;
import com.dan.MinecraftModProject.items.ItemModArmor;
import com.dan.MinecraftModProject.utils.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * com.dan.MinecraftModProject.init.MinecraftModProject
 * Created by dan on 8/14/17.
 */
public class ModArmor {

    public static final ItemArmor.ArmorMaterial MATERIAL_TITANIUM = EnumHelper.addArmorMaterial("titanium", Reference.MODID +":titanium", 66, new int[]{8, 24, 20, 8}, 18, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 10.0f);

    public static ItemArmor titaniumHelmet;
    public static ItemArmor titaniumChestplate;
    public static ItemArmor titaniumLeggings;
    public static ItemArmor titaniumBoots;

    public static void init() {
        titaniumHelmet = new ItemModArmor(MATERIAL_TITANIUM, 1, EntityEquipmentSlot.HEAD, "titanium_helmet");
        titaniumChestplate = new ItemModArmor(MATERIAL_TITANIUM, 1, EntityEquipmentSlot.CHEST, "titanium_chestplate");
        titaniumLeggings = new ItemModArmor(MATERIAL_TITANIUM, 2, EntityEquipmentSlot.LEGS, "titanium_leggings");
        titaniumBoots = new ItemModArmor(MATERIAL_TITANIUM, 1, EntityEquipmentSlot.FEET, "titanium_boots");
    }

    public static void register() {
        registerArmor(titaniumHelmet);
        registerArmor(titaniumChestplate);
        registerArmor(titaniumLeggings);
        registerArmor(titaniumBoots);
    }

    public static void registerRenders() {
        registerRender(titaniumHelmet);
        registerRender(titaniumChestplate);
        registerRender(titaniumLeggings);
        registerRender(titaniumBoots);
    }

    public static void registerArmor(Item armor) {
        armor.setCreativeTab(MinecraftModProject.MMP);
        ForgeRegistries.ITEMS.register(armor);
        Utils.getLogger().info("Registered armor: " + armor.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item armor) {
        ModelLoader.setCustomModelResourceLocation(armor, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, armor.getUnlocalizedName().substring(5)), "inventory"));
        Utils.getLogger().info("Registered render for: " + armor.getUnlocalizedName().substring(5));
    }
}
