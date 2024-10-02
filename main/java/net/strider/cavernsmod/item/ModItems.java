package net.strider.cavernsmod.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.strider.cavernsmod.CavernsMod;
import net.minecraft.world.item.Item;

public class ModItems {
    public  static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CavernsMod.MOD_ID);

    public static final RegistryObject<Item> CRYOSTONE = ITEMS.register("cryostone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNREFINED_CRYOSTONE = ITEMS.register("unrefined_cryostone",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
