package com.cursee.mob_drops_recipes_overworld.core.registry;

import com.cursee.mob_drops_recipes_overworld.Constants;
import com.cursee.mob_drops_recipes_overworld.core.item.ModItemsForge;
import com.cursee.mob_drops_recipes_overworld.core.tab.ModCreativeModeTabsForge;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModRegistryForge {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static void register(IEventBus modEventBus) {

        ModItemsForge.register();
        ModCreativeModeTabsForge.register();

        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }

    public static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    public static <T extends CreativeModeTab> RegistryObject<CreativeModeTab> registerCreativeModeTab(String name, Supplier<CreativeModeTab> tab) {
        return CREATIVE_MODE_TABS.register(name, tab);
    }
}
