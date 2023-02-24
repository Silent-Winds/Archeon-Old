package net.aethyus.archeon.procedures;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.entity.projectile.DamagingProjectileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.aethyus.archeon.item.RingOfWahvenItem;
import net.aethyus.archeon.ArcheonMod;

import java.util.Map;

public class RingOfWahvenItemInInventoryTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ArcheonMod.LOGGER.warn("Failed to load dependency entity for procedure RingOfWahvenItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(RingOfWahvenItem.block)) : false) {
			{
				Entity _shootFrom = entity;
				World projectileLevel = _shootFrom.world;
				if (!projectileLevel.isRemote()) {
					ProjectileEntity _entityToSpawn = new Object() {
						public ProjectileEntity getFireball(World world, Entity shooter, double ax, double ay, double az) {
							DamagingProjectileEntity entityToSpawn = new DragonFireballEntity(EntityType.DRAGON_FIREBALL, world);
							entityToSpawn.setShooter(shooter);
							entityToSpawn.accelerationX = ax;
							entityToSpawn.accelerationY = ay;
							entityToSpawn.accelerationZ = az;
							return entityToSpawn;
						}
					}.getFireball(projectileLevel, entity, (entity.getLookVec().x / 10), (entity.getLookVec().y / 10), (entity.getLookVec().z / 10));
					_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
					_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 1, 0);
					projectileLevel.addEntity(_entityToSpawn);
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You need the Ring of Wahven to use the Dragon Breath!"), (true));
			}
		}
	}
}
