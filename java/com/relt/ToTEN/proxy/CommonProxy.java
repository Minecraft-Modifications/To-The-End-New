package com.relt.toten.proxy;

import com.relt.toten.blocks.VandiliyOre;
import com.relt.toten.init.InitBlocks;
import com.relt.toten.init.InitItems;
import com.relt.toten.world.generate.WorldGenOreGenerator;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id){}
	
}
