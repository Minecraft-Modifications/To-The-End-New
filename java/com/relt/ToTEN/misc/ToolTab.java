package com.relt.toten.misc;

import com.relt.toten.init.InitItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ToolTab extends CreativeTabs {

	public ToolTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack (InitItems.VANDILIY_INGOT);
	}

}
