package snowy.redstone.tms.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;

import java.util.concurrent.ThreadLocalRandom;

public class GlassSword extends SwordItem {
    public GlassSword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }


    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);

        int random = ThreadLocalRandom.current().nextInt(1, 101);

        //attacker.sendMessage(Text.literal("" + random));


        if (random >= 75 && !attacker.getWorld().isClient()) {

            ServerWorld world = (ServerWorld) attacker.getWorld();

            LightningEntity lightning =  new LightningEntity(EntityType.LIGHTNING_BOLT, world);

            lightning.refreshPositionAndAngles(target.getBlockPos(), 0, 0);

            world.spawnEntity(lightning);


        }

    }
}
