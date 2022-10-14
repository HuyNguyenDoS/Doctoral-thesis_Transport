package doan.backend.transport.controller;

import doan.backend.transport.entity.TicketappTypebus;
import doan.backend.transport.service.TypebusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
public class TypebusController {
    @Autowired
    TypebusService typebusService;

//    @PostMapping("/city/add")
//    public void insertCity(@RequestBody TicketappCity city) {
//        cityService.insert(city);
//    }
//
//    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
//    public ResponseEntity<?> getById(@PathVariable("id") int id){
//        return ResponseEntity.ok(cityService.findById(id));
//    }

    @RequestMapping(value = "/typebuss", method = RequestMethod.GET)
    public ResponseEntity<?> getList(){
        List<TicketappTypebus> getList = typebusService.getList();
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
