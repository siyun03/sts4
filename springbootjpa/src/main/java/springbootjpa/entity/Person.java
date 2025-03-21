package springbootjpa.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PERSON")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
	
	private static final long serialVersionUID = 87892374932789L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pid;
	
	@Column
	private String pname;
	
	@Column
	private int page;

}






























