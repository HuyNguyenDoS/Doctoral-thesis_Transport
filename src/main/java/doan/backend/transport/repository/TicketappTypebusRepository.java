package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappTypebus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TicketappTypebusRepository extends JpaRepository<TicketappTypebus, Integer>, JpaSpecificationExecutor<TicketappTypebus> {
    @Query("SELECT u FROM TicketappTypebus u WHERE u.id=:id")
    Optional<TicketappTypebus> findById(int id);
}