package cookcloud.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RECIPETAG")
@IdClass(RecipetagId.class)
public class RecipeTag implements Serializable {

	private static final long serialVersionUID = 472551661700793L;

	@EmbeddedId
    private RecipetagId id;  // 복합키를 포함
	
    @ManyToOne
    @JoinColumn(name = "RECIPE_ID", insertable = false, updatable = false)
    private Long recipeId;
    
    @ManyToOne
    @JoinColumn(name = "HASH_ID", insertable = false, updatable = false)
    private Long hashId;
    

}