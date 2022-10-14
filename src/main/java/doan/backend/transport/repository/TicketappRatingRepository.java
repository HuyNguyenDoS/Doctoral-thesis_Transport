package doan.backend.transport.repository;

import doan.backend.transport.entity.TicketappRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TicketappRatingRepository extends JpaRepository<TicketappRating, Integer>, JpaSpecificationExecutor<TicketappRating> {
    @Query("SELECT u FROM TicketappRating u WHERE u.id=:id")
    Optional<TicketappRating> findById(int id);

    @Query("SELECT b FROM TicketappRating b WHERE b.busroute.id=:id")
    List<TicketappRating> findRatingOfRoute(@Param("id") int id );
}