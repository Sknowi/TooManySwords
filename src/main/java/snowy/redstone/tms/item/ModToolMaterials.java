package snowy.redstone.tms.item;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public enum ModToolMaterials implements ToolMaterial {


    CACTUS(
            150,
            2f,
            0f,
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            15,
            Ingredient.ofItems(Items.CACTUS)
    ),
    WATER(
            1,
            4f,
            0f,
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            50,
            Ingredient.ofItems(Items.WATER_BUCKET)
    ),
    GLASS(
            45,
            3,
            0f,
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            25,
            Ingredient.ofItems(Items.GLASS)
    ),
    ICE(
            75,
            3f,
            0f,
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            25,
            Ingredient.ofItems(Items.ICE)
    ),
    LAPIS(
            345,
            8f,
            0f,
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            10,
            Ingredient.ofItems(Items.LAPIS_LAZULI)
    ),
    REDSTONE(
            345,
            8f,
            0f,
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            13,
            Ingredient.ofItems(Items.REDSTONE)
    ),
    FIRE(
            300,
            2f,
            0f,
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2,
            Ingredient.ofItems(Items.FIRE_CHARGE)
    ),
    WOOL(
            103,
            1f,
            0f,
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            75,
            Ingredient.ofItems(Items.WHITE_WOOL)
    ),
    SNOW(
            235,
            1f,
            0f,
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            20,
            Ingredient.ofItems(Items.SNOW)
    ),
    STONE(
            1024,
            1f,
            0f,
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            20,
            Ingredient.ofItems(Items.STONE)
    ),
    VOID(
            10,
            12f,
            0f,
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            15,
            Ingredient.ofItems()
    ),
    LEVITATION(
            25,
            10,
            0,
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            20,
            Ingredient.ofItems(Items.SHULKER_SHELL)
    ),
    ENDER(
            576,
            8,
            0,
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            17,
            Ingredient.ofItems(Items.ENDER_PEARL)
    ),
    TNT(
            180,
            5,
            0,
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            10,
            Ingredient.ofItems(Items.TNT)
    ),
    LASER(
            2500,
            8,
            0,
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            10,
            Ingredient.ofItems(Items.BLAZE_ROD)
    ),
    SADDLE(
            179,
            4,
            0,
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            15,
            Ingredient.ofItems(Items.LEATHER)
    ),
    OBSIDIAN(
            3031,
            12f,
            0f,
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            15,
            Ingredient.ofItems(Items.OBSIDIAN)
    );




    private final int durability;
    private final float miningSpeedMultiplier, attackDamage;
    private final TagKey<Block> inverseTag;
    private final int enchantability;
    private final Ingredient repairIngredient;

    ModToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, TagKey<Block> inverseTag, int enchantability, Ingredient repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.inverseTag = inverseTag;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }




    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
