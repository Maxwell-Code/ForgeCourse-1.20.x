package net.maxwe.mccourse.datagen;

import net.maxwe.mccourse.MCCourseMod;
import net.maxwe.mccourse.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MCCourseMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.DRACONITE_ORE);
        blockWithItem(ModBlocks.DRACONITE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_DRACONITE_ORE);
        blockWithItem(ModBlocks.END_STONE_DRACONITE_ORE);
        blockWithItem(ModBlocks.NETHER_DRACONITE_ORE);
        blockWithItem(ModBlocks.RAW_DRACONITE_BLOCK);

        blockWithItem(ModBlocks.SOUND_BLOCK);
    }



    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}


