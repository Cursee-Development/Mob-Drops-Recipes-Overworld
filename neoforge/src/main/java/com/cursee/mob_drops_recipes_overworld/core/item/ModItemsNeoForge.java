package com.cursee.mob_drops_recipes_overworld.core.item;

import com.cursee.mob_drops_recipes_overworld.core.registry.ModRegistryNeoForge;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItemsNeoForge {

    public static void register() {}

    public static final DeferredHolder<Item, Item> OVERWORLD_ESSENCE_COMMON = ModRegistryNeoForge.registerItem("overworld_essence_common", () -> new Item(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON)));
    public static final DeferredHolder<Item, Item> OVERWORLD_ESSENCE_UNCOMMON = ModRegistryNeoForge.registerItem("overworld_essence_uncommon", () -> new Item(new Item.Properties().stacksTo(8).rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> OVERWORLD_ESSENCE_RARE = ModRegistryNeoForge.registerItem("overworld_essence_rare", () -> new Item(new Item.Properties().stacksTo(4).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> OVERWORLD_ESSENCE_EPIC = ModRegistryNeoForge.registerItem("overworld_essence_epic", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
}
