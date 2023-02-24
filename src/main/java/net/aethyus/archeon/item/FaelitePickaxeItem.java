
package net.aethyus.archeon.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.aethyus.archeon.itemgroup.ArcheonCombatAndToolsItemGroup;
import net.aethyus.archeon.ArcheonModElements;

@ArcheonModElements.ModElement.Tag
public class FaelitePickaxeItem extends ArcheonModElements.ModElement {
	@ObjectHolder("archeon:faelite_pickaxe")
	public static final Item block = null;

	public FaelitePickaxeItem(ArcheonModElements instance) {
		super(instance, 313);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(FaeliteIngotItem.block));
			}
		}, 1, -3.1f, new Item.Properties().group(ArcheonCombatAndToolsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("faelite_pickaxe"));
	}
}
