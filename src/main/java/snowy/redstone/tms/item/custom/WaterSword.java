package snowy.redstone.tms.item.custom;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;

public class WaterSword extends SwordItem {
    public WaterSword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }


    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);

        if (attacker.getWorld().isClient()) {
            return;
        }

        ServerWorld world = (ServerWorld) attacker.getWorld();

        world.setBlockState(target.getBlockPos(), Blocks.WATER.getDefaultState());


    }
}
