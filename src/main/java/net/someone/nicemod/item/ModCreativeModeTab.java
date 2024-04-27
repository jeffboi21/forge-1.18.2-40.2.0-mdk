package net.someone.nicemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab NICE_TAB = new CreativeModeTab("nicetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ARTEMIS.get());
        }
    };
}
