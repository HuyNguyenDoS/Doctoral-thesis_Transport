package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappBookinghistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TicketappBookinghistoryRepository extends JpaRepository<TicketappBookinghistory, Integer>, JpaSpecificationExecutor<TicketappBookinghistory> {
    @Query("SELECT u FROM TicketappBookinghistory u WHERE u.id=:id")
    Optional<TicketappBookinghistory> findById(int id);
}