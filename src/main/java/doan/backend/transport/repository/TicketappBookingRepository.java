package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TicketappBookingRepository extends JpaRepository<TicketappBooking, Integer>, JpaSpecificationExecutor<TicketappBooking> {
    @Query("SELECT u FROM TicketappBooking u WHERE u.id=:id")
    Optional<TicketappBooking> findById(int id);

    @Query("SELECT b FROM TicketappBooking b WHERE b.ticketappTimetable.id = :id")
    List<TicketappBooking> findBookingOfTimetable(@Param("id") int id );

}