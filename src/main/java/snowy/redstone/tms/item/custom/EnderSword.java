package snowy.redstone.tms.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.event.GameEvent;

public class EnderSword extends SwordItem {
    public EnderSword(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);


        if (!attacker.getWorld().isClient) {

            ServerWorld world = (ServerWorld) attacker.getWorld();

            for(int i = 0; i < 16; ++i) {
                double d = attacker.getX() + (attacker.getRandom().nextDouble() - 0.5) * 16.0;
                double e = MathHelper.clamp(attacker.getY() + (double)(attacker.getRandom().nextInt(16) - 8), (double)world.getBottomY(), (double)(world.getBottomY() + ((ServerWorld)world).getLogicalHeight() - 1));
                double f = attacker.getZ() + (attacker.getRandom().nextDouble() - 0.5) * 16.0;
                if (attacker.hasVehicle()) {
                    attacker.stopRiding();
                }

                Vec3d vec3d = attacker.getPos();
                if (attacker.teleport(d, e, f, true)) {
                    world.emitGameEvent(GameEvent.TELEPORT, vec3d, GameEvent.Emitter.of(attacker));
                    SoundCategory soundCategory;
                    SoundEvent soundEvent;
                    if (attacker instanceof FoxEntity) {
                        soundEvent = SoundEvents.ENTITY_FOX_TELEPORT;
                        soundCategory = SoundCategory.NEUTRAL;
                    } else {
                        soundEvent = SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT;
                        soundCategory = SoundCategory.PLAYERS;
                    }

                    world.playSound((PlayerEntity)null, attacker.getX(), attacker.getY(), attacker.getZ(), soundEvent, soundCategory);
                    attacker.onLanding();
                    break;
                }
            }

            if (attacker instanceof PlayerEntity playerEntity) {
                playerEntity.clearCurrentExplosion();
            }
        }
        
    }
}
