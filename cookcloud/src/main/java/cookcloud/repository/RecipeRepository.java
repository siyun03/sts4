package cookcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cookcloud.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long>{

}
