package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TicketappSeatRepository extends JpaRepository<TicketappSeat, Integer>, JpaSpecificationExecutor<TicketappSeat> {
    @Query("SELECT u FROM TicketappSeat u WHERE u.id=:id")
    Optional<TicketappSeat> findById(int id);

    @Query("SELECT b FROM TicketappSeat b WHERE b.typeBusid.id = :id")
    List<TicketappSeat> findSeatOfTypebus(@Param("id") int id );
}