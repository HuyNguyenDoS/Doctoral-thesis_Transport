package doan.backend.transport.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "booking")
public class Booking implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "booking_date")
    private Date bookingDate;

    @Column(name = "status")
    private String status;

    @Column(name = "carrier_id", nullable = false)
    private Integer carrierId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "customer_id")
    private Integer customerId;

}
