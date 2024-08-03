
package snowy.redstone.tms;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import snowy.redstone.tms.item.ModIngredients;
import snowy.redstone.tms.item.ModItemGroup;
import snowy.redstone.tms.item.ModItems;

public class TooManySwords implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("tms");
    public static final String MOD_ID = "tms";

    public TooManySwords() {
    }

    public void onInitialize() {
        ModItems.registerModItems();
        ModIngredients.registerModItems();
        ModItemGroup.registerItemGroups();
        LOGGER.info("Hello Fabric world!");
    }
}
