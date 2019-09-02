package com.relt.toten.items;

import com.relt.toten.init.InitItems;
import com.relt.toten.main.Main;
import com.relt.toten.utils.interfaces.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.world.storage.loot.functions.SetDamage;

public class ItemDremidiyPickaxe extends ItemPickaxe implements IHasModel{

	public ItemDremidiyPickaxe(String name, ToolMaterial material) {
		super(Main.DREMIDIY_MATERIAL);
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
