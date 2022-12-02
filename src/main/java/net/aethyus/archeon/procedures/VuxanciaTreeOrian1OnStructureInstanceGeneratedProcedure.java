package net.aethyus.archeon.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.aethyus.archeon.block.FaeliteBlockBlock;
import net.aethyus.archeon.ArcheonMod;

import java.util.Map;

public class VuxanciaTreeOrian1OnStructureInstanceGeneratedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ArcheonMod.LOGGER.warn("Failed to load dependency world for procedure VuxanciaTreeOrian1OnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ArcheonMod.LOGGER.warn("Failed to load dependency x for procedure VuxanciaTreeOrian1OnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ArcheonMod.LOGGER.warn("Failed to load dependency y for procedure VuxanciaTreeOrian1OnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ArcheonMod.LOGGER.warn("Failed to load dependency z for procedure VuxanciaTreeOrian1OnStructureInstanceGenerated!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		boolean Is_air_under = false;
		while (Is_air_under == true) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
				world.setBlockState(new BlockPos(x, y, z), FaeliteBlockBlock.block.getDefaultState(), 3);
				Is_air_under = (true);
			} else {
				Is_air_under = (false);
			}
		}
	}
}
