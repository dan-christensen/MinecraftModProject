package com.dan.MinecraftModProject.handlers;

import com.dan.MinecraftModProject.init.ModArmor;
import com.dan.MinecraftModProject.init.ModBlocks;
import com.dan.MinecraftModProject.init.ModItems;
import com.dan.MinecraftModProject.init.ModTools;
import com.dan.MinecraftModProject.utils.Utils;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * com.dan.MinecraftModProject.handlers.MinecraftModProject
 * Created by Dan on 8/12/2017.
 */
public class HandlerRecipe {
    public static void registerCraftingRecipes() {
        registerToolRecipe(ModItems.titaniumIngot, ModTools.titaniumPickaxe, ModTools.titaniumAxe, ModTools.titaniumShovel, ModTools.titaniumHoe, ModTools.titaniumSword);
        registerArmorRecipie(ModItems.titaniumIngot, ModArmor.titaniumHelmet, ModArmor.titaniumChestplate, ModArmor.titaniumLeggings, ModArmor.titaniumBoots);
        Utils.getLogger().info("Registered crafting recipes");
    }

    public static void registerSmeltingRecipes() {
        GameRegistry.addSmelting(ModBlocks.titaniumOre, new ItemStack(ModItems.titaniumIngot, 1), 1.7f);
        Utils.getLogger().info("Registered smelting recipes");
    }

    private static void registerToolRecipe(Item ingot, Item pickaxe, Item axe, Item shovel, Item hoe, Item sword) {
        GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[]{"III", " S ", " S ", 'I', ingot, 'S', Items.STICK});

        GameRegistry.addRecipe(new ItemStack(axe), new Object[]{"II ", "IS ", " S ", 'I', ingot, 'S', Items.STICK});
        GameRegistry.addRecipe(new ItemStack(axe), new Object[]{" II", " SI", " S ", 'I', ingot, 'S', Items.STICK});

        GameRegistry.addRecipe(new ItemStack(shovel), new Object[]{" I ", " S ", " S ", 'I', ingot, 'S', Items.STICK});
        GameRegistry.addRecipe(new ItemStack(shovel), new Object[]{"I  ", "S  ", "S  ", 'I', ingot, 'S', Items.STICK});
        GameRegistry.addRecipe(new ItemStack(shovel), new Object[]{"  I", "  S", "  S", 'I', ingot, 'S', Items.STICK});

        GameRegistry.addRecipe(new ItemStack(hoe), new Object[]{"II ", " S ", " S ", 'I', ingot, 'S', Items.STICK});
        GameRegistry.addRecipe(new ItemStack(hoe), new Object[]{" II", " S ", " S ", 'I', ingot, 'S', Items.STICK});


        GameRegistry.addRecipe(new ItemStack(sword), new Object[]{" I ", " I ", " S ", 'I', ingot, 'S', Items.STICK});
        GameRegistry.addRecipe(new ItemStack(sword), new Object[]{"I  ", "I  ", "S  ", 'I', ingot, 'S', Items.STICK});
        GameRegistry.addRecipe(new ItemStack(sword), new Object[]{"  I", "  I", "  S", 'I', ingot, 'S', Items.STICK});
    }

    private static void registerArmorRecipie(Item ingot, Item helmet, Item chestplate, Item leggings, Item boots) {
        GameRegistry.addRecipe(new ItemStack(helmet), new Object[]{"III", "I I", "   ", 'I', ingot});
        GameRegistry.addRecipe(new ItemStack(helmet), new Object[]{"   ", "III", "I I", 'I', ingot});


        GameRegistry.addRecipe(new ItemStack(chestplate), new Object[]{"I I", "III", "III", 'I', ingot});

        GameRegistry.addRecipe(new ItemStack(leggings), new Object[]{"III", "I I", "I I", 'I', ingot});

        GameRegistry.addRecipe(new ItemStack(boots), new Object[]{"   ", "I I", "I I", 'I', ingot});
        GameRegistry.addRecipe(new ItemStack(boots), new Object[]{"I I", "I I", "   ", 'I', ingot});
    }
}
