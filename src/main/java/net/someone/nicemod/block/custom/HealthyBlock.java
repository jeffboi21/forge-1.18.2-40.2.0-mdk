package net.someone.nicemod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class HealthyBlock extends Block {
    public HealthyBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (!pLevel.isClientSide()) {
            if (pEntity instanceof LivingEntity) {
                LivingEntity livingEntity = ((LivingEntity) pEntity);
                livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1, 10));
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
