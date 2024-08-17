package com.cursee.mob_drops_recipes_overworld.core.tab;

import com.cursee.mob_drops_recipes_overworld.core.item.ModItemsNeoForge;
import com.cursee.mob_drops_recipes_overworld.core.registry.ModRegistryNeoForge;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModCreativeModeTabsNeoForge {

    public static void register() {}

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOB_DROPS_RECIPES_OVERWORLD = ModRegistryNeoForge.registerCreativeModeTab("mob_drops_recipes_overworld", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.mobDropsRecipesOverworld"))
            .icon(() -> new ItemStack(ModItemsNeoForge.OVERWORLD_ESSENCE_COMMON.get()))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModItemsNeoForge.OVERWORLD_ESSENCE_COMMON.get());
                output.accept(ModItemsNeoForge.OVERWORLD_ESSENCE_UNCOMMON.get());
                output.accept(ModItemsNeoForge.OVERWORLD_ESSENCE_RARE.get());
                output.accept(ModItemsNeoForge.OVERWORLD_ESSENCE_EPIC.get());
            }))
            .build());
}
