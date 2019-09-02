package com.relt.toten.items;

import com.relt.toten.init.InitItems;
import com.relt.toten.main.Main;
import com.relt.toten.utils.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemVermutIngot extends Item implements IHasModel{

	public ItemVermutIngot(String name) {
		setCreativeTab(Main.MATERIAL_TAB);
		setRegistryName(name);
		setUnlocalizedName(name);
		
		InitItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
