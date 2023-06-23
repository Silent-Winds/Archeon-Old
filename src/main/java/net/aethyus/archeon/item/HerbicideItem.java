
package net.aethyus.archeon.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.aethyus.archeon.procedures.HerbicideItemIsDroppedByPlayerProcedure;
import net.aethyus.archeon.itemgroup.ArcheonMiscItemGroup;
import net.aethyus.archeon.ArcheonModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.AbstractMap;

@ArcheonModElements.ModElement.Tag
public class HerbicideItem extends ArcheonModElements.ModElement {
	@ObjectHolder("archeon:herbicide")
	public static final Item block = null;

	public HerbicideItem(ArcheonModElements instance) {
		super(instance, 457);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ArcheonMiscItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("herbicide");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
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
			list.add(new StringTextComponent("\u00A77Don't use this."));
		}

		@Override
		public boolean onDroppedByPlayer(ItemStack itemstack, PlayerEntity entity) {
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			World world = entity.world;

			HerbicideItemIsDroppedByPlayerProcedure.executeProcedure(Stream
					.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x), new AbstractMap.SimpleEntry<>("y", y),
							new AbstractMap.SimpleEntry<>("z", z))
					.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			return true;
		}
	}
}
