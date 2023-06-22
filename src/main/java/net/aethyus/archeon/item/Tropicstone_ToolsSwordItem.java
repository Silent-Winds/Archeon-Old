
package net.aethyus.archeon.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.aethyus.archeon.itemgroup.ArcheonCombatAndToolsItemGroup;
import net.aethyus.archeon.block.TropicstoneBlock;
import net.aethyus.archeon.ArcheonModElements;

@ArcheonModElements.ModElement.Tag
public class Tropicstone_ToolsSwordItem extends ArcheonModElements.ModElement {
	@ObjectHolder("archeon:tropicstone_tools_sword")
	public static final Item block = null;

	public Tropicstone_ToolsSwordItem(ArcheonModElements instance) {
		super(instance, 349);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 1.9999999999999996f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TropicstoneBlock.block));
			}
		}, 3, -2.4000000000000001f, new Item.Properties().group(ArcheonCombatAndToolsItemGroup.tab)) {
		}.setRegistryName("tropicstone_tools_sword"));
	}
}
