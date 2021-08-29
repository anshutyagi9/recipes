package com.abnamro.recipes.utils;

import com.abnamro.recipes.model.Recipes;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class RecipeUtils {

    private static final Logger logger= LoggerFactory.getLogger(RecipeUtils.class);

    public static List<Recipes> readJsonObjects() {
        JSONParser parser = new JSONParser();
        List<Recipes> recipes = new ArrayList<>();
        try {
            Object obj = parser.parse(new FileReader("src/main/resources/recipe.json"));
            JSONArray jsonArray = (JSONArray) obj;
            jsonArray.forEach(jsonArr-> mapRecipes(recipes, (JSONObject) jsonArr));
        } catch (Exception e) {
            logger.error("An error occurred while parsing json "+e.getMessage());
        }
        return recipes;
    }

    private static void mapRecipes(List<Recipes> recipes, JSONObject jsonArr) {
        recipes.add(Recipes.builder().href(jsonArr.get("href").toString())
                        .ingredients((ArrayList) jsonArr.get("ingredients"))
                        .thumbnail(jsonArr.get("thumbnail").toString())
                        .title(jsonArr.get("title").toString()).build());

    }
}
