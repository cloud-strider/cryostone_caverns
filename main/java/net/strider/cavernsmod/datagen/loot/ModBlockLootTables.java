package net.strider.cavernsmod.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.strider.cavernsmod.block.ModBlocks;
import net.strider.cavernsmod.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.CRYOSTONE_BLOCK.get());

        this.add(ModBlocks.CRYOSTONE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.CRYOSTONE_ORE.get(), ModItems.UNREFINED_CRYOSTONE.get()));
        this.add(ModBlocks.DEEPSLATE_CRYOSTONE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_CRYOSTONE_ORE.get(), ModItems.UNREFINED_CRYOSTONE.get()));
        this.add(ModBlocks.END_CRYOSTONE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_CRYOSTONE_ORE.get(), ModItems.UNREFINED_CRYOSTONE.get()));


    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
