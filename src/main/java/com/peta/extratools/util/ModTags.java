package com.peta.extratools.util;

import com.peta.extratools.ExtraTools;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SCYTHE_MINEABLE = createTag("scythe_minable");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ExtraTools.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ExtraTools.MOD_ID, name));
        }
    }
}
