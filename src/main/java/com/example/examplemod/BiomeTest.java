package com.example.examplemod;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import java.util.Random;

public class BiomeTest extends Biome {
    protected boolean sunflowers;

    public BiomeTest(boolean hasSunflowers, Biome.BiomeProperties properties) {
        super(properties);
    }

    @Override
    public void decorate(World worldIn, Random rand, BlockPos pos) {
        System.out.println("====================================> HIT");
    }
}