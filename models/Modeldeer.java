// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeldeer extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer head;
	private final ModelRenderer horns;
	private final ModelRenderer horn_left_r1;
	private final ModelRenderer horn_right_r1;
	private final ModelRenderer mouth;
	private final ModelRenderer left_ear;
	private final ModelRenderer left_ear_r1;
	private final ModelRenderer right_ear;
	private final ModelRenderer right_ear_r1;
	private final ModelRenderer neck;
	private final ModelRenderer body;
	private final ModelRenderer front_left_leg;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer back_left_leg;
	private final ModelRenderer back_right_leg;

	public Modeldeer() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -20.0F, -12.0F);
		bone.addChild(head);
		head.setTextureOffset(0, 13).addBox(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, 0.0F, false);

		horns = new ModelRenderer(this);
		horns.setRotationPoint(0.0F, 28.0F, 9.0F);
		head.addChild(horns);

		horn_left_r1 = new ModelRenderer(this);
		horn_left_r1.setRotationPoint(-3.0F, -39.0F, -11.0F);
		horns.addChild(horn_left_r1);
		setRotationAngle(horn_left_r1, 0.0F, 0.1745F, -0.4363F);
		horn_left_r1.setTextureOffset(0, -13).addBox(0.0F, -10.0F, -6.0F, 0.0F, 11.0F, 13.0F, 0.0F, false);

		horn_right_r1 = new ModelRenderer(this);
		horn_right_r1.setRotationPoint(3.0F, -39.0F, -11.0F);
		horns.addChild(horn_right_r1);
		setRotationAngle(horn_right_r1, 0.0F, -0.1745F, 0.4363F);
		horn_right_r1.setTextureOffset(0, -13).addBox(0.0F, -10.0F, -6.0F, 0.0F, 11.0F, 13.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(mouth);
		mouth.setTextureOffset(0, 25).addBox(-2.0F, -10.0F, -7.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(1.5F, -9.9F, 4.0F);
		head.addChild(left_ear);

		left_ear_r1 = new ModelRenderer(this);
		left_ear_r1.setRotationPoint(-1.5F, -1.1F, 1.0F);
		left_ear.addChild(left_ear_r1);
		setRotationAngle(left_ear_r1, -0.48F, 0.6981F, 0.0F);
		left_ear_r1.setTextureOffset(0, 12).addBox(1.5F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(-1.5F, -9.9F, 4.0F);
		head.addChild(right_ear);
		setRotationAngle(right_ear, 0.0F, -0.6981F, 0.0F);

		right_ear_r1 = new ModelRenderer(this);
		right_ear_r1.setRotationPoint(1.5F, -1.1F, 0.0F);
		right_ear.addChild(right_ear_r1);
		setRotationAngle(right_ear_r1, -0.48F, 0.0F, 0.0F);
		right_ear_r1.setTextureOffset(0, 12).addBox(-3.5F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, -2.0F, 3.0F);
		head.addChild(neck);
		neck.setTextureOffset(2, 37).addBox(-2.05F, -5.0F, -4.0F, 4.0F, 12.0F, 5.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -13.0F, 6.0F);
		bone.addChild(body);
		body.setTextureOffset(3, 35).addBox(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 19.0F, 0.05F, false);

		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(4.0F, -10.0F, -9.0F);
		bone.addChild(front_left_leg);
		front_left_leg.setTextureOffset(48, 21).addBox(-3.0F, -1.0F, -1.9F, 4.0F, 11.0F, 4.0F, 0.0F, true);

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(-4.0F, -10.0F, -9.0F);
		bone.addChild(front_right_leg);
		front_right_leg.setTextureOffset(48, 21).addBox(-1.0F, -1.0F, -1.9F, 4.0F, 11.0F, 4.0F, 0.0F, false);

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(4.0F, -10.0F, 6.0F);
		bone.addChild(back_left_leg);
		back_left_leg.setTextureOffset(48, 21).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, true);

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(-4.0F, -10.0F, 6.0F);
		bone.addChild(back_right_leg);
		back_right_leg.setTextureOffset(48, 21).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.front_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.back_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.front_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.back_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}