package com.peta.extratools.datagen;

import com.peta.extratools.ExtraTools;
import com.peta.extratools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.StonecuttingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.OAK_PLANKS)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "wooden_hammer_from_oak"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.BIRCH_PLANKS)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "wooden_hammer_from_birch"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.DARK_OAK_PLANKS)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "wooden_hammer_from_dark_oak"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.SPRUCE_PLANKS)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "wooden_hammer_from_spruce"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.JUNGLE_PLANKS)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "wooden_hammer_from_jungle"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.ACACIA_PLANKS)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "wooden_hammer_from_acacia"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.MANGROVE_PLANKS)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "wooden_hammer_from_mangrove"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.CHERRY_PLANKS)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "wooden_hammer_from_cherry"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.BAMBOO_PLANKS)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "wooden_hammer_from_bamboo"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.CRIMSON_PLANKS)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "wooden_hammer_from_crimson"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.WARPED_PLANKS)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "wooden_hammer_from_warped"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.COBBLESTONE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "stone_hammer_from_cobblestone"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.BLACKSTONE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "stone_hammer_from_blackstone"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.IRON_INGOT)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "iron_hammer_from_iron_ingot"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.DIAMOND)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "diamond_hammer_from_diamond"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLD_HAMMER)
                .pattern("###")
                .pattern("###")
                .pattern(" / ")
                .input('#', Items.GOLD_INGOT)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter, Identifier.of(ExtraTools.MOD_ID, "gold_hammer_from_gold_ingot"));

    }
}
