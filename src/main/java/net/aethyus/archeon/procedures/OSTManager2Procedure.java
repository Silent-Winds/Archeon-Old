package net.aethyus.archeon.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;

import net.aethyus.archeon.ArcheonModVariables;
import net.aethyus.archeon.ArcheonMod;

import java.util.Random;
import java.util.Map;

public class OSTManager2Procedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ArcheonMod.LOGGER.warn("Failed to load dependency world for procedure OSTManager2!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ArcheonMod.LOGGER.warn("Failed to load dependency x for procedure OSTManager2!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ArcheonMod.LOGGER.warn("Failed to load dependency y for procedure OSTManager2!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ArcheonMod.LOGGER.warn("Failed to load dependency z for procedure OSTManager2!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double player_lifetime = 0;
		double soundtimer = 0;
		double soundpick = 0;
		soundpick = (MathHelper.nextInt(new Random(), 1, 7));
		if (soundpick == 1) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:genesis")),
						SoundCategory.MUSIC, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:genesis")),
						SoundCategory.MUSIC, (float) 1, (float) 1, false);
			}
			ArcheonModVariables.MapVariables.get(world).soundtimer = 1000;
			ArcheonModVariables.MapVariables.get(world).syncData(world);
		} else if (soundpick == 2) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:hoxa")),
						SoundCategory.MUSIC, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:hoxa")),
						SoundCategory.MUSIC, (float) 1, (float) 1, false);
			}
			ArcheonModVariables.MapVariables.get(world).soundtimer = 2000;
			ArcheonModVariables.MapVariables.get(world).syncData(world);
		} else if (soundpick == 3) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:no_ones_around")),
						SoundCategory.MUSIC, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:no_ones_around")),
						SoundCategory.MUSIC, (float) 1, (float) 1, false);
			}
			ArcheonModVariables.MapVariables.get(world).soundtimer = 3000;
			ArcheonModVariables.MapVariables.get(world).syncData(world);
		} else if (soundpick == 4) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:brile")),
						SoundCategory.MUSIC, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:brile")),
						SoundCategory.MUSIC, (float) 1, (float) 1, false);
			}
			ArcheonModVariables.MapVariables.get(world).soundtimer = 4000;
			ArcheonModVariables.MapVariables.get(world).syncData(world);
		} else if (soundpick == 5) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:sunny")),
						SoundCategory.MUSIC, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:sunny")),
						SoundCategory.MUSIC, (float) 1, (float) 1, false);
			}
			ArcheonModVariables.MapVariables.get(world).soundtimer = 5000;
			ArcheonModVariables.MapVariables.get(world).syncData(world);
		} else if (soundpick == 6) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:dotted_sky")),
						SoundCategory.MUSIC, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:dotted_sky")),
						SoundCategory.MUSIC, (float) 1, (float) 1, false);
			}
			ArcheonModVariables.MapVariables.get(world).soundtimer = 6000;
			ArcheonModVariables.MapVariables.get(world).syncData(world);
		} else if (soundpick == 7) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:wild_breath")),
						SoundCategory.MUSIC, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("archeon:wild_breath")),
						SoundCategory.MUSIC, (float) 1, (float) 1, false);
			}
			ArcheonModVariables.MapVariables.get(world).soundtimer = 7000;
			ArcheonModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
