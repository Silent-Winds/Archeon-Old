
package net.aethyus.archeon.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.aethyus.archeon.item.Tropicstone_ToolsSwordItem;
import net.aethyus.archeon.ArcheonModElements;

@ArcheonModElements.ModElement.Tag
public class ArcheonCombatAndToolsItemGroup extends ArcheonModElements.ModElement {
	public ArcheonCombatAndToolsItemGroup(ArcheonModElements instance) {
		super(instance, 350);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabarcheon_combat_and_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Tropicstone_ToolsSwordItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
