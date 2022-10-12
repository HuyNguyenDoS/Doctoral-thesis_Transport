package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappBusroute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TicketappBusrouteRepository extends JpaRepository<TicketappBusroute, Integer>, JpaSpecificationExecutor<TicketappBusroute> {

}