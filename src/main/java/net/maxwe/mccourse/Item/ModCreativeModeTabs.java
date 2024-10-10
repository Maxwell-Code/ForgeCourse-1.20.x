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
                        output.accept(ModItems.DRACONITE.get());
                        output.accept(ModItems.RAW_DRACONITE.get());
                        output.accept(ModItems.METAL_DETECTOR.get());

                        output.accept(ModBlocks.DRACONITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_DRACONITE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_DRACONITE_ORE.get());
                        output.accept(ModBlocks.END_STONE_DRACONITE_ORE.get());
                        output.accept(ModBlocks.NETHER_DRACONITE_ORE.get());
                        output.accept(ModBlocks.DRACONITE_ORE.get());



                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
