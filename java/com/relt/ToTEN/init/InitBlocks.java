package com.relt.toten.init;

import java.util.ArrayList;
import java.util.List;

import com.relt.toten.blocks.AdvancedCraftingTable;
import com.relt.toten.blocks.DremidiyOre;
import com.relt.toten.blocks.VandiliyOre;
import com.relt.toten.blocks.VermutOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class InitBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	//Blocks
	public static final Block DREMIDIY_ORE = new DremidiyOre("dremidiy_ore", Material.ROCK);
	public static final Block VANDILIY_ORE = new VandiliyOre("vandiliy_ore", Material.ROCK);
	public static final Block VERMUT_ORE = new VermutOre("vermut_ore", Material.ROCK);
	public static final Block ADVANCED_CRAFTING_TABLE = new AdvancedCraftingTable ("advanced_crafting_table", Material.WOOD);
	
	
}
