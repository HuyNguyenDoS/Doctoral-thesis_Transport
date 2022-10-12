package doan.backend.transport.controller;

import doan.backend.transport.entity.TicketappUser;
import doan.backend.transport.repository.TicketappUserRepository;
import doan.backend.transport.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private TicketappUserRepository ticketappUserRepository;

    @Autowired
    private MyUserDetailsService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserById(@PathVariable("id") int id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<?> login(@RequestParam(name="username", defaultValue = "") String username,
                                   @RequestParam(name="password", defaultValue = "") String password){
        System.out.println(username);
        UserDetails user =  userService.loadUserByUsername(username);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if(passwordEncoder.matches(password, user.getPassword())) {
            System.out.println("login successfully");
            return ResponseEntity.ok(user);
        }else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST) ;
        }
    }

    @PostMapping(value = "/register")
    private int registerUser(@RequestBody TicketappUser user)
    {
        userService.saveOrUpdate(user);
        return user.getId();
    }
}
