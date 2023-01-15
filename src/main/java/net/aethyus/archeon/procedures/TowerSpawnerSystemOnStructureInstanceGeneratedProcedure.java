package net.aethyus.archeon.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;

import net.aethyus.archeon.block.TowerSpawnerBlock;
import net.aethyus.archeon.ArcheonMod;

import java.util.Map;

public class TowerSpawnerSystemOnStructureInstanceGeneratedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ArcheonMod.LOGGER.warn("Failed to load dependency world for procedure TowerSpawnerSystemOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ArcheonMod.LOGGER.warn("Failed to load dependency x for procedure TowerSpawnerSystemOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ArcheonMod.LOGGER.warn("Failed to load dependency y for procedure TowerSpawnerSystemOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ArcheonMod.LOGGER.warn("Failed to load dependency z for procedure TowerSpawnerSystemOnStructureInstanceGenerated!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		boolean found = false;
		double down = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		down = 0;
		while ((world.getBlockState(new BlockPos(x, y - down, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y - down, z))).getBlock() == TowerSpawnerBlock.block) {
			down = (down + 1);
		}
		if (!((world.getBlockState(new BlockPos(x, y - down, z))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x, y - down, z))).getBlock() == Blocks.WATER)) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("archeon", "atmosphere_tower"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos(x, (y - down) - 17, z),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		sx = (-3);
		found = (false);
		for (int index1 = 0; index1 < (int) (6); index1++) {
			sy = (-3);
			for (int index2 = 0; index2 < (int) (6); index2++) {
				sz = (-3);
				for (int index3 = 0; index3 < (int) (6); index3++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == TowerSpawnerBlock.block) {
						found = (true);
					}
					sz = (sz + 1);
				}
				sy = (sy + 1);
			}
			sx = (sx + 1);
		}
		if (found == true) {
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
		}
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager()
					.handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"kill @e[type=minecraft:item]");
		}
	}
}
