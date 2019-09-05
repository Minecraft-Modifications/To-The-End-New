package com.relt.toten.init;

import java.util.ArrayList;
import java.util.List;

import com.relt.toten.items.ItemDremdiyStick;
import com.relt.toten.items.ItemDremidiyCap;
import com.relt.toten.items.ItemDremidiyHandElements;
import com.relt.toten.items.ItemDremidiyIngot;
import com.relt.toten.items.ItemDremidiyNugget;
import com.relt.toten.items.ItemDremidiyPickaxe;
import com.relt.toten.items.ItemDremidiyPlate;
import com.relt.toten.items.ItemNeuron;
import com.relt.toten.items.ItemSharpenedIron;
import com.relt.toten.items.ItemVandiliyIngot;
import com.relt.toten.items.ItemVandiliyNugget;
import com.relt.toten.items.ItemVandiliyPickaxe;
import com.relt.toten.items.ItemVandiliyPlate;
import com.relt.toten.items.ItemVermutIngot;
import com.relt.toten.items.ItemVermutKatana;
import com.relt.toten.items.ItemVermutPlate;
import com.relt.toten.main.Main;

import net.minecraft.item.Item;

public class InitItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final Item DREMIDIY_INGOT = new ItemDremidiyIngot("dremidiy_ingot");
	public static final Item VANDILIY_INGOT = new ItemVandiliyIngot("vandiliy_ingot");
	public static final Item VERMUT_INGOT = new ItemVermutIngot ("vermut_ingot") ;
	public static final Item DREMIDIY_NUGGET = new ItemDremidiyNugget("dremidiy_nugget");	
	public static final Item VANDILIY_NUGGET = new ItemVandiliyNugget("vandiliy_nugget");
	
	//Misc
	public static final Item DREMIDIY_STICK = new ItemDremdiyStick ("dremidiy_stick");
	public static final Item NEURON = new ItemNeuron ("neuron");
	public static final Item DREMIDIY_CAP = new ItemDremidiyCap ("dremidiy_cap");
	//public static final Item VANDILIY_CAP = new ItemVandiliyCap ("vandiliy_cap");
	//public static final Item VERMUT_CAP = new ItemVermutCap ("vermut_cap");	
	public static final Item SHRAPENED_IRON = new ItemSharpenedIron ("sharpened_iron");	
	public static final Item DREMIDIY_HAND_ELEMENTS = new ItemDremidiyHandElements ("dremidiy_hand_elements");
	//public static final Item VANDILIY_HAND_ELEMENTS = new ItemVandiliyHandElements ("vandiliy_hand_elements");
	//public static final Item VERMUT_HAND_ELEMENTS = new ItemVermutHandElements ("vermut_hand_elements");
	
	//Plates
	public static final Item DREMIDIY_PLATE = new ItemDremidiyPlate("dremidiy_plate");
	public static final Item VANDILIY_PLATE = new ItemVandiliyPlate("vandiliy_plate");
	public static final Item VERMUT_PLATE = new ItemVermutPlate ("vermut_plate");
	
	//Tools
	public static final Item DREMIDIY_PICKAXE = new ItemDremidiyPickaxe("dremidiy_pickaxe", Main.DREMIDIY_MATERIAL);
	public static final Item VANDILIY_PICKAXE = new ItemVandiliyPickaxe("vandiliy_pickaxe", Main.VANDILIY_MATERIAL);
	
	//Weapon
	public static final Item VERMUT_KATANA = new ItemVermutKatana("vermut_katana", Main.VERMUT_MATERIAL);
}
