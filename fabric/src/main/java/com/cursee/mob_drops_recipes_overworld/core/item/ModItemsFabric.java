package com.cursee.mob_drops_recipes_overworld.core.item;

import com.cursee.mob_drops_recipes_overworld.core.registry.ModRegistryFabric;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ModItemsFabric {

    public static void register() {}

    public static final Item OVERWORLD_ESSENCE_COMMON = ModRegistryFabric.registerItem("overworld_essence_common", new Item(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON)));
    public static final Item OVERWORLD_ESSENCE_UNCOMMON = ModRegistryFabric.registerItem("overworld_essence_uncommon", new Item(new Item.Properties().stacksTo(8).rarity(Rarity.UNCOMMON)));
    public static final Item OVERWORLD_ESSENCE_RARE = ModRegistryFabric.registerItem("overworld_essence_rare", new Item(new Item.Properties().stacksTo(4).rarity(Rarity.RARE)));
    public static final Item OVERWORLD_ESSENCE_EPIC = ModRegistryFabric.registerItem("overworld_essence_epic", new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
}
