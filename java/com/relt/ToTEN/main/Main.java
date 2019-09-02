package com.relt.toten.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.SidedProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


import com.relt.toten.misc.BlockTab;
import com.relt.toten.misc.MaterialTab;
import com.relt.toten.misc.MiscTab;
import com.relt.toten.misc.ToolTab;
import com.relt.toten.proxy.CommonProxy;
import com.relt.toten.reference.Reference;
import com.relt.toten.utils.handlers.RegisterHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION,
	acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSIONS)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	//Materials
	public static Item.ToolMaterial DREMIDIY_MATERIAL = EnumHelper.addToolMaterial("toten:dremidiy", 4, 3072, 15.0F, 6.0F, 15);
	public static Item.ToolMaterial VANDILIY_MATERIAL = EnumHelper.addToolMaterial("toten:vandiliy", 4, 3072, 22.0F, 6.0F, 15);
	public static Item.ToolMaterial VERMUT_MATERIAL = EnumHelper.addToolMaterial("toten:vermut", 0, 3576, 0F, 20F, 15);
	
	
	//Creative Tab
	
	public static final CreativeTabs BLOCK_TAB = new BlockTab ("block_tab");
	public static final CreativeTabs MATERIAL_TAB = new MaterialTab ("material_tab");
	public static final CreativeTabs TOOL_TAB = new ToolTab ("tool_tab");
	public static final CreativeTabs MISC_TAB = new MiscTab ("misc_tab");

	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	};
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		RegisterHandler.otherRegister();	
	};
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {};
	
	
}
