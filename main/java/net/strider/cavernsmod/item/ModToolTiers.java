package net.strider.cavernsmod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.strider.cavernsmod.CavernsMod;
import net.strider.cavernsmod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier CRYOSTONE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_CRYOSTONE_TOOL, () -> Ingredient.of(ModItems.CRYOSTONE.get())),
            new ResourceLocation(CavernsMod.MOD_ID, "cryostone"), List.of(Tiers.NETHERITE), List.of());
}
