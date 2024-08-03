package snowy.redstone.tms.item.custom;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class FireSword extends SwordItem {
    public FireSword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }


    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);

        if (attacker.getWorld().isClient()) return;

        attacker.getWorld().setBlockState(target.getBlockPos(), Blocks.FIRE.getDefaultState());

    }
}
