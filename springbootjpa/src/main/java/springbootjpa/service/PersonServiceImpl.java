package springbootjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import springbootjpa.entity.Person;
import springbootjpa.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public List<Person> getPersonList() {
		return personRepository.findAll();
	}
	
	@Override
	public Optional<Person> getPerson(Long pid) {
		return personRepository.findById(pid);
	}
	
	@Override
	@Transactional
	public Person insertPerson(Person person) {
		return personRepository.save(person);
	}
	
	@Override
	@Transactional
	public Person updatePerson(Person person) {
		// update의 경우는 준영속상태에 있는 엔터티를 영속상태로 변경해 줘야 함
		// find계열메소드를 한번 호출해서 준영속상태에 있는 엔터티를 영속상태로 만든 후에
		// save를 통해서 update 작업을 수행함
		Person findPerson = getPerson(person.getPid()).get();
		findPerson.setPname(person.getPname());
		findPerson.setPage(person.getPage());
		return personRepository.save(findPerson);
	}
	
	@Override
	@Transactional
	public void deletePerson(Long pid) {
		personRepository.deleteById(pid);
	}

}















