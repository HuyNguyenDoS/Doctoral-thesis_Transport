package doan.backend.transport.controller;


import doan.backend.transport.entity.TicketappBooking;
import doan.backend.transport.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping("/timetables/booking/{timetableID}")
    public ResponseEntity<?> getListByTourId(@PathVariable int timetableID){
        List<TicketappBooking> listPlace = bookingService.findBookingOfTimetable(timetableID);
        return ResponseEntity.ok(listPlace);
    }

    @PostMapping("/booking/new_booking")
    public void insertCity(@RequestBody TicketappBooking booking) {
        bookingService.insert(booking);
    }

    @RequestMapping(value = "/bookings/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getById(@PathVariable("id") int id){
        return ResponseEntity.ok(bookingService.findById(id));
    }

    @RequestMapping(value = "/bookings", method = RequestMethod.GET)
    public ResponseEntity<?> getList(){
        List<TicketappBooking> getList = bookingService.getList();
        return ResponseEntity.ok(getList);
    }

    @PutMapping("/booking/update")
    public void update(@RequestBody TicketappBooking booking) {
        bookingService.update(booking);
    }

    @DeleteMapping("/booking/delete/{id}")
    public void delete(@PathVariable int id) {
        bookingService.delete(id);
    }
}
