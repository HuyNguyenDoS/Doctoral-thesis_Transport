package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappBookingdetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TicketappBookingdetailRepository extends JpaRepository<TicketappBookingdetail, Integer>, JpaSpecificationExecutor<TicketappBookingdetail> {
    @Query("SELECT u FROM TicketappBookingdetail u WHERE u.id=:id")
    Optional<TicketappBookingdetail> findById(int id);

    @Query("SELECT b FROM TicketappBookingdetail b WHERE b.ticketappBooking.ticketappTimetable.id=:id")
    List<TicketappBookingdetail> findBookingdetailOfTimetable(@Param("id") int id );

    @Query("SELECT b FROM TicketappBookingdetail b WHERE b.ticketappBooking.id=:id")
    List<TicketappBookingdetail> findBookingdetailOfBooking(@Param("id") int id );
}