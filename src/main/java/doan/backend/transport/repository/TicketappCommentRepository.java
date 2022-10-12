package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TicketappCommentRepository extends JpaRepository<TicketappComment, Integer>, JpaSpecificationExecutor<TicketappComment> {
    @Query("SELECT u FROM TicketappComment u WHERE u.id=:id")
    Optional<TicketappComment> findById(int id);
}