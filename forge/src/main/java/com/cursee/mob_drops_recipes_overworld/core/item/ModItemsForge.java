package com.cursee.mob_drops_recipes_overworld.core.item;

import com.cursee.mob_drops_recipes_overworld.core.registry.ModRegistryForge;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.RegistryObject;

public class ModItemsForge {

    public static void register() {}

    public static final RegistryObject<Item> OVERWORLD_ESSENCE_COMMON = ModRegistryForge.registerItem("overworld_essence_common", () -> new Item(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> OVERWORLD_ESSENCE_UNCOMMON = ModRegistryForge.registerItem("overworld_essence_uncommon", () -> new Item(new Item.Properties().stacksTo(8).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> OVERWORLD_ESSENCE_RARE = ModRegistryForge.registerItem("overworld_essence_rare", () -> new Item(new Item.Properties().stacksTo(4).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> OVERWORLD_ESSENCE_EPIC = ModRegistryForge.registerItem("overworld_essence_epic", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
}
