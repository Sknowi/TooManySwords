package snowy.redstone.tms.item.custom;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;

public class IceSword extends SwordItem {
    public IceSword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);

        if (attacker.getWorld().isClient()) return;

        target.setVelocity(0, 0, 0);

        BlockPos placePos = new BlockPos(target.getBlockPos().getX() - 1, target.getBlockPos().getY(), target.getBlockPos().getZ() - 1);

        for(int i = 1; i <= 3; ++i) {
            for(int j = 1; j <= 3; ++j) {
                for(int x = 1; x <= 3; ++x) {
                    if (attacker.getWorld().getBlockState(placePos).equals(Blocks.AIR.getDefaultState())) attacker.getWorld().setBlockState(placePos, Blocks.ICE.getDefaultState());
                    placePos = new BlockPos(placePos.getX() + 1, placePos.getY(), placePos.getZ());
                }

                placePos = new BlockPos(target.getBlockPos().getX() - 1, placePos.getY() + 1, placePos.getZ());
            }

            placePos = new BlockPos(placePos.getX(), target.getBlockPos().getY(), placePos.getZ() + 1);
        }
    }
}
