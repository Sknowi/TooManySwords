package snowy.redstone.tms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import snowy.redstone.tms.TooManySwords;

public class ModItemGroup {

    public static final ItemGroup TOO_MANY_SWORDS = Registry.register(Registries.ITEM_GROUP, Identifier.of(TooManySwords.MOD_ID, "botrk_other"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tms"))
                    .icon(() -> new ItemStack(ModItems.CACTUS_SWORD)).entries((displayContext, entries) -> {

                        entries.add(ModItems.CACTUS_SWORD);
                        entries.add(ModItems.GLASS_SWORD);
                        entries.add(ModItems.WATER_SWORD);
                        entries.add(ModItems.LAPIS_SWORD);
                        entries.add(ModItems.REDSTONE_SWORD);
                        entries.add(ModItems.ICE_SWORD);
                        entries.add(ModItems.FIRE_SWORD);
                        entries.add(ModItems.LAVA_SWORD);
                        entries.add(ModItems.HARDER_STONE_SWORD);
                        entries.add(ModItems.OBSIDIAN_SWORD);
                        entries.add(ModItems.SNOW_SWORD);

                        entries.add(ModItems.LEVITATION_SWORD);
                        entries.add(ModItems.ENDER_SWORD);
                        entries.add(ModItems.TNT_SWORD);
                        entries.add(ModItems.LASER_SWORD_OFF);
                        entries.add(ModItems.SADDLE_SWORD);

                        entries.add(ModItems.UNSWORD);
                        entries.add(ModItems.RESWORD);
                        entries.add(ModItems.EVERSWORD);
                        entries.add(ModItems.NOSWORD);

                        entries.add(ModItems.MISSING_SWORD);


                    }).build());

    public static void registerItemGroups() {
        TooManySwords.LOGGER.info("Registering Mod Item Groups");
    }
}
