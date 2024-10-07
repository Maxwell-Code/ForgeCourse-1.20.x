package Item;

import net.maxwe.MCCourseMod.MCCourseMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Item> DRACONITE = ITEMS.register("draconite",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> RAW_DRACONITE = ITEMS.register("raw_draconite.json",
            () -> new Item(new Item.Properties()));


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
