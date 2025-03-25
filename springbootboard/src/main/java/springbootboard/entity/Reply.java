package springbootboard.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="REPLY")
public class Reply implements Serializable {

	private static final long serialVersionUID = 8371293048290L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String content;
	
	@ManyToOne
	@JoinColumn(name="article_id")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;
	
	
	
	
}
