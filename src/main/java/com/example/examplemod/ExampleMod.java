package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    private BiomeHandler biomeHandler = new BiomeHandler();
    private BiomeTest biomeTest;
    private BlockTest blockTest;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        
        biomeTest = new BiomeTest(true, new Biome.BiomeProperties("Test Biome"));
        biomeHandler.registerOverworldBiomes(biomeTest, BiomeManager.BiomeType.WARM, true, 10);

        blockTest = new BlockTest(Material.GROUND);

        MinecraftForge.EVENT_BUS.register(new BiomeHandler());
        MinecraftForge.EVENT_BUS.register(new MovementHandler());
    }


    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    public class MovementHandler {
        @SubscribeEvent
        public void whatBiome(TickEvent.PlayerTickEvent event) {
            Entity player = event.player;
            World playerWorld = player.world;
            double prevX = (player.prevPosX);
            double prevY = (player.prevPosY);
            double prevZ = (player.prevPosZ);

            double x = (player.posX);
            double y = (player.posY);
            double z = (player.posZ);

            Biome currentBiome = playerWorld.getBiome(new BlockPos(x, y, z));

            boolean hasMoved = prevX != x || prevY != y || prevZ != z;

            if (hasMoved) {
//                System.out.println("======================================> [X:" + Math.floor(x) + " Y: " + Math.floor(y) + " Z:" + Math.floor(z) + "]");
//                System.out.println("======================================> Current Biome [" + currentBiome.getBiomeName() + "]");
            }
        }
    }

    public class BiomeHandler {
        public void registerOverworldBiomes(Biome biome, net.minecraftforge.common.BiomeManager.BiomeType type, boolean isSpawnBiome, int weight) {

            BiomeManager.addBiome(type, new net.minecraftforge.common.BiomeManager.BiomeEntry(biome, weight));
            if (isSpawnBiome) {
                BiomeManager.addSpawnBiome(biome);
            }
            BiomeManager.addStrongholdBiome(biome);
        }

        @SubscribeEvent
        public void registerBiomes(RegistryEvent.Register<Biome> event) {
            event.getRegistry().register(biomeTest.setRegistryName(biomeTest.getBiomeName()));
        }

        @SubscribeEvent
        public void registerBlock(RegistryEvent.Register<Block> event) {
            event.getRegistry().register(blockTest);
        }
    }

    @SubscribeEvent
    public void registerItem(RegistryEvent.Register<Item> event) {
//        event.getRegistry().register(new ItemBlock(blockTest).setRegistryName(blockTest.getRegistryName()));
        event.getRegistry().register(new ItemBlock(blockTest).setRegistryName(Blocks.GRASS.getRegistryName()));
    }
}
