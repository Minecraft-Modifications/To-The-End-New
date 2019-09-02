package com.relt.toten.items;

import com.relt.toten.init.InitItems;
import com.relt.toten.main.Main;
import com.relt.toten.utils.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemDremdiyStick extends Item implements IHasModel{
	

	public ItemDremdiyStick(String name) {
		setCreativeTab(Main.MISC_TAB);
		setRegistryName(name);
		setUnlocalizedName(name);
		
		InitItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
