
package net.aethyus.archeon.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.aethyus.archeon.itemgroup.ArcheonMiscItemGroup;
import net.aethyus.archeon.ArcheonModElements;

@ArcheonModElements.ModElement.Tag
public class DevouringItem extends ArcheonModElements.ModElement {
	@ObjectHolder("archeon:devouring")
	public static final Item block = null;

	public DevouringItem(ArcheonModElements instance) {
		super(instance, 436);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ArcheonModElements.sounds.get(new ResourceLocation("archeon:glaive")),
					new Item.Properties().group(ArcheonMiscItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("devouring");
		}
	}
}
