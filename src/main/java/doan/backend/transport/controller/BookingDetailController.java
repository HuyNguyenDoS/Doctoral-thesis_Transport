package doan.backend.transport.controller;

import doan.backend.transport.entity.TicketappBookingdetail;
import doan.backend.transport.service.BookingDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class BookingDetailController {
    @Autowired
    private BookingDetailService bookingDetailService;

//    @PostMapping("/city/add")
//    public void insertCity(@RequestBody TicketappCity city) {
//        cityService.insert(city);
//    }
//
//    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
//    public ResponseEntity<?> getById(@PathVariable("id") int id){
//        return ResponseEntity.ok(cityService.findById(id));
//    }

    @RequestMapping(value = "/timetables/booking-detail/{timetableID}", method = RequestMethod.GET)
    public ResponseEntity<?> findBookingdetailOfTimetable(@PathVariable int timetableID){
        List<TicketappBookingdetail> list = bookingDetailService.findBookingdetailOfTimetable(timetableID);
        return ResponseEntity.ok(list);
    }

    @RequestMapping(value = "/bookings/booking-detail/{bookingID}", method = RequestMethod.GET)
    public ResponseEntity<?> findBookingdetailOfBooking(@PathVariable int bookingID){
        List<TicketappBookingdetail> list = bookingDetailService.findBookingdetailOfBooking(bookingID);
        return ResponseEntity.ok(list);
    }

    @RequestMapping(value = "/bookingdetails", method = RequestMethod.GET)
    public ResponseEntity<?> getList(){
        List<TicketappBookingdetail> getList = bookingDetailService.getList();
        return ResponseEntity.ok(getList);
    }

//    @PutMapping("/city/update")
//    public void update(@RequestBody TicketappCity city) {
//        cityService.update(city);
//    }
//
//    @DeleteMapping("/city/delete/{id}")
//    public void delete(@PathVariable int id) {
//        cityService.delete(id);
//    }
}
