package net.strider.cavernsmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.strider.cavernsmod.CavernsMod;
import net.strider.cavernsmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CavernsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CRYOSTONE_CAVERNS = CREATIVE_MODE_TABS.register("cryostone_caverns",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRYOSTONE.get()))
                    .title(Component.translatable("creativetab.cryostone_caverns"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CRYOSTONE.get());
                        pOutput.accept(ModItems.UNREFINED_CRYOSTONE.get());
                        pOutput.accept(ModBlocks.CRYOSTONE_BLOCK.get());
                        pOutput.accept(ModBlocks.CRYOSTONE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_CRYOSTONE_ORE.get());
                        pOutput.accept(ModBlocks.END_CRYOSTONE_ORE.get());
                        pOutput.accept(ModItems.BLUEBERRY.get());
                        pOutput.accept(ModItems.CRYOBERRY.get());
                        pOutput.accept(ModItems.CRYOSTONE_SWORD.get());
                        pOutput.accept(ModItems.CRYOSTONE_AXE.get());
                        pOutput.accept(ModItems.CRYOSTONE_PICKAXE.get());
                        pOutput.accept(ModItems.CRYOSTONE_SHOVEL.get());
                        pOutput.accept(ModItems.CRYOSTONE_HOE.get());
                        pOutput.accept(ModItems.CRYOSTONE_HELMET.get());
                        pOutput.accept(ModItems.CRYOSTONE_CHESTPLATE.get());
                        pOutput.accept(ModItems.CRYOSTONE_LEGGINGS.get());
                        pOutput.accept(ModItems.CRYOSTONE_BOOTS.get());
                    })
                    .build());



    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
