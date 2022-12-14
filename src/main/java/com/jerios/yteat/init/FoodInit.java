package com.jerios.yteat.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {
	
	public static final Food GIRLYGAMERFOOD = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.REGENERATION, 10, 2000), 0.5f)
			.fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();
	
	public static final Food DANTDMFOOD = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.HASTE, 10, 2000), 0.5f)
			.fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();
	
	public static final Food SKYDOESMINECRAFTBUILDER = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.SPEED, 10, 2000), 0.5f)
			.fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();
	
	public static final Food VOXBUILDER = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.JUMP_BOOST, 10, 2000), 0.5f)
			.fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();
	
	
	public static final Food SSUNDEEATBUILDER = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.NAUSEA, 10, 2000), 0.5f)
			.fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();
	
	public static final Food PRESTONBUILDER = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 10, 2000), 0.5f)
			.fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();
	
	public static final Food COLBANATORBUILDER = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.STRENGTH, 10, 2000), 0.5f)
			.fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();
	
	public static final Food POPULARMMOS = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.RESISTANCE, 10, 2000), 0.5f)
			.effect(() -> new EffectInstance(Effects.STRENGTH, 15, 2000), 0.5f)
			.fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();
	
	public static final Food DREAM = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.LUCK, 10, 2000), 0.5f)
			.effect(() -> new EffectInstance(Effects.DOLPHINS_GRACE, 8, 2000), 0.5f)
			.fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();

	public static final Food BAGE = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.INVISIBILITY, 1, 2000), 0.5f)
			.fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();
	
	public static final Food JEROME = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.NIGHT_VISION, 1, 2000), 0.5f)
			.fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();
	
	public static final Food HUSKY = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.WATER_BREATHING, 1, 2000), 0.5f)
			.fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();

}
