package com.relt.toten.items;

import com.relt.toten.init.InitItems;
import com.relt.toten.main.Main;
import com.relt.toten.utils.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemDremidiyNugget extends Item implements IHasModel {
	
	public ItemDremidiyNugget(String name){
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(Main.MATERIAL_TAB);
		
		InitItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
