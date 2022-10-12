package doan.backend.transport.controller.admin;

import doan.backend.transport.entity.TicketappUser;
import doan.backend.transport.repository.TicketappUserRepository;
import doan.backend.transport.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin")
public class AdminUserController {
    @Autowired
    private TicketappUserRepository ticketappUserRepository;

    @Autowired
    private MyUserDetailsService userService;

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public ResponseEntity<?> getListUser(){
        List<TicketappUser> getList = userService.getList();
        return ResponseEntity.ok(getList);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserById(@PathVariable("id") int id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") int id){
        System.out.println(id);
        userService.delete(id);
    }
}
