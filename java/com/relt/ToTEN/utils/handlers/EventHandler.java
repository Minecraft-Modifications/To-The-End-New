package com.relt.toten.utils.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {
	
	@SubscribeEvent
	public void onLoot(LootTableLoadEvent e)
	{
	    if (LootTableList.CHESTS_SPAWN_BONUS_CHEST.equals(e.getName()))
	    {
	        ResourceLocation loc = new ResourceLocation("toten", "chests/toten_dungeon");
	        LootTable customLootTable = e.getLootTableManager().getLootTableFromLocation(loc);
	        e.setTable(customLootTable);
	    }
	}

}
