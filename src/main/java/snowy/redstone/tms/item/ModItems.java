package snowy.redstone.tms.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import snowy.redstone.tms.TooManySwords;
import snowy.redstone.tms.item.custom.*;

public class ModItems {


    public static final Item CACTUS_SWORD = registerItem("cactus_sword",
            new CactusSword(ModToolMaterials.CACTUS, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.CACTUS, 4, -2.4f)
            )));

    public static final Item GLASS_SWORD = registerItem("glass_sword",
            new GlassSword(ModToolMaterials.GLASS, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.GLASS, 7, -2.4f)
            )));

    public static final Item WATER_SWORD = registerItem("water_sword",
            new WaterSword(ModToolMaterials.WATER, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.WATER, 2, -2.4f)
            )));

    public static final Item LAPIS_SWORD = registerItem("lapis_sword",
            new LapisSword(ModToolMaterials.LAPIS, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.LAPIS, 5, -2.4f)
            )));

    public static final Item REDSTONE_SWORD = registerItem("redstone_sword",
            new LapisSword(ModToolMaterials.REDSTONE, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.REDSTONE, 4, -2.4f)
            )));

    public static final Item ICE_SWORD = registerItem("ice_sword",
            new IceSword(ModToolMaterials.ICE, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.ICE, 6, -2.4f)
            )));

    public static final Item FIRE_SWORD = registerItem("fire_sword",
            new FireSword(ModToolMaterials.FIRE, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.FIRE, 5, -2.4f)
            )));

    public static final Item LAVA_SWORD = registerItem("lava_sword",
            new LavaSword(ModToolMaterials.WATER, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.WATER, 6, -2.4f)
            )));

    public static final Item HARDER_STONE_SWORD = registerItem("stone_sword",
            new SwordItem(ModToolMaterials.STONE, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.STONE, 7, -2.6f)
            )));

    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword",
            new SwordItem(ModToolMaterials.OBSIDIAN, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, 8, -2.4f)
            )));

    public static final Item SNOW_SWORD = registerItem("snow_sword",
            new SnowSword(ModToolMaterials.SNOW, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.SNOW, 5, -2.4f)
            )));

    public static final Item MISSING_SWORD = registerItem("missing_sword",
            new MissingSword(ModToolMaterials.VOID, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.VOID, 0, -2.4f)
            )));




    public static final Item LEVITATION_SWORD = registerItem("levitation_sword",
            new LevitationSword(ModToolMaterials.LEVITATION, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.LEVITATION, 5, -2.4f)
            )));

    public static final Item ENDER_SWORD = registerItem("ender_sword",
            new EnderSword(ModToolMaterials.ENDER, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.ENDER, 4, -2.4f)
            )));

    public static final Item TNT_SWORD = registerItem("tnt_sword",
            new TNTSword(ModToolMaterials.TNT, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.TNT, 4, -2.4f)
            )));

    public static final Item LASER_SWORD_ON = registerItem("laser_sword_on",
            new LaserSwordOn(ModToolMaterials.LASER, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.LASER, 7, -2.4f)
            )));

    public static final Item LASER_SWORD_OFF = registerItem("laser_sword_off",
            new LaserSwordOff(ModToolMaterials.LASER, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.LASER, -1, -2.4f)
            )));

    public static final Item SADDLE_SWORD = registerItem("saddle_sword",
            new SaddleSword(ModToolMaterials.SADDLE, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.SADDLE, 4, -2.4f)
            )));

    public static final Item UNSWORD = registerItem("unsword",
            new Unsword(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, -3, -2.4f)
            )));

    public static final Item RESWORD = registerItem("resword",
            new Resword(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 3, -2.4f)
            )));

    public static final Item EVERSWORD = registerItem("eversword",
            new EverSword(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 3, -2.4f)
            )));

    public static final Item NOSWORD = registerItem("nosword",
            new SwordItem(ToolMaterials.WOOD, new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ToolMaterials.WOOD, -1, -2.4f)
            )));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(LASER_SWORD_ON);
    }


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TooManySwords.MOD_ID, name), item);
    }


    public static void registerModItems() {
        TooManySwords.LOGGER.info("Registering mod items");



    }

}
