package doan.backend.transport.controller;

import doan.backend.transport.entity.TicketappTimetable;
import doan.backend.transport.service.BookingService;
import doan.backend.transport.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class TimeTableController {
    @Autowired
    TimeTableService timeTableService;

    @Autowired
    BookingService bookingService;
//
//    @PostMapping("/city/add")
//    public void insertCity(@RequestBody TicketappCity city) {
//        cityService.insert(city);
//    }
//

    @RequestMapping(value = "/timetables/{timetableID}", method = RequestMethod.GET)
    public ResponseEntity<?> getById(@PathVariable("timetableID") int id){
        return ResponseEntity.ok(timeTableService.findById(id));
    }

    @RequestMapping(value = "/timetables", method = RequestMethod.GET)
    public ResponseEntity<?> getList(){
        List<TicketappTimetable> getList = timeTableService.getList();
        return ResponseEntity.ok(getList);
    }
//
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
