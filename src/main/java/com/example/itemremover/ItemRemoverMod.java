package com.example.itemremover;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.OnDatapackSyncEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.RegisterEvent;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.event.server.ServerStoppedEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.event.server.ServerStoppedEvent;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.event.server.ServerStoppedEvent;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.event.server.ServerStoppedEvent;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.RegisterEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraftforge.event.OnDatapackSyncEvent;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.event.server.ServerStoppedEvent;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.server.ServerStartingEvent;

import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.event.server.ServerStoppedEvent;
import net.minecraftforge.event.AddReloadListenerEvent;

import net.minecraftforge.event.RegisterEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.server.ServerStartedEvent;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("itemremover")
public class ItemRemoverMod {
    public ItemRemoverMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    private static final String[] IDS_TO_REMOVE = new String[] {
        // IC3 panels
        "ic3:solar_generator_10_level",
        "ic3:solar_generator_11_level",
        "ic3:solar_generator_12_level",
        "ic3:solar_generator_13_level",
        "ic3:solar_generator_14_level",
        "ic3:night_solar_generator_1_level",
        "ic3:night_solar_generator_2_level",
        "ic3:night_solar_generator_3_level",
        "ic3:night_solar_generator_4_level",
        "ic3:night_solar_generator_5_level",
        "ic3:night_solar_generator_6_level",
        "ic3:night_solar_generator_7_level",
        "ic3:night_solar_generator_8_level",
        "ic3:night_solar_generator_9_level",
        "ic3:night_solar_generator_10_level",
        "ic3:night_solar_generator_11_level",
        "ic3:night_solar_generator_12_level",
        "ic3:night_solar_generator_13_level",
        "ic3:night_solar_generator_14_level",

        // Additional items to remove
        "ic3:photon_collection_lens",
        "gravityexpansion:super_alloy",
        "gravityexpansion:wiki_book",
        "gravityexpansion:raw_meat_nugget",
        "gravityexpansion:raw_meat_ingot",
        "gravityexpansion:cooked_meat_nugget",
        "gravityexpansion:cooked_meat_ingot"
    };

    @SubscribeEvent
    public void onBlockRegistry(final RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        for (String id : IDS_TO_REMOVE) {
            ResourceLocation rl = new ResourceLocation(id);
            Block block = ForgeRegistries.BLOCKS.getValue(rl);
            if (block != null) registry.unregister(block);
        }
    }

    @SubscribeEvent
    public void onItemRegistry(final RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        for (String id : IDS_TO_REMOVE) {
            ResourceLocation rl = new ResourceLocation(id);
            Item item = ForgeRegistries.ITEMS.getValue(rl);
            if (item != null) registry.unregister(item);
        }
    }

    @SubscribeEvent
    public void onServerStarted(ServerStartedEvent event) {
        MinecraftServer server = ServerLifecycleHooks.getCurrentServer();
        if (server == null) return;

        RecipeManager recipeManager = server.getRecipeManager();
        List<ResourceLocation> toRemove = new ArrayList<>();

        for (Map.Entry<ResourceLocation, Recipe<?>> entry : recipeManager.getRecipes().entrySet()) {
            ResourceLocation id = entry.getKey();
            Recipe<?> recipe = entry.getValue();

            if (recipe.getResultItem(server.registryAccess()).isEmpty()) continue;

            ResourceLocation outputId = ForgeRegistries.ITEMS.getKey(recipe.getResultItem(server.registryAccess()).getItem());

            if (outputId == null) continue;

            // Удалить, если результат — любой из IDS_TO_REMOVE
            for (String removeId : IDS_TO_REMOVE) {
                if (outputId.toString().equals(removeId)) {
                    toRemove.add(id);
                }
            }

            // Удалить photocell_1_level если НЕ содержит ic3:iridium_ingot
            if (outputId.toString().equals("ic3:photocell_1_level")) {
                boolean containsIridium = recipe.getIngredients().stream().anyMatch(
                    ing -> ing.getItems().length > 0 &&
                           ForgeRegistries.ITEMS.getKey(ing.getItems()[0].getItem()).toString().equals("ic3:iridium_ingot")
                );
                if (!containsIridium) {
                    toRemove.add(id);
                }
            }
        }

        toRemove.forEach(recipeId -> recipeManager.byKey(recipeId).ifPresent(recipe -> {
            recipeManager.recipes.remove(recipe.getType());
        }));
    }
}


    private static final Map<String, String> CIRCUIT_EQUIVALENTS = Map.ofEntries(
        Map.entry("ic3:circuit", "mekanism:basic_control_circuit"),
        Map.entry("ic3:advanced_circuit", "mekanism:advanced_control_circuit"),
        Map.entry("ic3:nano_circuit", "mekanism:elite_control_circuit"),
        Map.entry("ic3:quantum_circuit", "mekanism:ultimate_control_circuit"),
        Map.entry("mekanism:basic_control_circuit", "ic3:circuit"),
        Map.entry("mekanism:advanced_control_circuit", "ic3:advanced_circuit"),
        Map.entry("mekanism:elite_control_circuit", "ic3:nano_circuit"),
        Map.entry("mekanism:ultimate_control_circuit", "ic3:quantum_circuit")
    );

    @SubscribeEvent
    public void onServerStartedExtended(ServerStartedEvent event) {
        MinecraftServer server = ServerLifecycleHooks.getCurrentServer();
        if (server == null) return;

        RecipeManager recipeManager = server.getRecipeManager();
        List<ResourceLocation> toUpdate = new ArrayList<>();

        for (Map.Entry<ResourceLocation, Recipe<?>> entry : recipeManager.getRecipes().entrySet()) {
            ResourceLocation id = entry.getKey();
            Recipe<?> recipe = entry.getValue();

            boolean modified = false;
            for (var ingredient : recipe.getIngredients()) {
                for (var itemStack : ingredient.getItems()) {
                    String key = ForgeRegistries.ITEMS.getKey(itemStack.getItem()).toString();
                    if (CIRCUIT_EQUIVALENTS.containsKey(key)) {
                        modified = true;
                        break;
                    }
                }
            }

            if (modified) {
                toUpdate.add(id);
            }
        }

        for (ResourceLocation id : toUpdate) {
            Recipe<?> recipe = recipeManager.byKey(id).orElse(null);
            if (recipe == null) continue;

            recipe.getIngredients().replaceAll(ingredient -> {
                List<Item> items = new ArrayList<>();
                for (var stack : ingredient.getItems()) {
                    Item item = stack.getItem();
                    items.add(item);

                    String altId = CIRCUIT_EQUIVALENTS.getOrDefault(ForgeRegistries.ITEMS.getKey(item).toString(), null);
                    if (altId != null) {
                        Item altItem = ForgeRegistries.ITEMS.getValue(new ResourceLocation(altId));
                        if (altItem != null) items.add(altItem);
                    }
                }

                return net.minecraft.world.item.crafting.Ingredient.of(items.stream().map(Item::getDefaultInstance));
            });
        }
    }
