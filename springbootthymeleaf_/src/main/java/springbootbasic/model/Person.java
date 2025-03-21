package springbootbasic.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Serializable {

	private static final long serialVersionUID = 23894678923947982L;
	
	private int pid;
	private String name;
	private int age;
	
}
