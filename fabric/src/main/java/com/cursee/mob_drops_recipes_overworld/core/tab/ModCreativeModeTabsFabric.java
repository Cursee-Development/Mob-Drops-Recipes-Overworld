package com.cursee.mob_drops_recipes_overworld.core.tab;

import com.cursee.mob_drops_recipes_overworld.core.item.ModItemsFabric;
import com.cursee.mob_drops_recipes_overworld.core.registry.ModRegistryFabric;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabsFabric {

    public static void register() {}

    public static final CreativeModeTab MOB_DROPS_RECIPES_OVERWORLD = ModRegistryFabric.registerCreativeModeTab("mob_drops_recipes_overworld", FabricItemGroup.builder()
            .title(Component.translatable("itemGroup.mobDropsRecipesOverworld"))
            .icon(() -> new ItemStack(ModItemsFabric.OVERWORLD_ESSENCE_COMMON))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModItemsFabric.OVERWORLD_ESSENCE_COMMON);
                output.accept(ModItemsFabric.OVERWORLD_ESSENCE_UNCOMMON);
                output.accept(ModItemsFabric.OVERWORLD_ESSENCE_RARE);
                output.accept(ModItemsFabric.OVERWORLD_ESSENCE_EPIC);
            }))
            .build());
}
