
package net.aethyus.archeon.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.aethyus.archeon.itemgroup.ArcheonCombatAndToolsItemGroup;
import net.aethyus.archeon.block.NyrethPlanksBlock;
import net.aethyus.archeon.ArcheonModElements;

@ArcheonModElements.ModElement.Tag
public class NyrethSwordItem extends ArcheonModElements.ModElement {
	@ObjectHolder("archeon:nyreth_sword")
	public static final Item block = null;

	public NyrethSwordItem(ArcheonModElements instance) {
		super(instance, 399);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 59;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return 1.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NyrethPlanksBlock.block));
			}
		}, 3, -3f, new Item.Properties().group(ArcheonCombatAndToolsItemGroup.tab)) {
		}.setRegistryName("nyreth_sword"));
	}
}
