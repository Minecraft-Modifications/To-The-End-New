package com.relt.ToTEN.items;

import com.relt.ToTEN.init.InitItems;
import com.relt.ToTEN.main.Main;
import com.relt.ToTEN.utils.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemDremidiyIngot extends Item implements IHasModel {
	
	public ItemDremidiyIngot(String name) {
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		
		InitItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory**");
		
	}

}
