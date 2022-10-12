//package doan.backend.transport.service;
//
//import doan.backend.transport.entity.TicketappUser;
//import doan.backend.transport.repository.TicketappUserRepository;
//import doan.backend.transport.repository.dao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Service("userService")
//public class UserService implements UserDetailsService, dao<TicketappUser> {
//    @Autowired
//    private TicketappUserRepository ticketappUserRepository;
//
//    @Override
//    public List<TicketappUser> getList() {
//        // TODO Auto-generated method stub
//        return ticketappUserRepository.findAll();
//    }
//
//    @Override
//    public TicketappUser findById(int id) {
//        return null;
//    }
//
//    @Override
//    public void insert(TicketappUser vo) {
//
//    }
//
//    @Override
//    public void update(TicketappUser vo) {
//
//    }
//
//    @Override
//    public void delete(int id) {
//
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return new MyUserDetails(username);
//    }
//
//    private List<SimpleGrantedAuthority> getAuthority(TicketappUser user) {
//        if(user.getUserRole()) {
//            return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
//        }else {
//            return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
//        }
//
//    }
//}
