package com.relt.toten.world.generate;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGenMinable {
	public void init(FMLInitializationEvent e){    
		GameRegistry.registerWorldGenerator(new VandiliyGenerator(), 0);
	}
}
