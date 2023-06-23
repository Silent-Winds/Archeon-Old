
package net.aethyus.archeon.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.aethyus.archeon.itemgroup.ArcheonBlocksItemGroup;
import net.aethyus.archeon.ArcheonModElements;

import java.util.List;
import java.util.Collections;

@ArcheonModElements.ModElement.Tag
public class PeaksSnowBlock extends ArcheonModElements.ModElement {
	@ObjectHolder("archeon:peaks_snow")
	public static final Block block = null;

	public PeaksSnowBlock(ArcheonModElements instance) {
		super(instance, 273);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ArcheonBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.SNOW).sound(SoundType.SNOW).hardnessAndResistance(0.6000000000000001f, 1f).setLightLevel(s -> 0)
					.harvestLevel(0).harvestTool(ToolType.SHOVEL));
			setRegistryName("peaks_snow");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
