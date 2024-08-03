package snowy.redstone.tms.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class EverSword extends SwordItem {
    public EverSword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);

        if (selected) {
            if (entity.isLiving()) {
                ((LivingEntity) entity).swingHand(((LivingEntity) entity).getActiveHand());
            }
        }

    }
}
