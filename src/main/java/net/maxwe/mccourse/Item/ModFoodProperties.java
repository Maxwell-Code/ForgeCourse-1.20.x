package net.maxwe.mccourse.Item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(8).saturationMod(0.15f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100),0.3f).build();

}
