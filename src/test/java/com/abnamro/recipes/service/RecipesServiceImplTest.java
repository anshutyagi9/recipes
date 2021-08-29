package com.abnamro.recipes.service;

import com.abnamro.recipes.model.Recipes;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
class RecipesServiceImplTest {

    @InjectMocks
    RecipesService service=  new RecipesServiceImpl();

    @Test
    void testGetRecipes() {
        List<Recipes> recipes = service.getRecipes();
        assertEquals(40, recipes.size());
    }

    @Test
    void testGetRecipeNameByIngredientsOnionAndRice() {
        List<String> recipes = service.getRecipeNameByIngredients(new ArrayList<>(Arrays.asList("onions","rice")));
        assertEquals(new ArrayList<>(Arrays.asList("Creamy Scrambled Eggs Recipe Recipe",
                "Blue Ribbon Meatloaf",
                "Spaghetti with Clams & Corn",
                "Green Bean Casserole",
                "Broccoli Casserole Recipe",
                "Crock Pot Caramelized Onions",
                "Pulled Chicken Sandwiches (Crock Pot)",
                "Grilled Chipotle Salmon With Pineapple Cilantro Rice",
                "Roast Chicken with Rosemary",
                "Boiled Ham",
                "Fresh Vegetable Spring Rolls",
                "Chicken Salad With Rice Noodles",
                "Bryannas Vegan Dulce De Leche Recipe",
                "Hand-Rolled Sushi",
                "Rice Sandwich",
                "Maki Rolls",
                "Cheesy Hot Dog Rice",
                "Zucchini Rice Casserole",
                "Chicken With Orange Sauce Recipe",
                "Plain Rice --  Make Ahead OAMC Throw It in the Freezer!!",
                "Grilled Portobello Mushrooms")),recipes);
    }
    @Test
    void testGetRecipeNameByIngredientsHamAndGarlic() {
        List<String> recipes = service.getRecipeNameByIngredients(new ArrayList<>(Arrays.asList("ham","garlic")));
        assertEquals(new ArrayList<>(Arrays.asList("Boiled Ham",
                "Garlic Dijon Grilling Sauce",
                "Bruschetta With Roasted Garlic and Cherry Tomatoes",
                "Flatbread With Za?atar",
                "Garlic Butter for Steaks and Mash Potatoes",
                "Garlic Vinegar",
                "Garlic Croutons",
                "Kittencal's Do-Ahead Garlic",
                "Roasted Garlic",
                "White Bean Spread With Garlic & Rosemary",
                "Romano Cheese Crisp",
                "Grilled Portobello Mushrooms",
                "Pear and Sausage Risotto")),recipes);
    }

}