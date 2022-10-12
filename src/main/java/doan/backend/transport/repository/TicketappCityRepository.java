package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TicketappCityRepository extends JpaRepository<TicketappCity, Integer>, JpaSpecificationExecutor<TicketappCity> {
    @Query("SELECT u FROM TicketappCity u WHERE u.id=:id")
    Optional<TicketappCity> findById(int id);
}