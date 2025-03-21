package springbootbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import springbootbasic.model.Person;
import springbootbasic.service.PersonService;

@RestController
public class PersonRestController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/persons")
	public List<Person> getPersonList() {
		return personService.getPersonList();
	}
	
	@GetMapping("/persons/{pid}")
	public Person getPerson(@PathVariable Integer pid) {
		return personService.getPerson(pid);
	}

}








