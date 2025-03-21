package cookcloud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cookcloud.entity.Recipe;
import cookcloud.service.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
	
	@GetMapping
	public ResponseEntity<List<Recipe>> getRecipeList() {
		return ResponseEntity.ok(recipeService.getRecipeList());
	}
	
	@GetMapping("/{recipeId}")
	public ResponseEntity<Optional<Recipe>> getRecipe(@PathVariable Long recipeId) {
		return ResponseEntity.ok(recipeService.getRecipe(recipeId));
	}
	
	@PostMapping
	public ResponseEntity<Recipe> insertPerson(@RequestBody Recipe recipe) {
		return ResponseEntity.ok(recipeService.insertRecipe(recipe));
	}
	
	@PutMapping("/{recipeId}")
	public ResponseEntity<Recipe> updatePerson(@PathVariable Long recipeId, @RequestBody Recipe recipe) {
		recipe.setRecipeId(recipeId);
		return ResponseEntity.ok(recipeService.updateRecipe(recipe));
	}
	
	@DeleteMapping("/{recipeId}")
	public ResponseEntity<Void> deletePersonEntity(@PathVariable Long recipeId) {
		recipeService.deleteRecipe(recipeId);
		return ResponseEntity.noContent().build();
	}
	
	
	
	
	
	
	
}
