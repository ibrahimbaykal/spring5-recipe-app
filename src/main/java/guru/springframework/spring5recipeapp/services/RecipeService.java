package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.domains.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
