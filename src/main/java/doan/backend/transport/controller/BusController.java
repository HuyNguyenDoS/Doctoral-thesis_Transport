package doan.backend.transport.controller;

import doan.backend.transport.entity.TicketappBus;
import doan.backend.transport.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class BusController {
    @Autowired
    BusService busService;

    @RequestMapping(value = "/bus/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserById(@PathVariable("id") int id){
        return ResponseEntity.ok(busService.findById(id));
    }

    @RequestMapping(value = "/bus/list", method = RequestMethod.GET)
    public ResponseEntity<?> getListUser(){
        List<TicketappBus> getList = busService.getList();
        return ResponseEntity.ok(getList);
    }

    @PutMapping("/bus/update")
    public void update(@RequestBody TicketappBus bus) {
        busService.update(bus);
    }

    @DeleteMapping("/bus/delete/{id}")
    public void delete(@PathVariable int id) {
        busService.delete(id);
    }

    @PostMapping("/bus/insert")
    public void insertCity(@RequestBody TicketappBus bus) {
        busService.insert(bus);
    }
}
