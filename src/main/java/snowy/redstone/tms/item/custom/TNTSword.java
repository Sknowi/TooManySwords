package snowy.redstone.tms.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class TNTSword extends SwordItem {
    public TNTSword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }


    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);

        if (attacker.getWorld().isClient()) return;

        TntEntity tnt = new TntEntity(EntityType.TNT, attacker.getWorld());
        tnt.setFuse(0);


        tnt.refreshPositionAndAngles(target.getBlockPos(), 0, 0);

        attacker.getWorld().spawnEntity(tnt);


    }
}
