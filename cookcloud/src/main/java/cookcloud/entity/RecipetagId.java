package cookcloud.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RECIPETAG")
@IdClass(RecipetagId.class)
public class RecipetagId implements Serializable {

    @Column(name = "RECIPE_ID")
    private Long recipeId;
	
    @Column(name = "HASH_ID")
    private Long hashId;

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		RecipetagId recipetagId = (RecipetagId) obj;
		return Objects.equals(recipeId, recipetagId.recipeId) 
				&& Objects.equals(hashId, recipetagId.hashId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(recipeId, hashId);
	}

}
