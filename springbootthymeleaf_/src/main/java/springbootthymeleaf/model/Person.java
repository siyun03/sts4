package springbootthymeleaf.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
	
	private static final long serialVersionUID = 32984789234738L;
	
	private String name;
	private int age;

}
