package snowy.redstone.tms.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class Resword extends SwordItem {

    boolean tryAttack = false;
    int timer, maxTime = 10;


    public Resword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
        timer = 0;
    }

    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);

        tryAttack = true;

    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);

        if (!entity.isLiving()) return;

        if (tryAttack && selected) {
            timer ++;
            if (timer >= maxTime) {
                ((LivingEntity) entity).swingHand(((LivingEntity) entity).preferredHand);
                tryAttack = false;
                timer = 0;
            }
        }


    }

}
