
package net.aethyus.archeon.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.aethyus.archeon.entity.SunstradiverEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SunstradiverRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SunstradiverEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsunstradiver(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("archeon:textures/entities/sunstradiver.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.5.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelsunstradiver extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer head;
		private final ModelRenderer feather;
		private final ModelRenderer feather_r1;
		private final ModelRenderer left_wing;
		private final ModelRenderer left_wing_rotation;
		private final ModelRenderer left_wing_rotation_r1;
		private final ModelRenderer right_wing;
		private final ModelRenderer right_wing_rotation;
		private final ModelRenderer right_wing_rotation_r1;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer tail;
		private final ModelRenderer tail_r1;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;

		public Modelsunstradiver() {
			textureWidth = 32;
			textureHeight = 32;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 19.0F, 0.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -3.0F, -1.5F);
			bone.addChild(head);
			head.setTextureOffset(0, 9).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(19, 0).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			feather = new ModelRenderer(this);
			feather.setRotationPoint(0.0F, -2.5F, -1.0F);
			head.addChild(feather);
			setRotationAngle(feather, -0.2618F, 0.0F, 0.0F);
			feather_r1 = new ModelRenderer(this);
			feather_r1.setRotationPoint(0.0F, 0.5F, 0.5F);
			feather.addChild(feather_r1);
			setRotationAngle(feather_r1, 0.2618F, 0.0F, 0.0F);
			feather_r1.setTextureOffset(0, 12).addBox(0.0F, -3.789F, -0.8975F, 0.0F, 4.0F, 4.0F, 0.0F, false);
			left_wing = new ModelRenderer(this);
			left_wing.setRotationPoint(2.5F, -2.1F, -2.8F);
			bone.addChild(left_wing);
			left_wing_rotation = new ModelRenderer(this);
			left_wing_rotation.setRotationPoint(-1.0F, 0.1F, 0.0F);
			left_wing.addChild(left_wing_rotation);
			setRotationAngle(left_wing_rotation, 0.0F, 3.1416F, 0.0F);
			left_wing_rotation_r1 = new ModelRenderer(this);
			left_wing_rotation_r1.setRotationPoint(-0.5F, 0.0F, -0.2F);
			left_wing_rotation.addChild(left_wing_rotation_r1);
			setRotationAngle(left_wing_rotation_r1, -0.2472F, 0.6599F, 1.1803F);
			left_wing_rotation_r1.setTextureOffset(14, 0).addBox(-1.0F, -0.0949F, -1.5665F, 1.0F, 6.0F, 3.0F, 0.0F, false);
			right_wing = new ModelRenderer(this);
			right_wing.setRotationPoint(-2.5F, -2.1F, -2.8F);
			bone.addChild(right_wing);
			right_wing_rotation = new ModelRenderer(this);
			right_wing_rotation.setRotationPoint(0.0F, 0.1F, 0.0F);
			right_wing.addChild(right_wing_rotation);
			setRotationAngle(right_wing_rotation, 0.0F, 3.1416F, 0.0F);
			right_wing_rotation_r1 = new ModelRenderer(this);
			right_wing_rotation_r1.setRotationPoint(-0.5F, 0.0F, -0.2F);
			right_wing_rotation.addChild(right_wing_rotation_r1);
			setRotationAngle(right_wing_rotation_r1, -0.2472F, -0.6599F, -1.1803F);
			right_wing_rotation_r1.setTextureOffset(13, 13).addBox(0.0F, -0.0949F, -1.5665F, 1.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(-1.0F, 2.0F, -1.0F);
			bone.addChild(left_leg);
			left_leg.setTextureOffset(12, 9).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(1.0F, 2.0F, -1.0F);
			bone.addChild(right_leg);
			right_leg.setTextureOffset(0, 9).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 1.1F, -0.8F);
			bone.addChild(tail);
			tail_r1 = new ModelRenderer(this);
			tail_r1.setRotationPoint(0.0F, 0.9F, 0.8F);
			tail.addChild(tail_r1);
			setRotationAngle(tail_r1, 1.1781F, 0.0F, 0.0F);
			tail_r1.setTextureOffset(18, 9).addBox(-1.0F, -0.7519F, -0.5716F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -2.5F, -1.0F);
			bone.addChild(body);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 1.5F, 0.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.3054F, 0.0F, 0.0F);
			body_r1.setTextureOffset(0, 0).addBox(-2.0F, -2.477F, -2.3505F, 4.0F, 6.0F, 3.0F, 0.0F, false);
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
			this.right_wing.rotateAngleZ = MathHelper.cos(f * 7.0F) * 7.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_wing.rotateAngleZ = MathHelper.cos(f * 7.0F) * -7.0F * f1;
		}
	}

}
