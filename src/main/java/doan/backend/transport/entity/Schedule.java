package doan.backend.transport.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "schedule")
public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name = "destination_date")
    private Date destinationDate;

    @Column(name = "departure_time")
    private String departureTime;

    @Column(name = "destination_time")
    private String destinationTime;

    @Column(name = "trip_id", nullable = false)
    private Integer tripId;

    @Column(name = "carrier_id", nullable = false)
    private Integer carrierId;

}
