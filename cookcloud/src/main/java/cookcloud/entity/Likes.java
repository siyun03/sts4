package cookcloud.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LIKES")
public class Likes implements Serializable {

	private static final long serialVersionUID = 258904516221807L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LIKE_ID", nullable = false)
	private Long likeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LIKE_AT", nullable = false)
	private LocalDateTime likeAt;

	@Column(name = "LIKE_IS_LIKED", columnDefinition = "CHAR(1)", nullable = false)
	private String likeIsLiked;

	@Column(name = "MEM_ID", columnDefinition = "VARCHAR2(20)", nullable = false)
	private String memId;

	@Column(name = "REVIEW_ID")
	private Long reviewId;

	@Column(name = "RECIPE_ID")
	private Long recipeId;

}
