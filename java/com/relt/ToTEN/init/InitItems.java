package com.relt.toten.init;

import java.util.ArrayList;
import java.util.List;

import com.relt.toten.items.ItemDremdiyStick;
import com.relt.toten.items.ItemDremidiyIngot;
import com.relt.toten.items.ItemDremidiyNugget;
import com.relt.toten.items.ItemDremidiyPickaxe;
import com.relt.toten.items.ItemVandiliyIngot;
import com.relt.toten.items.ItemVandiliyNugget;
import com.relt.toten.items.ItemVandiliyPickaxe;
import com.relt.toten.items.ItemVermutIngot;
import com.relt.toten.items.ItemVermutKatana;
import com.relt.toten.main.Main;

import net.minecraft.item.Item;

public class InitItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item DREMIDIY_INGOT = new ItemDremidiyIngot("dremidiy_ingot");
	public static final Item DREMIDIY_NUGGET = new ItemDremidiyNugget("dremidiy_nugget");
	public static final Item VANDILIY_INGOT = new ItemVandiliyIngot("vandiliy_ingot");
	public static final Item VANDILIY_NUGGET = new ItemVandiliyNugget("vandiliy_nugget");
	public static final Item DREMIDIY_STICK = new ItemDremdiyStick ("dremidiy_stick");
	public static final Item VERMUT_INGOT = new ItemVermutIngot ("vermut_ingot") ;
	
	//Tools
	public static final Item DREMIDIY_PICKAXE = new ItemDremidiyPickaxe("dremidiy_pickaxe", Main.DREMIDIY_MATERIAL);
	public static final Item VANDILIY_PICKAXE = new ItemVandiliyPickaxe("vandiliy_pickaxe", Main.VANDILIY_MATERIAL);
	
	//Weapon
	public static final Item VERMUT_KATANA = new ItemVermutKatana("vermut_katana", Main.VERMUT_MATERIAL);
}
