package cookcloud.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RECIPETAG")
public class RecipeTag implements Serializable {

	private static final long serialVersionUID = 472551661700793L;

	@Id
	@Column(name="RECIPE_ID", nullable = false)
	private Long recipeId;

	@Id
	@Column(name="HASH_ID", nullable = false)
	private Long hashId;

}