// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
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
		texWidth = 32;
		texHeight = 32;

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 19.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -3.0F, -1.5F);
		bone.addChild(head);
		head.texOffs(0, 9).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		head.texOffs(19, 0).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		feather = new ModelRenderer(this);
		feather.setPos(0.0F, -2.5F, -1.0F);
		head.addChild(feather);
		setRotationAngle(feather, -0.2618F, 0.0F, 0.0F);

		feather_r1 = new ModelRenderer(this);
		feather_r1.setPos(0.0F, 9.5F, 2.5F);
		feather.addChild(feather_r1);
		setRotationAngle(feather_r1, 0.2618F, 0.0F, 0.0F);
		feather_r1.texOffs(0, 12).addBox(0.0F, -13.0F, -0.5F, 0.0F, 4.0F, 4.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setPos(2.5F, -2.1F, -2.8F);
		bone.addChild(left_wing);

		left_wing_rotation = new ModelRenderer(this);
		left_wing_rotation.setPos(-1.0F, 2.5F, 2.0F);
		left_wing.addChild(left_wing_rotation);
		setRotationAngle(left_wing_rotation, 0.0F, 3.1416F, 0.0F);

		left_wing_rotation_r1 = new ModelRenderer(this);
		left_wing_rotation_r1.setPos(-0.5F, -2.4F, 1.8F);
		left_wing_rotation.addChild(left_wing_rotation_r1);
		setRotationAngle(left_wing_rotation_r1, -0.6981F, 0.0F, 0.0F);
		left_wing_rotation_r1.texOffs(14, 0).addBox(-1.0F, -0.0949F, -1.5665F, 1.0F, 6.0F, 3.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setPos(-2.5F, -2.1F, -2.8F);
		bone.addChild(right_wing);

		right_wing_rotation = new ModelRenderer(this);
		right_wing_rotation.setPos(0.0F, 2.5F, 2.0F);
		right_wing.addChild(right_wing_rotation);
		setRotationAngle(right_wing_rotation, 0.0F, 3.1416F, 0.0F);

		right_wing_rotation_r1 = new ModelRenderer(this);
		right_wing_rotation_r1.setPos(-0.5F, -2.4F, 1.8F);
		right_wing_rotation.addChild(right_wing_rotation_r1);
		setRotationAngle(right_wing_rotation_r1, -0.6981F, 0.0F, 0.0F);
		right_wing_rotation_r1.texOffs(13, 13).addBox(0.0F, -0.0949F, -1.5665F, 1.0F, 6.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(-1.0F, 2.0F, -1.0F);
		bone.addChild(left_leg);
		left_leg.texOffs(12, 9).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setPos(1.0F, 2.0F, -1.0F);
		bone.addChild(right_leg);
		right_leg.texOffs(0, 9).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, 1.1F, -0.8F);
		bone.addChild(tail);

		tail_r1 = new ModelRenderer(this);
		tail_r1.setPos(0.0F, 3.9F, 0.8F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, 1.1781F, 0.0F, 0.0F);
		tail_r1.texOffs(18, 9).addBox(-1.0F, -1.9F, 2.2F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -2.5F, -1.0F);
		bone.addChild(body);

		body_r1 = new ModelRenderer(this);
		body_r1.setPos(0.0F, 7.5F, 1.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.3054F, 0.0F, 0.0F);
		body_r1.texOffs(0, 0).addBox(-2.0F, -8.5F, -1.5F, 4.0F, 6.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.left_leg.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_wing.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_leg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_wing.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}