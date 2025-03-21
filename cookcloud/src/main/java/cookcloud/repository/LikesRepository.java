package cookcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cookcloud.entity.Likes;

public interface LikesRepository extends JpaRepository<Likes, Long>{

}
