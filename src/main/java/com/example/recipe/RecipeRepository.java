package com.example.recipe;

import java.util.*;
import com.example.recipe.Recipe;
public interface RecipeRepository {
    ArrayList<Recipe> getRecipes();
    Recipe getRecipeById(int recipeId);
    Recipe addRecipe(Recipe recipe);
    Recipe updateRecipe(int recipeId, Recipe recipe);
    void deleteRecipe(int recipeId);
}