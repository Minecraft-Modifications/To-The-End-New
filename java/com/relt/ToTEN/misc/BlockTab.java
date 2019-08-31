package com.relt.toten.misc;

import com.relt.toten.init.InitBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockTab extends CreativeTabs {


	public BlockTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(Item.getItemFromBlock(InitBlocks.DREMIDIY_ORE));
		
	}
	

}
