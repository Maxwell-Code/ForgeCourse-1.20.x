package net.maxwe.mccourse.Item;

import net.maxwe.mccourse.Item.custom.FuelItem;
import net.maxwe.mccourse.Item.custom.MetalDetectorItem;
import net.maxwe.mccourse.MCCourseMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Item> DRACONITE = ITEMS.register("draconite",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> RAW_DRACONITE = ITEMS.register("raw_draconite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(250)));
    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI)));
    public static final RegistryObject<Item> PEAT_BRICK = ITEMS.register("peat_brick",
            () -> new FuelItem(new Item.Properties(), 360));
    public static final RegistryObject<Item> DRACONITE_SWORD = ITEMS.register("draconite_sword",
            () -> new SwordItem(ModToolTiers.DRACONITE, 2, 4,
                    new Item.Properties().durability(156)));
    public static final RegistryObject<Item> DRACONITE_PICKAXE = ITEMS.register("draconite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DRACONITE, 1, 2,
                    new Item.Properties().durability(356)));
    public static final RegistryObject<Item> DRACONITE_HOE = ITEMS.register("draconite_hoe",
            () -> new HoeItem(ModToolTiers.DRACONITE, 0, 3,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> DRACONITE_AXE = ITEMS.register("draconite_axe",
            () -> new AxeItem(ModToolTiers.DRACONITE, 3, 1,
                    new Item.Properties().durability(256)));
    public static final RegistryObject<Item> DRACONITE_SHOVEL = ITEMS.register("draconite_shovel",
            () -> new ShovelItem(ModToolTiers.DRACONITE, 1, 2,
                    new Item.Properties().durability(256)));


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
