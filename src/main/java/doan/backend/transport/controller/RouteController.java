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

    @RequestMapping(value = "/route/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserById(@PathVariable("id") int id){
        return ResponseEntity.ok(routeService.findById(id));
    }

    @RequestMapping(value = "/route/list", method = RequestMethod.GET)
    public ResponseEntity<?> getListUser(){
        List<TicketappRoute> getList = routeService.getList();
        return ResponseEntity.ok(getList);
    }

    @PostMapping("/route/add")
    public void insertComment(@ModelAttribute TicketappRoute route) {
        routeService.insert(route);
    }
}
