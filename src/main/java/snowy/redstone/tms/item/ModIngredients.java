package snowy.redstone.tms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import snowy.redstone.tms.TooManySwords;

public class ModIngredients {

    public static final Item LEVITATION_CORE = registerItem("levitation_core", new Item(
            new Item.Settings()
    ));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(LEVITATION_CORE);
    }


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TooManySwords.MOD_ID, name), item);
    }


    public static void registerModItems() {
        TooManySwords.LOGGER.info("Registering mod items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModIngredients::addItemsToIngredientItemGroup);

    }

}
