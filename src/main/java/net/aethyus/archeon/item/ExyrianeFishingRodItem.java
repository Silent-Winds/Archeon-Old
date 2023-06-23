
package net.aethyus.archeon.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Item;
import net.minecraft.item.FishingRodItem;

import net.aethyus.archeon.itemgroup.ArcheonCombatAndToolsItemGroup;
import net.aethyus.archeon.ArcheonModElements;

@ArcheonModElements.ModElement.Tag
public class ExyrianeFishingRodItem extends ArcheonModElements.ModElement {
	@ObjectHolder("archeon:exyriane_fishing_rod")
	public static final Item block = null;

	public ExyrianeFishingRodItem(ArcheonModElements instance) {
		super(instance, 413);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
		}.setRegistryName("exyriane_fishing_rod"));
	}

	private static class ItemToolCustom extends FishingRodItem {
		protected ItemToolCustom() {
			super(new Item.Properties().group(ArcheonCombatAndToolsItemGroup.tab).maxDamage(300));
		}

		@Override
		public int getItemEnchantability() {
			return 2;
		}
	}
}
