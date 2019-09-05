package com.relt.toten.world.generate;

import java.util.Random;

import com.relt.toten.init.InitBlocks;
import com.relt.toten.blocks.DremidiyOre;
import com.relt.toten.blocks.VandiliyOre;
import com.relt.toten.blocks.VermutOre;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOreGenerator implements IWorldGenerator
{
<<<<<<< HEAD
=======
	
	//Добовляешь WorldGenerator для своей руды, у меня это руда соли "salt_ore".
>>>>>>> master
	private WorldGenerator dremidiy_ore;
	private WorldGenerator vandiliy_ore;
	private WorldGenerator vermut_ore;
	
	public WorldGenOreGenerator() 
	{
<<<<<<< HEAD
=======
		//в этом констуркторе реализуешь свой блок руды. Наиболее частый это WorldGenMinable,
		//потому что он делает руду добываемой. И указываешь там свой блок. У меня это SALT_ORE.
>>>>>>> master
		dremidiy_ore = new WorldGenMinable(InitBlocks.DREMIDIY_ORE.getDefaultState(), 8);
		vandiliy_ore = new WorldGenMinable(InitBlocks.VANDILIY_ORE.getDefaultState(), 8);
		vermut_ore = new WorldGenMinable(InitBlocks.VERMUT_ORE.getDefaultState(), 8);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
<<<<<<< HEAD
=======
		//- 1 это нижний мир (ад), 0 - это нормальный мир, 1 - это край.
>>>>>>> master
		switch(world.provider.getDimension())
		{
		case -1:
			
			runGenerator(vermut_ore, world, random, chunkX, chunkZ, 60, 30, 120);
			
			break;
			
		case 0:
<<<<<<< HEAD

=======
			
			//прописываешь runGenerator(), и указываешь генератор который хочешь запустить, далее world, это
			//мир в котором будет генерировать руда, он всегда будет world, не меняй эту переменную!
			//random значит что руда будет генерировтся рандомно по всем осям XYZ. 
			//chance это шанс паявления руды, minHeight и maxHeight этьо минимальная и максимальная высота на 
			//которой може генерироваться руда.
>>>>>>> master
			runGenerator(dremidiy_ore, world, random, chunkX, chunkZ, 3, 1, 16);
			runGenerator(vandiliy_ore, world, random, chunkX, chunkZ, 1, 1, 10);
			
			break;
			
		case 1:
			
			
		}
	}
	
<<<<<<< HEAD
=======
	/**
	* Этот метод будет генерировать руду  в мире. Этот метод не меняй. Ну если ты только знаешь что менять.
	*/
>>>>>>> master
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}