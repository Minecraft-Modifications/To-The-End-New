package com.relt.toten.blocks;

import com.relt.toten.init.InitBlocks;
import com.relt.toten.init.InitItems;
import com.relt.toten.main.Main;
import com.relt.toten.utils.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class VermutOre extends Block implements IHasModel {

	public VermutOre(String name, Material material) {
		super(material);
		
		setCreativeTab(Main.BLOCK_TAB);
		setRegistryName(name);
		setUnlocalizedName(name);
		setHarvestLevel("pickaxe", 4);
		setHardness(3F);
		setResistance(3F);
		setSoundType(SoundType.STONE);
		
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
	

}
