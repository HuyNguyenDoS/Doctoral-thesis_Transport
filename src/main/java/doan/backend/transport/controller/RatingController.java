package doan.backend.transport.controller;

import doan.backend.transport.entity.TicketappRating;
import doan.backend.transport.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @RequestMapping(value = "/busroutes/rating/{routeID}", method = RequestMethod.GET)
    public ResponseEntity<?> findCommentOfRoute(@PathVariable int routeID){
        List<TicketappRating> list = ratingService.findRatingOfRoute(routeID);
        return ResponseEntity.ok(list);
    }
//    @PostMapping("/city/add")
//    public void insertCity(@RequestBody TicketappCity city) {
//        cityService.insert(city);
//    }
//
//    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
//    public ResponseEntity<?> getById(@PathVariable("id") int id){
//        return ResponseEntity.ok(cityService.findById(id));
//    }

    @RequestMapping(value = "/ratings", method = RequestMethod.GET)
    public ResponseEntity<?> getList(){
        List<TicketappRating> getList = ratingService.getList();
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
