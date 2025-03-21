package cookcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cookcloud.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{

}
