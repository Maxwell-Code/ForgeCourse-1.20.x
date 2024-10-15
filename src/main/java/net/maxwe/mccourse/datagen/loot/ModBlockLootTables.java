package net.maxwe.mccourse.datagen.loot;

import net.maxwe.mccourse.Item.ModItems;
import net.maxwe.mccourse.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.DRACONITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_DRACONITE_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());
        this.dropSelf(ModBlocks.DRACONITE_STAIRS.get());
        this.dropSelf(ModBlocks.DRACONITE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.DRACONITE_BUTTON.get());

        this.add(ModBlocks.DRACONITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DRACONITE_ORE.get(), ModItems.DRACONITE.get()));

        this.add(ModBlocks.DEEPSLATE_DRACONITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DRACONITE_ORE.get(), ModItems.DRACONITE.get()));

        this.add(ModBlocks.END_STONE_DRACONITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DRACONITE_ORE.get(), ModItems.DRACONITE.get()));

        this.add(ModBlocks.NETHER_DRACONITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DRACONITE_ORE.get(), ModItems.DRACONITE.get()));

        this.add(ModBlocks.DRACONITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DRACONITE_SLAB.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
