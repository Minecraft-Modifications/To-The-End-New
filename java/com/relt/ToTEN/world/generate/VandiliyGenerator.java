package com.relt.toten.world.generate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

import com.google.common.base.Predicate;

import com.relt.toten.init.InitBlocks;

public class VandiliyGenerator implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.getDimension() == 0)
			runGenerator(InitBlocks.VANDILIY_ORE.getDefaultState(), 10, 20, 20, 70, BlockStateMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
		
	}
	public void runGenerator(IBlockState blockToGen, int blockAmount, int chancesToSpawn, int minHeight, int maxHeight, Predicate<IBlockState> blockToReplace, World world, Random rand, int chunk_X, int chunk_Z){
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
		return;
		WorldGenMinable generator = new WorldGenMinable(InitBlocks.VANDILIY_ORE, 5, Blocks.STONE);
		int heightdiff = 16 - 0 +1;    for (int i = 0; i < 410; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);        
			int y = minHeight + rand.nextInt(heightdiff);        
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));    
		}
	}
}
