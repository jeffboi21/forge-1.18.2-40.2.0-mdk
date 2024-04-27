package net.someone.nicemod.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ArtemisBowItem extends Item {
    public ArtemisBowItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean canDisableShield(ItemStack stack, ItemStack shield, LivingEntity entity, LivingEntity attacker) {
        return super.canDisableShield(stack, shield, entity, attacker);
    }
}
