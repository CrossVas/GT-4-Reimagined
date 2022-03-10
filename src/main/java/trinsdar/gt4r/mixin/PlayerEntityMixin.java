package trinsdar.gt4r.mixin;

import muramasa.antimatter.Data;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import trinsdar.gt4r.data.Attributes;
import trinsdar.gt4r.data.ToolTypes;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {
    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType_1, World world_1) {
        super(entityType_1, world_1);
    }

    @ModifyConstant(
            method = "attackTargetEntityWithCurrentItem",
            constant = @Constant(doubleValue = 9.0D)
    )
    private double getAttackReachSquared(double value) {
        if (this.getMainHandItem().getItem() != ToolTypes.SPEAR.getToolStack(Data.NULL, Data.NULL).getItem()) return value;
        double attackReachValue = this.getAttributeValue(Attributes.ATTACK_REACH.get());
        return attackReachValue * attackReachValue;
    }

   @Inject(
            method = "createAttributes",
            at = @At(value = "RETURN"),
            cancellable = true
    )
    private static void initAttributes(CallbackInfoReturnable<AttributeModifierMap.MutableAttribute> ci) {
       ci.getReturnValue().add(Attributes.ATTACK_REACH.get());
    }
}
