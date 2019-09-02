package com.relt.toten.misc;

import com.relt.toten.init.InitItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MiscTab extends CreativeTabs {

	public MiscTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(InitItems.DREMIDIY_STICK);
	}

}
