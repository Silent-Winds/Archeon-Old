
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

import net.aethyus.archeon.entity.AuroraCatalystEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AuroraCatalystRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AuroraCatalystEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcatalyst(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("archeon:textures/entities/catalyst.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.5.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcatalyst extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer center;
		private final ModelRenderer upper_shields;
		private final ModelRenderer shields3;
		private final ModelRenderer cube_r1;
		private final ModelRenderer bottom_shields;
		private final ModelRenderer shields1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer shields2;
		private final ModelRenderer cube_r3;

		public Modelcatalyst() {
			textureWidth = 32;
			textureHeight = 32;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			center = new ModelRenderer(this);
			center.setRotationPoint(0.0F, -10.0F, 0.0F);
			bone.addChild(center);
			center.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);
			upper_shields = new ModelRenderer(this);
			upper_shields.setRotationPoint(0.0F, -15.0F, 0.0F);
			bone.addChild(upper_shields);
			shields3 = new ModelRenderer(this);
			shields3.setRotationPoint(0.0F, 7.0F, 0.0F);
			upper_shields.addChild(shields3);
			setRotationAngle(shields3, 0.0F, -1.5708F, 0.0F);
			shields3.setTextureOffset(26, 13).addBox(1.0F, -8.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			shields3.setTextureOffset(22, 9).addBox(-2.0F, -8.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields3.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
			cube_r1.setTextureOffset(22, 20).addBox(1.0F, -8.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(22, 26).addBox(-2.0F, -8.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			bottom_shields = new ModelRenderer(this);
			bottom_shields.setRotationPoint(0.0F, -11.0F, 0.0F);
			bone.addChild(bottom_shields);
			shields1 = new ModelRenderer(this);
			shields1.setRotationPoint(0.0F, 11.0F, 0.0F);
			bottom_shields.addChild(shields1);
			setRotationAngle(shields1, 0.0F, -0.7854F, 0.0F);
			shields1.setTextureOffset(6, 16).addBox(2.0F, -15.0F, -1.0F, 1.0F, 11.0F, 2.0F, 0.0F, false);
			shields1.setTextureOffset(16, 0).addBox(-3.0F, -15.0F, -1.0F, 1.0F, 11.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields1.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
			cube_r2.setTextureOffset(8, 0).addBox(2.0F, -14.0F, -1.0F, 1.0F, 11.0F, 2.0F, 0.0F, false);
			cube_r2.setTextureOffset(12, 11).addBox(-3.0F, -14.0F, -1.0F, 1.0F, 11.0F, 2.0F, 0.0F, false);
			shields2 = new ModelRenderer(this);
			shields2.setRotationPoint(0.0F, 9.0F, 0.0F);
			bottom_shields.addChild(shields2);
			setRotationAngle(shields2, 0.0F, -1.5708F, 0.0F);
			shields2.setTextureOffset(22, 0).addBox(2.0F, -11.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			shields2.setTextureOffset(0, 18).addBox(-3.0F, -11.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields2.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
			cube_r3.setTextureOffset(18, 13).addBox(2.0F, -11.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r3.setTextureOffset(16, 22).addBox(-3.0F, -11.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
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
			this.upper_shields.rotateAngleY = f2 / 20.f;
			this.bottom_shields.rotateAngleY = f2;
		}
	}

}
