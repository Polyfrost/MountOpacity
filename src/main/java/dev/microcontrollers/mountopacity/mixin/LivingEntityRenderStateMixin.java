package dev.microcontrollers.mountopacity.mixin;

//? if >=1.21.3 {
import dev.microcontrollers.mountopacity.LivingEntityRenderStateEntity;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(LivingEntityRenderState.class)
public class LivingEntityRenderStateMixin implements LivingEntityRenderStateEntity {
    @Unique
    private LivingEntity livingEntity;
    @Override
    public LivingEntity mountopacity$getLivingEntity() {
        return livingEntity;
    }
    @Override
    public void mountopacity$setLivingEntity(LivingEntity livingEntity1) {
        livingEntity = livingEntity1;
    }
}
//?}
