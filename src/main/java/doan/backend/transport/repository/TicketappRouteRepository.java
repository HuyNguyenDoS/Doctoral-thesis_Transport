package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface TicketappRouteRepository extends JpaRepository<TicketappRoute, Integer>, JpaSpecificationExecutor<TicketappRoute> {
    @Query("SELECT u FROM TicketappRoute u WHERE u.id=:id")
    Optional<TicketappRoute> findByCityFrom(int id);

    //TicketappUser findByUserName(String username);

    @Query("UPDATE TicketappRoute SET active = false WHERE id=:id")
    @Modifying
    @Transactional
    void deleteRoute(int id);
}