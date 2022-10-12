package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappBus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface TicketappBusRepository extends JpaRepository<TicketappBus, Integer>, JpaSpecificationExecutor<TicketappBus> {
    @Query("SELECT u FROM TicketappBus u WHERE u.id=:id")
    Optional<TicketappBus> findById(int id);

    //TicketappUser findByUserName(String username);

    @Query("UPDATE TicketappBus SET active = false WHERE id=:id")
    @Modifying
    @Transactional
    void deleteBus(int id);
}