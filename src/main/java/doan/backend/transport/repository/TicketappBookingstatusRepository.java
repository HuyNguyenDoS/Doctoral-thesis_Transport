package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappBookingstatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TicketappBookingstatusRepository extends JpaRepository<TicketappBookingstatus, Integer>, JpaSpecificationExecutor<TicketappBookingstatus> {

}