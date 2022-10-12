package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappUser;
import doan.backend.transport.repository.TicketappUserRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService, dao {

    @Autowired
    TicketappUserRepository userRepository;

    @Autowired
    @Lazy
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<TicketappUser> user = userRepository.findByUserName(username);

        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));

        return user.map(doan.backend.transport.entity.MyUserDetails::new).get();
    }

    public void saveOrUpdate(TicketappUser user)
    {
        user.setDateJoined(new Date());
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public List<TicketappUser> getList() {
        return userRepository.findAll();
    }

    @Override
    public Optional<TicketappUser> findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void insert(Object vo) {

    }

    @Override
    public void update(Object vo) {

    }

    @Override
    public void delete(int id) {
        userRepository.deleteUser(id);
    }
}
