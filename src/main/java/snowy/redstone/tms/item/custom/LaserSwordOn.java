package snowy.redstone.tms.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import snowy.redstone.tms.item.ModItems;

public class LaserSwordOn extends SwordItem {
    public LaserSwordOn(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        world.playSound(user, user.getBlockPos(), SoundEvents.BLOCK_COMPARATOR_CLICK, SoundCategory.PLAYERS);


        ItemStack replace = ModItems.LASER_SWORD_OFF.getDefaultStack();
        replace.setDamage(user.getStackInHand(hand).getDamage());

        user.setStackInHand(hand, replace);



        return super.use(world, user, hand);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);

        if (selected && entity.isLiving()) {
            stack.setDamage(stack.getDamage() + 1);

            if (stack.getDamage() >= stack.getMaxDamage()) {
                world.playSound((PlayerEntity) entity, entity.getBlockPos(), SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.PLAYERS);

                ItemStack replace = ModItems.LASER_SWORD_OFF.getDefaultStack();
                replace.setDamage(stack.getDamage());

                ((PlayerEntity)entity).getInventory().setStack(slot, replace);
            }

        }

        if (!selected && entity.isPlayer()) {
            world.playSound((PlayerEntity) entity, entity.getBlockPos(), SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.PLAYERS);


            ItemStack replace = ModItems.LASER_SWORD_OFF.getDefaultStack();
            replace.setDamage(stack.getDamage());

            ((PlayerEntity)entity).getInventory().setStack(slot, replace);
        }

    }
}
