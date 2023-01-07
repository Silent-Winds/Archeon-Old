package net.aethyus.archeon.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.aethyus.archeon.ArcheonMod;

import java.util.Map;

public class LycorisSanguineaMobplayerCollidesWithPlantProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ArcheonMod.LOGGER.warn("Failed to load dependency entity for procedure LycorisSanguineaMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 120, (int) 1));
	}
}
