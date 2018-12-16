package com.monica.recipe.services;

import com.monica.recipe.models.Recipe;
import com.monica.recipe.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getAllRecipies() {
        Set<Recipe> recipes = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
