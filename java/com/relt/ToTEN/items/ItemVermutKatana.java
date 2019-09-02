package com.relt.toten.items;

import com.relt.toten.init.InitItems;
import com.relt.toten.main.Main;
import com.relt.toten.utils.interfaces.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemVermutKatana extends ItemSword implements IHasModel{

	public ItemVermutKatana(String name, ToolMaterial material) {
		super(Main.VERMUT_MATERIAL);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(Main.TOOL_TAB);
		
		InitItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
