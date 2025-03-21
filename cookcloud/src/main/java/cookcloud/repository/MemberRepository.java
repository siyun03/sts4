package cookcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cookcloud.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String>{

}
