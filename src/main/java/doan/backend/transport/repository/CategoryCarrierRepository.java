package doan.backend.transport.repository;

import doan.backend.transport.entity.CategoryCarrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoryCarrierRepository extends JpaRepository<CategoryCarrier, Integer>, JpaSpecificationExecutor<CategoryCarrier> {

}