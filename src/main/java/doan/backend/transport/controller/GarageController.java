package doan.backend.transport.controller;

import doan.backend.transport.entity.TicketappGarage;
import doan.backend.transport.service.GarageService;
import doan.backend.transport.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class GarageController {
    @Autowired
    private GarageService garageService;

    @Autowired
    TimeTableService timeTableService;

//    @PostMapping("/city/add")
//    public void insertCity(@RequestBody TicketappCity city) {
//        cityService.insert(city);
//    }
//
    @GetMapping("/garage/{id}")
    public ResponseEntity<?> getListByTourId(@PathVariable int id){
        List<TicketappGarage> listPlace = timeTableService.findTimetable(id);
        return ResponseEntity.ok(listPlace);
    }

    @RequestMapping(value = "/garages/{garagesId}", method = RequestMethod.GET)
    public ResponseEntity<?> getById(@PathVariable("garagesId") int id){
        return ResponseEntity.ok(garageService.findById(id));
    }

    @RequestMapping(value = "/garages", method = RequestMethod.GET)
    public ResponseEntity<?> getList(){
        List<TicketappGarage> getList = garageService.getList();
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
