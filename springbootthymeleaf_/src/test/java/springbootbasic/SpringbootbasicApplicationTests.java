package springbootbasic;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import springbootbasic.service.PersonService;

@SpringBootTest
class SpringbootbasicApplicationTests {

	@Autowired
	private PersonService personService;
	
	@Test
	void getPersonList() {
		assertNotNull(personService.getPersonList());
	}
	
	@Test
	void getPerson() {
		assertNotNull(personService.getPerson(1));
	}

}








