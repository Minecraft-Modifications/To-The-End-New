package com.relt.toten.items;

import com.relt.toten.init.InitItems;
import com.relt.toten.main.Main;
import com.relt.toten.utils.interfaces.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemVandiliyPickaxe extends ItemPickaxe implements IHasModel {

	public ItemVandiliyPickaxe(String name, ToolMaterial material) {
		super(Main.VANDILIY_MATERIAL);
		setCreativeTab(Main.TOOL_TAB);
		setRegistryName(name);
		setUnlocalizedName(name);
		
		InitItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	

}
