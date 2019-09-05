package com.relt.toten.misc;

import com.relt.toten.init.InitBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockTab extends CreativeTabs {

	@Override
	public CreativeTabs setBackgroundImageName(String texture) {
		setBackgroundImageName("toten:textures/blocks/dremidiy_ore.png");
		return super.setBackgroundImageName(texture);
	}
	
	public BlockTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(Item.getItemFromBlock(InitBlocks.DREMIDIY_ORE));
		
	}
	

}
