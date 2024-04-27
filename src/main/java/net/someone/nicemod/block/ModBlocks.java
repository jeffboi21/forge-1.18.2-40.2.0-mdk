package net.someone.nicemod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.someone.nicemod.NiceMod;
import net.someone.nicemod.block.custom.SpeedyBlock;
import net.someone.nicemod.item.ModCreativeModeTab;
import net.someone.nicemod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NiceMod.MOD_ID);

    public static final  RegistryObject<Block> RAW_NTH_ORE = registerBlock("raw_nth_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6.8f).requiresCorrectToolForDrops()), ModCreativeModeTab.NICE_TAB);

    public static final  RegistryObject<Block> NTH_ORE = registerBlock("nth_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NICE_TAB);

    public static final  RegistryObject<Block> SPEEDY_BLOCK = registerBlock("speedy_block",
            ()-> new SpeedyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.NICE_TAB);

    public static final  RegistryObject<Block> HEALTHY_BLOCK = registerBlock("healthy_block",
            ()-> new SpeedyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.NICE_TAB);

    public static final  RegistryObject<Block> DEADLY_BLOCK = registerBlock("deadly_block",
            ()-> new SpeedyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.NICE_TAB);

    public static final  RegistryObject<Block> NTH_BLOCK = registerBlock("nth_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7.2f).requiresCorrectToolForDrops()), ModCreativeModeTab.NICE_TAB);

    public static final  RegistryObject<Block> DEEPSLATE_NTH_ORE = registerBlock("deepslate_nth_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.NICE_TAB);

    public static final  RegistryObject<Block> NETHERRACK_NTH_ORE = registerBlock("netherrack_nth_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.NICE_TAB);

    public static final  RegistryObject<Block> ENDSTONE_NTH_ORE = registerBlock("endstone_nth_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NICE_TAB);


private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn, tab);
    return toReturn;
}

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
