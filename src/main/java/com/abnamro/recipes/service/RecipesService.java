package com.abnamro.recipes.service;

import com.abnamro.recipes.model.Recipes;
import java.util.List;

public interface RecipesService {

     List<Recipes> getRecipes();
     List<String> getRecipeNameByIngredients(List<String> ingredients);
}
