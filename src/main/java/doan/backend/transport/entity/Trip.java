package doan.backend.transport.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "trip")
public class Trip implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "departure")
    private String departure;

    @Column(name = "destination")
    private String destination;

    @Column(name = "distance")
    private Double distance;

    @Column(name = "journey_time")
    private String journeyTime;

    @Column(name = "ticket_price")
    private BigDecimal ticketPrice;

    @Column(name = "pick_up_point")
    private String pickUpPoint;

    @Column(name = "drop_off_point")
    private String dropOffPoint;

    @Column(name = "carrier_id", nullable = false)
    private Integer carrierId;

}
