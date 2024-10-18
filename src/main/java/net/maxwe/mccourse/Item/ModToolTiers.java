package net.maxwe.mccourse.Item;

import net.maxwe.mccourse.MCCourseMod;
import net.maxwe.mccourse.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier DRACONITE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1000, 11f, 5f, 26,
                    ModTags.Blocks.NEEDS_DRACONITE_TOOL, () -> Ingredient.of(ModItems.DRACONITE.get())),
            new ResourceLocation(MCCourseMod.MOD_ID, "draconite"), List.of(Tiers.NETHERITE), List.of());
}
