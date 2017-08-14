package com.dan.MinecraftModProject.proxy;

import com.dan.MinecraftModProject.Reference;
import com.dan.MinecraftModProject.init.ModArmor;
import com.dan.MinecraftModProject.init.ModBlocks;
import com.dan.MinecraftModProject.init.ModItems;
import com.dan.MinecraftModProject.init.ModTools;
import com.dan.MinecraftModProject.utils.Utils;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

/**
 * com.dan.MinecraftModProject.proxy.MinecraftModProject
 * Created by dan on 8/11/17.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        Utils.getLogger().info("Client Proxy registering renders");
        ModItems.registerRenders();
        ModTools.registerRenders();
        ModArmor.registerRenders();
        ModBlocks.registerRenders();
    }

    @Override
    public void registerModelBakeryVariants() {
        ModelBakery.registerItemVariants(ModItems.chip, new ResourceLocation(Reference.MODID, "chip_basic"));
        ModelBakery.registerItemVariants(ModItems.chip, new ResourceLocation(Reference.MODID, "chip_advanced"));
        ModelBakery.registerItemVariants(Item.getItemFromBlock(ModBlocks.blockBreaker), new ResourceLocation(Reference.MODID, "block_breaker_basic"));
        ModelBakery.registerItemVariants(Item.getItemFromBlock(ModBlocks.blockBreaker), new ResourceLocation(Reference.MODID, "block_breaker_advanced"));
    }
}
