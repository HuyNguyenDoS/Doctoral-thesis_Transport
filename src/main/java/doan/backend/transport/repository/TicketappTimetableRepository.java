package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappGarage;
import doan.backend.transport.entity.TicketappTimetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TicketappTimetableRepository extends JpaRepository<TicketappTimetable, Integer>, JpaSpecificationExecutor<TicketappTimetable> {
    @Query("SELECT u FROM TicketappTimetable u WHERE u.id=:id")
    Optional<TicketappTimetable> findById(int id);

//    @Query("SELECT b.id, b.ticketappUser, b.name, b.phone, b.ticketappTimetable FROM TicketappTimetable t, TicketappBooking b " +
//            "WHERE b.ticketappTimetable.id =: timeTableId AND t.id = b.ticketappTimetable.id")
//    List<TicketappTimetable> findBookingId(@Param(value = "timeTableId") int timeTableId);

    @Query("SELECT b FROM TicketappTimetable b WHERE b.busRouteID.routeID.toGarage.cityID.id=:id")
    List<TicketappGarage> findTimetable(@Param("id") int id );

}