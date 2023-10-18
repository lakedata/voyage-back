package dwu.swcmop.trippacks.repository;

import dwu.swcmop.trippacks.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
    List<Request> findByToFriendId(Long toFriendId);
}
