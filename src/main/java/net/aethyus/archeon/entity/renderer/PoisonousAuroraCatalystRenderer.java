
package net.aethyus.archeon.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.aethyus.archeon.entity.PoisonousAuroraCatalystEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PoisonousAuroraCatalystRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PoisonousAuroraCatalystEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcatalyst_poisonous(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("archeon:textures/entities/poison_catalyst.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("archeon:textures/entities/poison_catalyst.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.7.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcatalyst_poisonous extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer center;
		private final ModelRenderer upper_shields;
		private final ModelRenderer shields3;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer bottom_shields;
		private final ModelRenderer shields1;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer shields2;
		private final ModelRenderer cube_r9;

		public Modelcatalyst_poisonous() {
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
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields3.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.0873F);
			cube_r1.setTextureOffset(22, 9).addBox(-2.0F, -8.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields3.addChild(cube_r2);
			setRotationAngle(cube_r2, 1.5708F, 1.4835F, 1.5708F);
			cube_r2.setTextureOffset(22, 20).addBox(1.0F, -8.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields3.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 0.0873F);
			cube_r3.setTextureOffset(26, 13).addBox(1.0F, -8.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields3.addChild(cube_r4);
			setRotationAngle(cube_r4, -1.5708F, 1.4835F, -1.5708F);
			cube_r4.setTextureOffset(22, 26).addBox(-2.0F, -8.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			bottom_shields = new ModelRenderer(this);
			bottom_shields.setRotationPoint(0.0F, -11.0F, 0.0F);
			bone.addChild(bottom_shields);
			shields1 = new ModelRenderer(this);
			shields1.setRotationPoint(0.0F, 11.0F, 0.0F);
			bottom_shields.addChild(shields1);
			setRotationAngle(shields1, 0.0F, -0.7854F, 0.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields1.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3491F);
			cube_r5.setTextureOffset(16, 0).addBox(-2.0F, -14.0F, -1.0F, 1.0F, 11.0F, 2.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields1.addChild(cube_r6);
			setRotationAngle(cube_r6, 1.5708F, 1.2217F, 1.5708F);
			cube_r6.setTextureOffset(8, 0).addBox(1.0F, -14.0F, -1.0F, 1.0F, 11.0F, 2.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields1.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, 0.3491F);
			cube_r7.setTextureOffset(6, 16).addBox(1.0F, -14.0F, -1.0F, 1.0F, 11.0F, 2.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields1.addChild(cube_r8);
			setRotationAngle(cube_r8, -1.5708F, 1.2217F, -1.5708F);
			cube_r8.setTextureOffset(12, 11).addBox(-2.0F, -14.0F, -1.0F, 1.0F, 11.0F, 2.0F, 0.0F, false);
			shields2 = new ModelRenderer(this);
			shields2.setRotationPoint(0.0F, 9.0F, 0.0F);
			bottom_shields.addChild(shields2);
			setRotationAngle(shields2, 0.0F, -1.5708F, 0.0F);
			shields2.setTextureOffset(22, 0).addBox(2.0F, -11.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			shields2.setTextureOffset(0, 18).addBox(-3.0F, -11.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields2.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 1.5708F, 0.0F);
			cube_r9.setTextureOffset(18, 13).addBox(2.0F, -11.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r9.setTextureOffset(16, 22).addBox(-3.0F, -11.0F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
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
			this.upper_shields.rotateAngleY = f2;
			this.bottom_shields.rotateAngleY = f2 / 20.f;
			this.shields3.rotateAngleY = f2 / 20.f;
			this.shields2.rotateAngleY = f2;
			this.shields1.rotateAngleY = f2;
		}
	}

}
