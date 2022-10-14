package doan.backend.transport.controller.admin;

import doan.backend.transport.entity.TicketappCity;
import doan.backend.transport.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/city/add")
    public void insertCity(@RequestBody TicketappCity city) {
        cityService.insert(city);
    }

    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getById(@PathVariable("id") int id){
        return ResponseEntity.ok(cityService.findById(id));
    }

    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public ResponseEntity<?> getList(){
        List<TicketappCity> getList = cityService.getList();
        return ResponseEntity.ok(getList);
    }

    @PutMapping("/city/update")
    public void update(@RequestBody TicketappCity city) {
        cityService.update(city);
    }

    @DeleteMapping("/city/delete/{id}")
    public void delete(@PathVariable int id) {
        cityService.delete(id);
    }

}
