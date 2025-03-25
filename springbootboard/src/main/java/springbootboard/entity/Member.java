package springbootboard.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="MEMBER")
public class Member implements Serializable {
	
	private static final long serialVersionUID = 934712037902L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(
		name = "MEMBER_SEQ_GENERATOR", // 시퀀스 생성기 이름
		sequenceName = "MEMBER_SEQ", // 시퀀스 이름
		initialValue = 1, // 초기값
		allocationSize = 1 // 증가값
	)
	private Long id;
	
	@Column(unique=true, nullable=false)
	private String username;
	
	@Column(nullable=false)
	private String password;
	
	@Column
	private String role;

	@OneToMany(mappedBy="member", cascade=CascadeType.ALL)
	private List<Article> articles;
	
}
