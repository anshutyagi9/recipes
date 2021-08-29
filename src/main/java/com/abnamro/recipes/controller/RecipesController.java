package com.abnamro.recipes.controller;


import com.abnamro.recipes.model.Recipes;
import com.abnamro.recipes.service.RecipesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="recipes")
public class RecipesController {
    @Autowired
    RecipesService service;

    @GetMapping
    public ResponseEntity<List<Recipes>> getRecipes() {
        return new ResponseEntity<>(service.getRecipes(), HttpStatus.OK);
    }

    @PostMapping(value="/names")
    public ResponseEntity<List<String>> getRecipeName(@RequestBody List<String> ingredients) {
        return new ResponseEntity<>(service.getRecipeNameByIngredients(ingredients), HttpStatus.OK);
    }
}
