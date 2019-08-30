package com.relt.toten.init;

import java.util.ArrayList;
import java.util.List;

import com.relt.toten.items.ItemDremidiyIngot;
import com.relt.toten.items.ItemDremidiyNugget;
import com.relt.toten.items.ItemVandiliyIngot;
import com.relt.toten.items.ItemVandiliyNugget;

import net.minecraft.item.Item;

public class InitItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item DREMIDIY_INGOT = new ItemDremidiyIngot("dremidiy_ingot");
	public static final Item DREMIDIY_NUGGET = new ItemDremidiyNugget("dremidiy_nugget");
	public static final Item VANDILIY_INGOT = new ItemVandiliyIngot("vandiliy_ingot");
	public static final Item VANDILIY_NUGGET = new ItemVandiliyNugget("vandiliy_nugget");
}
