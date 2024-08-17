package com.cursee.mob_drops_recipes_overworld.core.registry;

import com.cursee.mob_drops_recipes_overworld.Constants;
import com.cursee.mob_drops_recipes_overworld.core.item.ModItemsNeoForge;
import com.cursee.mob_drops_recipes_overworld.core.tab.ModCreativeModeTabsNeoForge;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModRegistryNeoForge {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Constants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static void register(IEventBus modEventBus) {

        ModItemsNeoForge.register();
        ModCreativeModeTabsNeoForge.register();

        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }

    public static <T extends Item> DeferredHolder<Item, T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    public static <T extends CreativeModeTab> DeferredHolder<CreativeModeTab, T> registerCreativeModeTab(String name, Supplier<T> tab) {
        return CREATIVE_MODE_TABS.register(name, tab);
    }
}
