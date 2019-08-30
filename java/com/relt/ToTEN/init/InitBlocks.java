package com.relt.toten.init;

import java.util.ArrayList;
import java.util.List;

import com.relt.toten.blocks.DremidiyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InitBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block DREMIDIY_ORE = new DremidiyOre("dremidiy_ore", Material.ROCK);

}
