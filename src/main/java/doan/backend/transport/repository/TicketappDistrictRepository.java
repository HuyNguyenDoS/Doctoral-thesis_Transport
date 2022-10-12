package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TicketappDistrictRepository extends JpaRepository<TicketappDistrict, String>, JpaSpecificationExecutor<TicketappDistrict> {

}