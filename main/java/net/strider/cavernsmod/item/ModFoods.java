package net.strider.cavernsmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BLUEBERRY = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 300, 3), 0.01f).build();

    public static final FoodProperties CRYOBERRY = new FoodProperties.Builder().nutrition(5)
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 300, 7), 1f).build();
}
