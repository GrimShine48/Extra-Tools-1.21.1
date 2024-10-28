package com.peta.extratools.util;

import com.peta.extratools.ExtraTools;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ExtraTools.MOD_ID, name));

        }
}
    public static class Items {
        public static final TagKey<Item> BURNABLE_ITEMS = createTag("burnable_items");
        public static final TagKey<Item> INBURNABLE_ITEMS = createTag("inburnable_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ExtraTools.MOD_ID, name));
        }
    }
}
