package springbootmybatis.service;

import java.util.List;

import springbootmybatis.model.Person;

public interface PersonService {
	
	public abstract List<Person> getPersonList();
	
	public abstract Person getPerson(int pid);
	
	public abstract void insertPerson(Person person);
	
	public abstract void updatePerson(Person person);
	
	public abstract void deletePerson(int pid);

}
