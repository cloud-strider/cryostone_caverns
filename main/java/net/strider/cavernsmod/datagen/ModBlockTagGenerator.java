package net.strider.cavernsmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.strider.cavernsmod.CavernsMod;
import net.strider.cavernsmod.block.ModBlocks;
import net.strider.cavernsmod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CavernsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CRYOSTONE_BLOCK.get(),
                        ModBlocks.CRYOSTONE_ORE.get(),
                        ModBlocks.DEEPSLATE_CRYOSTONE_ORE.get(),
                        ModBlocks.END_CRYOSTONE_ORE.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL);

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.CRYOSTONE_BLOCK.get(),
                        ModBlocks.CRYOSTONE_ORE.get(),
                        ModBlocks.DEEPSLATE_CRYOSTONE_ORE.get(),
                        ModBlocks.END_CRYOSTONE_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL);

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        this.tag(ModTags.Blocks.NEEDS_CRYOSTONE_TOOL);


    }
}
