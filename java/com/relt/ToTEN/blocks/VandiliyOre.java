package com.relt.toten.blocks;

import com.google.common.graph.ElementOrder.Type;
import com.relt.toten.init.InitBlocks;
import com.relt.toten.init.InitItems;
import com.relt.toten.main.Main;
import com.relt.toten.utils.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class VandiliyOre extends Block implements IHasModel{

	public VandiliyOre(String name, Material material) {
		super(material);
		
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(Main.BLOCK_TAB);
		setHardness(3F);
		setResistance(3F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 4);
		
		
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
