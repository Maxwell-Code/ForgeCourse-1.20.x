package net.maxwe.mccourse.Item;

import net.maxwe.mccourse.MCCourseMod;
import net.maxwe.mccourse.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("course_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DRACONITE.get()))
                    .title(Component.translatable("creativetab.course_tab"))
                    .displayItems((displayParameters, output) -> {
                        //MISC ITEMS
                        output.accept(ModItems.DRACONITE.get());
                        output.accept(ModItems.RAW_DRACONITE.get());
                        output.accept(ModItems.KOHLRABI.get());
                        output.accept(ModItems.PEAT_BRICK.get());

                        //ORE BLOCKS
                        output.accept(ModBlocks.DEEPSLATE_DRACONITE_ORE.get());
                        output.accept(ModBlocks.END_STONE_DRACONITE_ORE.get());
                        output.accept(ModBlocks.NETHER_DRACONITE_ORE.get());
                        output.accept(ModBlocks.DRACONITE_ORE.get());

                        //FULL BLOCKS
                        output.accept(ModBlocks.DRACONITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_DRACONITE_BLOCK.get());
                        output.accept(ModBlocks.SOUND_BLOCK.get());

                        //STAIRS & SLABS
                        output.accept(ModBlocks.DRACONITE_SLAB.get());
                        output.accept(ModBlocks.DRACONITE_STAIRS.get());

                        //REDSTONE ITEMS
                        output.accept(ModBlocks.DRACONITE_BUTTON.get());
                        output.accept(ModBlocks.DRACONITE_PRESSURE_PLATE.get());

                        //FENCES & WALLS
                        output.accept(ModBlocks.DRACONITE_FENCE_GATE.get());
                        output.accept(ModBlocks.DRACONITE_FENCE.get());
                        output.accept(ModBlocks.DRACONITE_WALL.get());

                        //DOORS & TRAPDOORS
                        output.accept(ModBlocks.DRACONITE_DOOR.get());
                        output.accept(ModBlocks.DRACONITE_TRAPDOOR.get());

                        //TOOL ITEMS
                        output.accept(ModItems.DRACONITE_PICKAXE.get());
                        output.accept(ModItems.DRACONITE_AXE.get());
                        output.accept(ModItems.DRACONITE_HOE.get());
                        output.accept(ModItems.DRACONITE_SHOVEL.get());
                        output.accept(ModItems.DRACONITE_SWORD.get());
                        output.accept(ModItems.METAL_DETECTOR.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
