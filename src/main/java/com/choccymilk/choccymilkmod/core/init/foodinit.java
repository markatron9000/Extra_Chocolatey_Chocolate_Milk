package com.choccymilk.choccymilkmod.core.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class foodinit {
	public static final Food choc_milk_settings = new Food.Builder().effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 600, 1), 1.0f).saturationMod(1.0f).alwaysEat().build();
	
	public static final Food ecc_milk_settings = new Food.Builder().effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 600, 4), 1.0f).saturationMod(1.0f).alwaysEat().build();
}
