package cookcloud.service;

import java.util.List;
import java.util.Optional;

import cookcloud.entity.Recipe;

public interface RecipeService {

	public abstract List<Recipe> getRecipeList();
	
	public abstract Optional<Recipe> getRecipe(Long recipeId);
	
	public abstract Recipe insertRecipe(Recipe recipe);
	
	public abstract Recipe updateRecipe(Recipe recipe);
	
	public abstract void deleteRecipe(Long recipeId);
	
}
