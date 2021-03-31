package be.recipe.recipe.service;

import be.recipe.recipe.commands.RecipeCommand;
import be.recipe.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
