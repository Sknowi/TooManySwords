package snowy.redstone.tms.item.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import snowy.redstone.tms.item.ModItems;

public class LaserSwordOff extends SwordItem {


    public LaserSwordOff(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);

    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        world.playSound(user, user.getBlockPos(), SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.PLAYERS);


        ItemStack replace = ModItems.LASER_SWORD_ON.getDefaultStack();
        replace.setDamage(user.getStackInHand(hand).getDamage());

        for (RegistryEntry<Enchantment> e : user.getStackInHand(hand).getEnchantments().getEnchantments()) {


            replace.addEnchantment(e, user.getStackInHand(hand).getEnchantments().getLevel(e));


        }

        user.setStackInHand(hand, replace);



        return super.use(world, user, hand);
    }



}
