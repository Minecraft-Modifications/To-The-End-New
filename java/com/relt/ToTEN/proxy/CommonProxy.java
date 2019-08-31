package com.relt.toten.proxy;

import com.relt.toten.init.InitBlocks;
import com.relt.toten.init.InitItems;
import com.relt.toten.world.generate.VandiliyGenerator;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id){}
	public void init(FMLInitializationEvent e){    
		GameRegistry.registerWorldGenerator(new VandiliyGenerator(), 0);
		GameRegistry.addSmelting(new ItemStack(InitBlocks.VANDILIY_ORE), new ItemStack(InitItems.VANDILIY_INGOT), 100);
	}
}
