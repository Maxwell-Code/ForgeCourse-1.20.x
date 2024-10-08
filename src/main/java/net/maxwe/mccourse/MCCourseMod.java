package net.maxwe.mccourse;

import net.maxwe.mccourse.Item.ModItems;
import com.mojang.logging.LogUtils;
import net.maxwe.mccourse.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MCCourseMod.MOD_ID)
public class MCCourseMod {
    public static final String MOD_ID = "mccourse";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MCCourseMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the common setup method to the mod event bus
        modEventBus.addListener(this::commonSetup);

        // Register the event bus for Forge events
        MinecraftForge.EVENT_BUS.register(this);

        // Register custom creative mode tabs
        modEventBus.addListener(this::addCreative);
    }

    // Common setup method, runs during the mod setup phase
    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Common setup for {}", MOD_ID);
        // Your setup logic here
    }

    // Adds example items or blocks to a creative mode tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.DRACONITE);
            event.accept(ModItems.RAW_DRACONITE);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
event.accept(ModBlocks.DRACONITE_BLOCK);
event.accept(ModBlocks.RAW_DRACONITE_BLOCK);

        // Your logic to add items to a tab here
        LOGGER.info("Adding items to creative tab for {}", MOD_ID);
    }

    // Runs when the server starts
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Server starting for {}", MOD_ID);
    }

    // Client-specific events like registering renderers or client-only settings
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Client setup for {}", MOD_ID);
            // Client-specific setup logic here
        }
    }
}
