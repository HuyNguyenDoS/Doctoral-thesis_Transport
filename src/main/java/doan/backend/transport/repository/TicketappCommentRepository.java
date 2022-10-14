package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TicketappCommentRepository extends JpaRepository<TicketappComment, Integer>, JpaSpecificationExecutor<TicketappComment> {
    @Query("SELECT u FROM TicketappComment u WHERE u.id=:id")
    Optional<TicketappComment> findById(int id);

    @Query("SELECT b FROM TicketappComment b WHERE b.busroute.id=:id")
    List<TicketappComment> findCommentOfRoute(@Param("id") int id );

    @Query(value = "SELECT b FROM TicketappComment b order by b.createdDate asc limite 0, 1 ", nativeQuery = true)
    List<TicketappComment> findLastComment();
}