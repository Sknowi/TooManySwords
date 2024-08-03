package snowy.redstone.tms.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;

public class LapisSword extends SwordItem {
    public LapisSword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);

        if (attacker.getWorld().isClient()) return;


        ServerWorld world = (ServerWorld) attacker.getWorld();

        ExperienceOrbEntity experienceOrb =  new ExperienceOrbEntity(EntityType.EXPERIENCE_ORB, world);

        experienceOrb.refreshPositionAndAngles(target.getBlockPos(), 0, 0);

        world.spawnEntity(experienceOrb);

    }
}
