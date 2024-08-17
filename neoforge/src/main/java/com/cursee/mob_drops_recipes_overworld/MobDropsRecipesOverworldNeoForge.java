package com.cursee.mob_drops_recipes_overworld;

import com.cursee.mob_drops_recipes_overworld.core.registry.ModRegistryNeoForge;
import com.cursee.monolib.core.sailing.Sailing;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MobDropsRecipesOverworldNeoForge {

    public MobDropsRecipesOverworldNeoForge(IEventBus modEventBus) {

        MobDropsRecipesOverworld.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        ModRegistryNeoForge.register(modEventBus);
    }
}
