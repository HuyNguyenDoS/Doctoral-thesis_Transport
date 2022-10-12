package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TicketappBookingRepository extends JpaRepository<TicketappBooking, Integer>, JpaSpecificationExecutor<TicketappBooking> {
    @Query("SELECT u FROM TicketappBooking u WHERE u.id=:id")
    Optional<TicketappBooking> findById(int id);
}