
package net.aethyus.archeon.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.aethyus.archeon.itemgroup.ArcheonCombatAndToolsItemGroup;
import net.aethyus.archeon.block.Nume_WillowPlanksBlock;
import net.aethyus.archeon.ArcheonModElements;

@ArcheonModElements.ModElement.Tag
public class Nume_WillowAxeItem extends ArcheonModElements.ModElement {
	@ObjectHolder("archeon:nume_willow_axe")
	public static final Item block = null;

	public Nume_WillowAxeItem(ArcheonModElements instance) {
		super(instance, 403);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 59;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return -0.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Nume_WillowPlanksBlock.block));
			}
		}, 1, -3f, new Item.Properties().group(ArcheonCombatAndToolsItemGroup.tab)) {
		}.setRegistryName("nume_willow_axe"));
	}
}
