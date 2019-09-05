package com.relt.toten.items;

import com.relt.toten.init.InitItems;
import com.relt.toten.main.Main;
import com.relt.toten.utils.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemDremidiyPlate extends Item implements IHasModel{

	public ItemDremidiyPlate(String name) {
		
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(Main.MATERIAL_TAB);
		
		InitItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		
	}

}
