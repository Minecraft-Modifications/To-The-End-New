package com.relt.toten.utils;

import com.relt.toten.init.InitBlocks;
import com.relt.toten.init.InitItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipes {
	
	public static void registerRecipes(){
		GameRegistry.addSmelting(new ItemStack(InitBlocks.DREMIDIY_ORE), new ItemStack(InitItems.DREMIDIY_INGOT, 1), 2.5F);
		GameRegistry.addSmelting(new ItemStack(InitBlocks.VANDILIY_ORE), new ItemStack(InitItems.VANDILIY_INGOT, 1), 5F);
	}

}
