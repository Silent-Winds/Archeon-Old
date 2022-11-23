
package net.aethyus.archeon.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.aethyus.archeon.block.WetGrassBlockBlock;
import net.aethyus.archeon.ArcheonModElements;

@ArcheonModElements.ModElement.Tag
public class ArcheonBlocksItemGroup extends ArcheonModElements.ModElement {
	public ArcheonBlocksItemGroup(ArcheonModElements instance) {
		super(instance, 338);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabarcheon_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(WetGrassBlockBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
