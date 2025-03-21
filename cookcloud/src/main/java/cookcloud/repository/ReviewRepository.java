package cookcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cookcloud.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

}
