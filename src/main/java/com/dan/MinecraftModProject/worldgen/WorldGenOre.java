package com.dan.MinecraftModProject.worldgen;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * com.dan.MinecraftModProject.worldgen.MinecraftModProject
 * Created by dan on 8/14/17.
 */
public class WorldGenOre implements IWorldGenerator {

    private WorldGenerator titaniumOverworldGen;

    public WorldGenOre() {
//        titaniumOverworldGen = new WorldGenMinable(ModBlocks.titaniumOre.getDefaultState().withProperty(BlockTitaniumOre, ))
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

    }
}
