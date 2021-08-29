package com.abnamro.recipes.service;

import com.abnamro.recipes.model.Recipes;

import static com.abnamro.recipes.utils.RecipeUtils.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipesServiceImpl implements RecipesService{

    @Override
    public List<Recipes> getRecipes() {
        return readJsonObjects();
    }

    @Override
    public List<String> getRecipeNameByIngredients(List<String> ingredients) {
        return readJsonObjects().stream().filter(recipe -> recipe.getIngredients().stream().anyMatch(ingredients::contains)).
                map(Recipes::getTitle).collect(Collectors.toList());
    }
}
