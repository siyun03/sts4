package springbootboard.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="ARTICLE")
public class Article implements Serializable {
	
	private static final long serialVersionUID = 9387419730L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(
			name = "ARTICLE_SEQ_GENERATOR", // 시퀀스 생성기 이름
			sequenceName = "ARTICLE_SEQ", // 시퀀스 이름
			initialValue = 1, // 초기값
			allocationSize = 1 // 증가값
		)
	private Long id;
	
	private String title;
	
	private String content;

	private String category;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;
	
	@OneToMany(mappedBy="article", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Reply> replies;

	
}
