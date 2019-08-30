package com.relt.ToTEN.utils.handlers;

import com.relt.ToTEN.init.InitItems;
import com.relt.ToTEN.utils.interfaces.IHasModel;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegisterHandler {
	
	@SubscribeEvent
	public static void OnItemRegister(RegistryEvent.Register<Item> event){
		event.getRegistry().registerAll(InitItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event){
		for(Item item : InitItems.ITEMS){
			if(item instanceof IHasModel){
				((IHasModel)item).registerModels();
			}
		} 
	}

}
