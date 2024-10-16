package net.maxwe.mccourse.block;

import net.maxwe.mccourse.Item.ModItems;
import net.maxwe.mccourse.MCCourseMod;
import net.maxwe.mccourse.block.custom.SoundBlock;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Block> DRACONITE_BLOCK = registerBlock("draconite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));
    public static final RegistryObject<Block> RAW_DRACONITE_BLOCK = registerBlock("raw_draconite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final RegistryObject<Block> DEEPSLATE_DRACONITE_ORE = registerBlock("deepslate_draconite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), UniformInt.of(4,7)));
    public static final RegistryObject<Block> DRACONITE_ORE = registerBlock("draconite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE), UniformInt.of(3,5)));
    public static final RegistryObject<Block> END_STONE_DRACONITE_ORE = registerBlock("end_stone_draconite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE), UniformInt.of(8,10)));
    public static final RegistryObject<Block> NETHER_DRACONITE_ORE = registerBlock("nether_draconite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE), UniformInt.of(2,3)));

    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> DRACONITE_STAIRS = registerBlock("draconite_stairs",
            () -> new StairBlock(() -> ModBlocks.DRACONITE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.METAL)));
    public static final RegistryObject<Block> DRACONITE_SLAB = registerBlock("draconite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> DRACONITE_PRESSURE_PLATE = registerBlock("draconite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL), BlockSetType.IRON));
    public static final RegistryObject<Block> DRACONITE_BUTTON = registerBlock("draconite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.METAL),
                    BlockSetType.IRON, 20, true));

    public static final RegistryObject<Block> DRACONITE_FENCE = registerBlock("draconite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> DRACONITE_FENCE_GATE = registerBlock("draconite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> DRACONITE_WALL = registerBlock("draconite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

    public static final RegistryObject<Block> DRACONITE_DOOR = registerBlock("draconite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final RegistryObject<Block> DRACONITE_TRAPDOOR = registerBlock("draconite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_TRAPDOOR), BlockSetType.IRON));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
