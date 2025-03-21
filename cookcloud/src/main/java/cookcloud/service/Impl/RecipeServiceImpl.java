package cookcloud.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cookcloud.entity.Recipe;
import cookcloud.repository.RecipeRepository;
import cookcloud.service.RecipeService;

public class RecipeServiceImpl implements RecipeService {

	@Autowired
    private RecipeRepository recipeRepository;

    // 모든 레시피 조회
    public List<Recipe> getRecipeList() {
        return recipeRepository.findAll();
    }
    
	@Override
	public Optional<Recipe> getRecipe(Long RecipeId) {
		return recipeRepository.findById(RecipeId);
	}

//    // 1특정 사용자가 등록한 레시피 목록 조회
//    public Optional<Recipe> getRecipesByUser(Long userId) {
//        return recipeRepository.findById(userId);
//    }
//
//    // 메뉴별 검색 (레시피 이름 검색)
//    public List<Recipe> searchRecipes(String keyword) {
//        return recipeRepository.findById(keyword);
//    }
//
//    // 3메뉴 유형별 검색 (카테고리 검색)
//    public List<Recipe> getRecipesByCategory(String category) {
//        return recipeRepository.findByCategory(category);
//    }

    // 새로운 레시피 추가
    @Transactional
    public Recipe insertRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    // 레시피 수정
    @Transactional
    public Recipe updateRecipe(Recipe recipe) {
        Recipe findRecipe = getRecipe(recipe.getRecipeId()).get();
		Recipe recipe2 = new Recipe();
		recipe.setRecipeTitle(recipe2.getRecipeTitle());
		findRecipe.setRecipeId(recipe2.getRecipeId());
		findRecipe.setRecipeContent(recipe2.getRecipeContent());
		findRecipe.setRecipeViewCount(recipe2.getRecipeViewCount());
		findRecipe.setRecipeInsertAt(recipe2.getRecipeInsertAt());
		findRecipe.setRecipeUpdateAt(recipe2.getRecipeUpdateAt());
		findRecipe.setRecipeDeleteAt(recipe2.getRecipeDeleteAt());
		findRecipe.setRecipeIsDeleted(recipe2.getRecipeIsDeleted());
		findRecipe.setRecipeBoardCode(recipe2.getRecipeBoardCode());
		findRecipe.setRecipeDeleteAt(recipe2.getRecipeDeleteAt());
		return recipeRepository.save(findRecipe);
    }

    // 레시피 삭제
    @Transactional
    public void deleteRecipe(Long recipeId) {
        recipeRepository.deleteById(recipeId);
    }

}
