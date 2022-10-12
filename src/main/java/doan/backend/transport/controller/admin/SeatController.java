package doan.backend.transport.controller.admin;

import doan.backend.transport.entity.TicketappSeat;
import doan.backend.transport.repository.TicketappTypebusRepository;
import doan.backend.transport.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SeatController {
    @Autowired
    SeatService seatService;
    @Autowired
    TicketappTypebusRepository ticketappTypebusRepository;

    @PostMapping("/seat/add")
    public void insertCity(@RequestBody TicketappSeat seat) {
        seatService.insert(seat);
    }

    @RequestMapping(value = "/seat/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getById(@PathVariable("id") int id){
        return ResponseEntity.ok(seatService.findById(id));
    }

    @RequestMapping(value = "/seat/list", method = RequestMethod.GET)
    public ResponseEntity<?> getList(){
        List<TicketappSeat> getList = seatService.getList();
        return ResponseEntity.ok(getList);
    }

    @PutMapping("/seat/update")
    public void update(@RequestBody TicketappSeat seat) {
        seatService.update(seat);
    }

    @DeleteMapping("/seat/delete/{id}")
    public void delete(@PathVariable int id) {
        seatService.delete(id);
    }
}
