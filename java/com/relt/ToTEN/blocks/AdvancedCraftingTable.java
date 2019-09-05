package com.relt.toten.blocks;

import com.relt.toten.init.InitBlocks;
import com.relt.toten.init.InitItems;
import com.relt.toten.main.Main;
import com.relt.toten.utils.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AdvancedCraftingTable extends Block implements IHasModel{
	
	 public static final PropertyDirection FACING = PropertyDirection.create("facing");
	
	 public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){

		 if (worldIn.isRemote)
	        {
	            return true;
	        }
	        else
	        {
	            playerIn.displayGui(new BlockWorkbench.InterfaceCraftingTable(worldIn, pos));
	            playerIn.addStat(StatList.CRAFTING_TABLE_INTERACTION);
	            return true;
	        }
		 
	 }
	 
	public AdvancedCraftingTable(String name, Material material) {
		super(material.WOOD);
		
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(Main.BLOCK_TAB);
		setHardness(2F);
		setResistance(2F);
		setSoundType(SoundType.WOOD);
		setHarvestLevel("axe", 0);
		
		
		
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
	
}
