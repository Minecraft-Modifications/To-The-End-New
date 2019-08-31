package com.relt.toten.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.relt.toten.misc.BlockTab;
import com.relt.toten.misc.MaterialTab;
import com.relt.toten.misc.ToolTab;
import com.relt.toten.proxy.CommonProxy;
import com.relt.toten.reference.Reference;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION,
	acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSIONS)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	//Creative Tab
	
	public static final CreativeTabs BLOCK_TAB = new BlockTab ("block_tab");
	public static final CreativeTabs MATERIAL_TAB = new MaterialTab ("material_tab");
	public static final CreativeTabs TOOL_TAB = new ToolTab ("tool_tab");

	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	};
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {};
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {};
	
	
}
