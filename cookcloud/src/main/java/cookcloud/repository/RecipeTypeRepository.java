package cookcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cookcloud.entity.RecipeType;

public interface RecipeTypeRepository extends JpaRepository<RecipeType, Long>{

}
