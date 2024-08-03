package snowy.redstone.tms.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class LevitationSword extends SwordItem {
    public LevitationSword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }


    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);

        target.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 50, 4));

    }
}
