package com.cursee.mob_drops_recipes_overworld.core.tab;

import com.cursee.mob_drops_recipes_overworld.core.item.ModItemsForge;
import com.cursee.mob_drops_recipes_overworld.core.registry.ModRegistryForge;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabsForge {

    public static void register() {}

    public static final RegistryObject<CreativeModeTab> MOB_DROPS_RECIPES_OVERWORLD = ModRegistryForge.registerCreativeModeTab("mob_drops_recipes_overworld", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.mobDropsRecipesOverworld"))
            .icon(() -> new ItemStack(ModItemsForge.OVERWORLD_ESSENCE_COMMON.get()))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModItemsForge.OVERWORLD_ESSENCE_COMMON.get());
                output.accept(ModItemsForge.OVERWORLD_ESSENCE_UNCOMMON.get());
                output.accept(ModItemsForge.OVERWORLD_ESSENCE_RARE.get());
                output.accept(ModItemsForge.OVERWORLD_ESSENCE_EPIC.get());
            }))
            .build());
}
