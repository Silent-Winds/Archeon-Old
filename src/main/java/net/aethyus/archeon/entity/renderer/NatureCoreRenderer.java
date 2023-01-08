
package net.aethyus.archeon.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.aethyus.archeon.procedures.AuroraCatalystTransparentEntityModelConditionProcedure;
import net.aethyus.archeon.entity.NatureCoreEntity;

import java.util.Collections;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NatureCoreRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NatureCoreEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelnature_core(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("archeon:textures/entities/nature_core.png");
					}

					@Override
					protected boolean isVisible(LivingEntity _ent) {
						Entity entity = _ent;
						World world = entity.world;
						double x = entity.getPosX();
						double y = entity.getPosY();
						double z = entity.getPosZ();
						return !AuroraCatalystTransparentEntityModelConditionProcedure.executeProcedure(Collections.emptyMap());
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("archeon:textures/entities/nature_core.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.5.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelnature_core extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer outside_shields;
		private final ModelRenderer shields1;
		private final ModelRenderer cube_r1;
		private final ModelRenderer shields2;
		private final ModelRenderer cube_r2;
		private final ModelRenderer shields13;
		private final ModelRenderer cube_r3;
		private final ModelRenderer shields12;
		private final ModelRenderer cube_r4;
		private final ModelRenderer shields14;
		private final ModelRenderer cube_r5;
		private final ModelRenderer shields11;
		private final ModelRenderer cube_r6;
		private final ModelRenderer shields16;
		private final ModelRenderer cube_r7;
		private final ModelRenderer shields18;
		private final ModelRenderer cube_r8;
		private final ModelRenderer shields15;
		private final ModelRenderer cube_r9;
		private final ModelRenderer shields19;
		private final ModelRenderer cube_r10;
		private final ModelRenderer shields20;
		private final ModelRenderer cube_r11;
		private final ModelRenderer shields3;
		private final ModelRenderer cube_r12;
		private final ModelRenderer shields4;
		private final ModelRenderer cube_r13;
		private final ModelRenderer shields5;
		private final ModelRenderer cube_r14;
		private final ModelRenderer shields6;
		private final ModelRenderer cube_r15;
		private final ModelRenderer shields7;
		private final ModelRenderer cube_r16;
		private final ModelRenderer shields8;
		private final ModelRenderer cube_r17;
		private final ModelRenderer shields9;
		private final ModelRenderer cube_r18;
		private final ModelRenderer shields10;
		private final ModelRenderer cube_r19;
		private final ModelRenderer lens;
		private final ModelRenderer second_golden_shield;
		private final ModelRenderer cube_r20;
		private final ModelRenderer golden_shield;
		private final ModelRenderer cube_r21;
		private final ModelRenderer mossy_shield;
		private final ModelRenderer cube_r22;
		private final ModelRenderer eye;

		public Modelnature_core() {
			textureWidth = 128;
			textureHeight = 128;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 8.0F, 0.0F);
			setRotationAngle(bone, 0.0F, -2.9234F, 0.0F);
			outside_shields = new ModelRenderer(this);
			outside_shields.setRotationPoint(0.0F, 5.0F, 0.0F);
			bone.addChild(outside_shields);
			shields1 = new ModelRenderer(this);
			shields1.setRotationPoint(0.0F, -5.0F, 0.0F);
			outside_shields.addChild(shields1);
			shields1.setTextureOffset(0, 32).addBox(-1.0F, -2.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 9.0F, -17.0F);
			shields1.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields2 = new ModelRenderer(this);
			shields2.setRotationPoint(0.0F, 11.0F, 0.0F);
			outside_shields.addChild(shields2);
			setRotationAngle(shields2, 0.0F, -0.6545F, 0.0F);
			shields2.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields2.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields13 = new ModelRenderer(this);
			shields13.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields2.addChild(shields13);
			setRotationAngle(shields13, 0.0F, 2.0944F, 0.0F);
			shields13.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields13.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.4363F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields12 = new ModelRenderer(this);
			shields12.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields2.addChild(shields12);
			setRotationAngle(shields12, 0.0F, 2.4435F, 0.0F);
			shields12.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields12.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.4363F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields14 = new ModelRenderer(this);
			shields14.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields2.addChild(shields14);
			setRotationAngle(shields14, 0.0F, 1.7453F, 0.0F);
			shields14.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields14.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields11 = new ModelRenderer(this);
			shields11.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields2.addChild(shields11);
			setRotationAngle(shields11, 0.0F, 2.7925F, 0.0F);
			shields11.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields11.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields16 = new ModelRenderer(this);
			shields16.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields2.addChild(shields16);
			setRotationAngle(shields16, 0.0F, 1.0472F, 0.0F);
			shields16.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields16.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields18 = new ModelRenderer(this);
			shields18.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields2.addChild(shields18);
			setRotationAngle(shields18, 0.0F, 0.3491F, 0.0F);
			shields18.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields18.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.4363F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields15 = new ModelRenderer(this);
			shields15.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields2.addChild(shields15);
			setRotationAngle(shields15, 0.0F, 1.3963F, 0.0F);
			shields15.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields15.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields19 = new ModelRenderer(this);
			shields19.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields2.addChild(shields19);
			setRotationAngle(shields19, 0.0F, 3.1416F, 0.0F);
			shields19.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields19.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.4363F, 0.0F, 0.0F);
			cube_r10.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields20 = new ModelRenderer(this);
			shields20.setRotationPoint(0.0F, 0.0F, 0.0F);
			shields2.addChild(shields20);
			setRotationAngle(shields20, 0.0F, -2.7925F, 0.0F);
			shields20.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields20.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.4363F, 0.0F, 0.0F);
			cube_r11.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields3 = new ModelRenderer(this);
			shields3.setRotationPoint(0.0F, 11.0F, 0.0F);
			outside_shields.addChild(shields3);
			setRotationAngle(shields3, 0.0F, -0.3054F, 0.0F);
			shields3.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields3.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.4363F, 0.0F, 0.0F);
			cube_r12.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields4 = new ModelRenderer(this);
			shields4.setRotationPoint(0.0F, 11.0F, 0.0F);
			outside_shields.addChild(shields4);
			setRotationAngle(shields4, 0.0F, -1.0036F, 0.0F);
			shields4.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields4.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.4363F, 0.0F, 0.0F);
			cube_r13.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields5 = new ModelRenderer(this);
			shields5.setRotationPoint(0.0F, 11.0F, 0.0F);
			outside_shields.addChild(shields5);
			setRotationAngle(shields5, 0.0F, -1.3526F, 0.0F);
			shields5.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields5.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.4363F, 0.0F, 0.0F);
			cube_r14.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields6 = new ModelRenderer(this);
			shields6.setRotationPoint(0.0F, 11.0F, 0.0F);
			outside_shields.addChild(shields6);
			setRotationAngle(shields6, 0.0F, -1.7017F, 0.0F);
			shields6.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields6.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.4363F, 0.0F, 0.0F);
			cube_r15.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields7 = new ModelRenderer(this);
			shields7.setRotationPoint(0.0F, 11.0F, 0.0F);
			outside_shields.addChild(shields7);
			setRotationAngle(shields7, 0.0F, -2.0508F, 0.0F);
			shields7.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields7.addChild(cube_r16);
			setRotationAngle(cube_r16, 0.4363F, 0.0F, 0.0F);
			cube_r16.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields8 = new ModelRenderer(this);
			shields8.setRotationPoint(0.0F, 11.0F, 0.0F);
			outside_shields.addChild(shields8);
			setRotationAngle(shields8, 0.0F, -2.3998F, 0.0F);
			shields8.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields8.addChild(cube_r17);
			setRotationAngle(cube_r17, 0.4363F, 0.0F, 0.0F);
			cube_r17.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields9 = new ModelRenderer(this);
			shields9.setRotationPoint(0.0F, 11.0F, 0.0F);
			outside_shields.addChild(shields9);
			setRotationAngle(shields9, 0.0F, -2.7925F, 0.0F);
			shields9.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields9.addChild(cube_r18);
			setRotationAngle(cube_r18, 0.4363F, 0.0F, 0.0F);
			cube_r18.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			shields10 = new ModelRenderer(this);
			shields10.setRotationPoint(0.0F, 11.0F, 0.0F);
			outside_shields.addChild(shields10);
			setRotationAngle(shields10, 0.0F, 3.1416F, 0.0F);
			shields10.setTextureOffset(0, 32).addBox(-1.0F, -18.0F, -17.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(0.0F, -7.0F, -17.0F);
			shields10.addChild(cube_r19);
			setRotationAngle(cube_r19, 0.4363F, 0.0F, 0.0F);
			cube_r19.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			lens = new ModelRenderer(this);
			lens.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(lens);
			lens.setTextureOffset(42, 32).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			second_golden_shield = new ModelRenderer(this);
			second_golden_shield.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(second_golden_shield);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(1.946F, -1.0F, -0.1488F);
			second_golden_shield.addChild(cube_r20);
			setRotationAngle(cube_r20, -0.1462F, 0.0967F, -0.5604F);
			cube_r20.setTextureOffset(46, 50).addBox(-7.165F, -5.2066F, -5.0915F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			golden_shield = new ModelRenderer(this);
			golden_shield.setRotationPoint(0.0F, -1.0F, 0.0F);
			bone.addChild(golden_shield);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(3.2699F, 0.0F, 0.3441F);
			golden_shield.addChild(cube_r21);
			setRotationAngle(cube_r21, 0.3381F, -0.3498F, -0.2349F);
			cube_r21.setTextureOffset(0, 0).addBox(-11.165F, -8.2066F, -7.0915F, 16.0F, 16.0F, 16.0F, 0.0F, false);
			mossy_shield = new ModelRenderer(this);
			mossy_shield.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(mossy_shield);
			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(1.7935F, -1.0F, -0.9875F);
			mossy_shield.addChild(cube_r22);
			setRotationAngle(cube_r22, -0.3361F, 0.4821F, -0.5072F);
			cube_r22.setTextureOffset(0, 32).addBox(-9.165F, -7.2066F, -7.0915F, 14.0F, 14.0F, 14.0F, 0.0F, false);
			eye = new ModelRenderer(this);
			eye.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(eye);
			setRotationAngle(eye, 0.7854F, -0.7854F, -0.7854F);
			eye.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
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
			this.outside_shields.rotateAngleY = f2;
			this.lens.rotateAngleY = f2;
			this.golden_shield.rotateAngleY = f2 / 20.f;
			this.second_golden_shield.rotateAngleY = f2 / 20.f;
			this.eye.rotateAngleY = f2 / 20.f;
			this.mossy_shield.rotateAngleY = f2;
		}
	}

}
