package net.someone.nicemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.someone.nicemod.NiceMod;
import net.someone.nicemod.item.custom.ArtemisBowItem;
import org.jetbrains.annotations.Nullable;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NiceMod.MOD_ID);

    public static final RegistryObject<Item> SILK = ITEMS.register("silk",
            ()-> new Item(new Item.Properties().stacksTo(16).tab(CreativeModeTab.TAB_MATERIALS).tab(ModCreativeModeTab.NICE_TAB)));

    public static final RegistryObject<Item> NTH_INGOT = ITEMS.register("nth_ingot",
            ()-> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS).tab(ModCreativeModeTab.NICE_TAB)));

    public static final RegistryObject<Item> RAW_NTH = ITEMS.register("raw_nth",
            ()-> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MATERIALS).tab(ModCreativeModeTab.NICE_TAB)));

    public static final RegistryObject<Item> BOWSTRING = ITEMS.register("bowstring",
            ()-> new Item(new Item.Properties().stacksTo(8).tab(CreativeModeTab.TAB_MATERIALS).tab(ModCreativeModeTab.NICE_TAB)));

    public static final RegistryObject<Item> ARTEMIS = ITEMS.register("artemis",
            ()-> new Item(new Item.Properties().durability(1000).rarity(Rarity.EPIC).fireResistant()
                    .tab(CreativeModeTab.TAB_COMBAT).tab(ModCreativeModeTab.NICE_TAB)));

    public static final RegistryObject<Item> FIREWOOD = ITEMS.register("firewood",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.NICE_TAB)) {
                @Override
                public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                    return 3200;
                }
            });




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
