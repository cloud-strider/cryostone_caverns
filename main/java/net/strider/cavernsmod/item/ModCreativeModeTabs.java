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
                    })
                    .build());



    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
