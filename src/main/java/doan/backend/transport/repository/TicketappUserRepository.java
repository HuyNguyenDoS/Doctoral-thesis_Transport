package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface TicketappUserRepository extends JpaRepository<TicketappUser, Integer> {
    @Query("SELECT u FROM TicketappUser u WHERE u.username =: username")
    Optional<TicketappUser> findByUserName(String username);

    //TicketappUser findByUserName(String username);

    @Query("UPDATE TicketappUser SET isActive = false WHERE id=:id")
    @Modifying
    @Transactional
    void deleteUser(int id);
}