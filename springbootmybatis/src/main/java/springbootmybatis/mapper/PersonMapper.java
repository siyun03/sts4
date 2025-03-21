package springbootmybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import springbootmybatis.model.Person;

@Mapper
public interface PersonMapper {
	
	@Select(" SELECT * FROM PERSON ")
	List<Person> findAll();
	
	@Select(" SELECT * FROM PERSON WHERE PID=#{pid} ")
	Person findById(int pid);
	
	@Insert(" INSERT INTO PERSON(PID, PNAME, PAGE) VALUES (SEQ_PERSON.NEXTVAL, #{pname}, #{page}) ")
	void insert(Person person);
	
	@Update(" UPDATE PERSON SET PNAME=#{pname}, PAGE=#{page} WHERE PID=#{pid} ")
	void update(Person person);
	
	@Delete(" DELETE FROM PERSON WHERE PID=#{pid} ")
	void delete(int pid);

}

















