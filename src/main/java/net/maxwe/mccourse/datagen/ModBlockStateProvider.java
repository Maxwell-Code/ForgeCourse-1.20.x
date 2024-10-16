package net.maxwe.mccourse.datagen;

import net.maxwe.mccourse.MCCourseMod;
import net.maxwe.mccourse.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
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

        stairsBlock((StairBlock) ModBlocks.DRACONITE_STAIRS.get(), blockTexture(ModBlocks.DRACONITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.DRACONITE_SLAB.get()),
                blockTexture(ModBlocks.DRACONITE_BLOCK.get()), blockTexture(ModBlocks.DRACONITE_BLOCK.get()));


        buttonBlock(((ButtonBlock) ModBlocks.DRACONITE_BUTTON.get()), blockTexture(ModBlocks.DRACONITE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.DRACONITE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.DRACONITE_BLOCK.get()));

        fenceBlock((FenceBlock) ModBlocks.DRACONITE_FENCE.get(), blockTexture(ModBlocks.DRACONITE_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.DRACONITE_FENCE_GATE.get(), blockTexture(ModBlocks.DRACONITE_BLOCK.get()));
        wallBlock((WallBlock) ModBlocks.DRACONITE_WALL.get(), blockTexture(ModBlocks.DRACONITE_BLOCK.get()));

        doorBlockWithRenderType((DoorBlock)ModBlocks.DRACONITE_DOOR.get()
                , modLoc("block/draconite_door_bottom"), modLoc("block/draconite_door_top"), "cutout");

        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.DRACONITE_TRAPDOOR.get()
                , modLoc("block/draconite_trapdoor"), true, "cutout");

        blockItem(ModBlocks.DRACONITE_STAIRS);
        blockItem(ModBlocks.DRACONITE_SLAB);
        blockItem(ModBlocks.DRACONITE_PRESSURE_PLATE);
        blockItem(ModBlocks.DRACONITE_FENCE_GATE);
        blockItem(ModBlocks.DRACONITE_TRAPDOOR, "_bottom");
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("mccourse:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("mccourse:block/" + ForgeRegistries.BLOCKS.getKey
                (blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}


