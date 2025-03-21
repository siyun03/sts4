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
@Table(name = "FOLLOWS")
public class Follow implements Serializable {

	private static final long serialVersionUID = 896895357863219L;

	@Id
	@Column(name="FOLLOWER_ID", columnDefinition = "VARCHAR2(20)", nullable = false)
	private String followerId;

	@Id
	@Column(name="FOLLOWING_ID", columnDefinition = "VARCHAR2(20)", nullable = false)
	private String followingId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FOLLOW_AT", nullable = false)
	private LocalDateTime followAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FOLLOW_DELETE_AT")
	private LocalDateTime followDeleteAt;

	@Column(name="FOLLOW_IS_FOLLOWING", columnDefinition = "CHAR(1)", nullable = false)
	private String followIsFollowing;

}
