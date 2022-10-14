package doan.backend.transport.controller;

import doan.backend.transport.entity.TicketappRoute;
import doan.backend.transport.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class RouteController {
    @Autowired
    RouteService routeService;

    @RequestMapping(value = "/routes/{routerId}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserById(@PathVariable("routerId") int id){
        return ResponseEntity.ok(routeService.findById(id));
    }

    @RequestMapping(value = "/routes", method = RequestMethod.GET)
    public ResponseEntity<?> getListUser(){
        List<TicketappRoute> getList = routeService.getList();
        return ResponseEntity.ok(getList);
    }

    @PostMapping("/route/add")
    public void insertComment(@RequestBody TicketappRoute route) {
        routeService.insert(route);
    }

    @PutMapping("/route/update")
    public void update(@RequestBody TicketappRoute route) {
        routeService.update(route);
    }

    @DeleteMapping("/route/delete/{id}")
    public void delete(@PathVariable int id) {
        routeService.delete(id);
    }
}
