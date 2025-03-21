package cookcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cookcloud.entity.RecipeTag;
import cookcloud.entity.RecipetagId;

@Repository
public interface RecipetagRepository extends JpaRepository<RecipeTag, RecipetagId>{

}
