
package net.aethyus.archeon.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.aethyus.archeon.item.PinkLycorisPetalItem;
import net.aethyus.archeon.ArcheonModElements;

@ArcheonModElements.ModElement.Tag
public class ArcheonMiscItemGroup extends ArcheonModElements.ModElement {
	public ArcheonMiscItemGroup(ArcheonModElements instance) {
		super(instance, 406);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabarcheon_misc") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PinkLycorisPetalItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
