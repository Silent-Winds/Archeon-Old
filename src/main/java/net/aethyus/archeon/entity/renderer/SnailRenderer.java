
package net.aethyus.archeon.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.aethyus.archeon.entity.SnailEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SnailRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SnailEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsnail(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("archeon:textures/entities/snail.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.5.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelsnail extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;

		public Modelsnail() {
			textureWidth = 64;
			textureHeight = 64;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(0, 20).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 3.0F, 10.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 0).addBox(-2.0F, -8.0F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(4, 0).addBox(1.0F, -8.0F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 0).addBox(-3.0F, -12.0F, -4.0F, 6.0F, 10.0F, 10.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}

}
