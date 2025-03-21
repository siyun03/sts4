package springbootmybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootmybatis.mapper.PersonMapper;
import springbootmybatis.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonMapper personMapper;
	
	@Override
	public List<Person> getPersonList() {
		return personMapper.findAll();
	}
	
	@Override
	public Person getPerson(int pid) {
		return personMapper.findById(pid);
	}
	
	@Override
	public void insertPerson(Person person) {
		personMapper.insert(person);
	}
	
	@Override
	public void updatePerson(Person person) {
		personMapper.update(person);
	}
	
	@Override
	public void deletePerson(int pid) {
		personMapper.delete(pid);
	}

}












