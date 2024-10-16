package net.maxwe.mccourse.datagen;

import net.maxwe.mccourse.MCCourseMod;
import net.maxwe.mccourse.block.ModBlocks;
import net.maxwe.mccourse.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.DRACONITE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add
                        (
                                ModBlocks.DRACONITE_BLOCK.get(),
                                ModBlocks.RAW_DRACONITE_BLOCK.get(),
                                ModBlocks.DRACONITE_ORE.get(),
                                ModBlocks.NETHER_DRACONITE_ORE.get(),
                                ModBlocks.END_STONE_DRACONITE_ORE.get(),
                                ModBlocks.SOUND_BLOCK.get(),
                                ModBlocks.DEEPSLATE_DRACONITE_ORE.get(),
                                ModBlocks.DRACONITE_STAIRS.get(),
                                ModBlocks.DRACONITE_WALL.get(),
                                ModBlocks.DRACONITE_FENCE_GATE.get(),
                                ModBlocks.DRACONITE_FENCE.get(),
                                ModBlocks.DRACONITE_DOOR.get(),
                                ModBlocks.DRACONITE_TRAPDOOR.get(),
                                ModBlocks.DRACONITE_SLAB.get()

                        );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add
                        (
                                ModBlocks.DRACONITE_BLOCK.get(),
                                ModBlocks.RAW_DRACONITE_BLOCK.get()
                        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add
                        (
                                ModBlocks.DEEPSLATE_DRACONITE_ORE.get()
                        );

        this.tag(ModTags.Blocks.NEEDS_DRACONITE_TOOL)
                .add
                        (
                                ModBlocks.NETHER_DRACONITE_ORE.get()
                        );

        this.tag(BlockTags.FENCES)
                .add
                        (ModBlocks.DRACONITE_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add
                        (ModBlocks.DRACONITE_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add
                        (ModBlocks.DRACONITE_WALL.get());

    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
