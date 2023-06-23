
package net.aethyus.archeon.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.aethyus.archeon.itemgroup.ArcheonCombatAndToolsItemGroup;
import net.aethyus.archeon.ArcheonModElements;

@ArcheonModElements.ModElement.Tag
public class ClementiumShovelItem extends ArcheonModElements.ModElement {
	@ObjectHolder("archeon:clementium_shovel")
	public static final Item block = null;

	public ClementiumShovelItem(ArcheonModElements instance) {
		super(instance, 380);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 483;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ClementiumIngotItem.block));
			}
		}, 1, -3.1f, new Item.Properties().group(ArcheonCombatAndToolsItemGroup.tab)) {
		}.setRegistryName("clementium_shovel"));
	}
}
