package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappGarage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TicketappGarageRepository extends JpaRepository<TicketappGarage, Integer>, JpaSpecificationExecutor<TicketappGarage> {
    @Query("SELECT u FROM TicketappGarage u WHERE u.id=:id")
    Optional<TicketappGarage> findById(int id);
}