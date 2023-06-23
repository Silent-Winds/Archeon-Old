
package net.aethyus.archeon.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.aethyus.archeon.block.RedLycorisBlock;
import net.aethyus.archeon.ArcheonModElements;

@ArcheonModElements.ModElement.Tag
public class ArcheonFaunaItemGroup extends ArcheonModElements.ModElement {
	public ArcheonFaunaItemGroup(ArcheonModElements instance) {
		super(instance, 526);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabarcheon_fauna") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedLycorisBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
