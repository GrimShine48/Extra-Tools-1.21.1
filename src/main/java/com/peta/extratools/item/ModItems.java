package com.peta.extratools.item;

import com.peta.extratools.ExtraTools;
import com.peta.extratools.item.custom.ExcavatorItem;
import com.peta.extratools.item.custom.HammerItem;
import com.peta.extratools.item.custom.ScytheItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
//  Hammers
    public static final Item WOODEN_HAMMER = registerItem("wooden_hammer",
            new HammerItem(ToolMaterials.WOOD, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.WOOD, 3, -2.5f))));
    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            new HammerItem(ToolMaterials.STONE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.STONE, 4, -2.6f))));
    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new HammerItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.IRON, 5, -2.7f))));
    public static final Item GOLD_HAMMER = registerItem("gold_hammer",
            new HammerItem(ToolMaterials.GOLD, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.GOLD, 6, -2.8f))));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new HammerItem(ToolMaterials.DIAMOND, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 7, -2.9f))));
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new HammerItem(ToolMaterials.NETHERITE, new Item.Settings().fireproof()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 8, -3.0f))));

//  Excavators
    public static final Item WOODEN_EXCAVATOR = registerItem("wooden_excavator",
            new ExcavatorItem(ToolMaterials.WOOD, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.WOOD, 2, -2.3f))));
    public static final Item STONE_EXCAVATOR = registerItem("stone_excavator",
            new ExcavatorItem(ToolMaterials.STONE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.STONE, 3, -2.4f))));
    public static final Item IRON_EXCAVATOR = registerItem("iron_excavator",
            new ExcavatorItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.IRON, 4, -2.5f))));
    public static final Item GOLD_EXCAVATOR = registerItem("gold_excavator",
            new ExcavatorItem(ToolMaterials.GOLD, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.GOLD, 5, -2.6f))));
    public static final Item DIAMOND_EXCAVATOR = registerItem("diamond_excavator",
            new ExcavatorItem(ToolMaterials.DIAMOND, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.DIAMOND, 6, -2.7f))));
    public static final Item NETHERITE_EXCAVATOR = registerItem("netherite_excavator",
            new ExcavatorItem(ToolMaterials.NETHERITE, new Item.Settings().fireproof()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.NETHERITE, 7, -2.8f))));

//  Scythes
    public static final Item WOODEN_SCYTHE = registerItem("wooden_scythe",
            new ScytheItem(ToolMaterials.WOOD, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.WOOD, 1, -1.6f))));
    public static final Item STONE_SCYTHE = registerItem("stone_scythe",
            new ScytheItem(ToolMaterials.STONE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.STONE, 2, -1.7f))));
    public static final Item IRON_SCYTHE = registerItem("iron_scythe",
            new ScytheItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.IRON, 3, -1.8f))));
    public static final Item GOLD_SCYTHE = registerItem("gold_scythe",
            new ScytheItem(ToolMaterials.GOLD, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.GOLD, 4, -1.9f))));
    public static final Item DIAMOND_SCYTHE = registerItem("diamond_scythe",
            new ScytheItem(ToolMaterials.DIAMOND, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 5, -2f))));
    public static final Item NETHERITE_SCYTHE = registerItem("netherite_scythe",
            new ScytheItem(ToolMaterials.NETHERITE, new Item.Settings().fireproof()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 6, -2.1f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ExtraTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExtraTools.LOGGER.info("Registering mod items for " + ExtraTools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(WOODEN_HAMMER);
            fabricItemGroupEntries.add(STONE_HAMMER);
            fabricItemGroupEntries.add(IRON_HAMMER);
            fabricItemGroupEntries.add(GOLD_HAMMER);
            fabricItemGroupEntries.add(DIAMOND_HAMMER);
            fabricItemGroupEntries.add(NETHERITE_HAMMER);

            fabricItemGroupEntries.add(WOODEN_EXCAVATOR);
            fabricItemGroupEntries.add(STONE_EXCAVATOR);
            fabricItemGroupEntries.add(IRON_EXCAVATOR);
            fabricItemGroupEntries.add(GOLD_EXCAVATOR);
            fabricItemGroupEntries.add(DIAMOND_EXCAVATOR);
            fabricItemGroupEntries.add(NETHERITE_EXCAVATOR);

            fabricItemGroupEntries.add(WOODEN_SCYTHE);
            fabricItemGroupEntries.add(STONE_SCYTHE);
            fabricItemGroupEntries.add(IRON_SCYTHE);
            fabricItemGroupEntries.add(GOLD_SCYTHE);
            fabricItemGroupEntries.add(DIAMOND_SCYTHE);
            fabricItemGroupEntries.add(NETHERITE_SCYTHE);
        });
    }
}