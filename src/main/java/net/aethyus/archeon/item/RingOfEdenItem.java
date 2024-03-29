
package net.aethyus.archeon.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.aethyus.archeon.itemgroup.ArcheonCombatAndToolsItemGroup;
import net.aethyus.archeon.ArcheonModElements;

import java.util.List;

@ArcheonModElements.ModElement.Tag
public class RingOfEdenItem extends ArcheonModElements.ModElement {
	@ObjectHolder("archeon:ring_of_eden")
	public static final Item block = null;

	public RingOfEdenItem(ArcheonModElements instance) {
		super(instance, 411);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ArcheonCombatAndToolsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("ring_of_eden");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("This item is not yet fully implemented."));
		}
	}
}
