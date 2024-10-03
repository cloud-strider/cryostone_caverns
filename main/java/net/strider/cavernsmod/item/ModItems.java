package net.strider.cavernsmod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.strider.cavernsmod.CavernsMod;
import net.strider.cavernsmod.item.custom.FuelItem;

public class ModItems {
    public  static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CavernsMod.MOD_ID);

    public static final RegistryObject<Item> CRYOSTONE = ITEMS.register("cryostone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNREFINED_CRYOSTONE = ITEMS.register("unrefined_cryostone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYOBERRY = ITEMS.register("cryoberry",
            () -> new Item(new Item.Properties().food(ModFoods.CRYOBERRY)));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().food(ModFoods.BLUEBERRY)));
    public static final RegistryObject<Item> TAR_BLOB = ITEMS.register("tar_blob",
            () -> new FuelItem(new Item.Properties(), 1000));

    public static final RegistryObject<Item> CRYOSTONE_SWORD = ITEMS.register("cryostone_sword",
            () -> new SwordItem(ModToolTiers.CRYOSTONE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> CRYOSTONE_AXE = ITEMS.register("cryostone_axe",
            () -> new AxeItem(ModToolTiers.CRYOSTONE, 5, 1, new Item.Properties()));
    public static final RegistryObject<Item> CRYOSTONE_PICKAXE = ITEMS.register("cryostone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CRYOSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> CRYOSTONE_SHOVEL = ITEMS.register("cryostone_shovel",
            () -> new ShovelItem(ModToolTiers.CRYOSTONE, 1, 0, new Item.Properties()));
    public static final RegistryObject<Item> CRYOSTONE_HOE = ITEMS.register("cryostone_hoe",
            () -> new SwordItem(ModToolTiers.CRYOSTONE, 2, 0, new Item.Properties()));

    public static final RegistryObject<Item> CRYOSTONE_HELMET = ITEMS.register("cryostone_helmet",
            () -> new ArmorItem(ModArmorMaterials.CRYOSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CRYOSTONE_CHESTPLATE = ITEMS.register("cryostone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CRYOSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CRYOSTONE_LEGGINGS = ITEMS.register("cryostone_leggings",
            () -> new ArmorItem(ModArmorMaterials.CRYOSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CRYOSTONE_BOOTS = ITEMS.register("cryostone_boots",
            () -> new ArmorItem(ModArmorMaterials.CRYOSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
