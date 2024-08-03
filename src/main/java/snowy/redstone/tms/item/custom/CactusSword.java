package snowy.redstone.tms.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class CactusSword extends SwordItem {
    public CactusSword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }


    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);

        target.damage(attacker.getDamageSources().cactus(), 2f);

        attacker.damage(attacker.getDamageSources().cactus(), 2f);

    }
}
