package springbootbasic.service;

import java.util.List;

import springbootbasic.model.Person;

public interface PersonService {
	
	public abstract List<Person> getPersonList();
	
	public abstract Person getPerson(int pid);

}
