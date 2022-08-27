package doan.backend.transport.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Quan ly cac chuyen xe\\\\\\\\\\\\\\\\  number_plate: bien so xe\\\\\\\\\\\\\\\\   seat_number: so ghe\\\\\\\\\\\\\\\\n
 */
@Data
@Entity
@Table(name = "carrier")
public class Carrier implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "license_plate")
    private String licensePlate;

    @Column(name = "carrier_name")
    private String carrierName;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "seat_number")
    private Integer seatNumber;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "category_carrier_id")
    private Integer categoryCarrierId;

    @Column(name = "staff_id")
    private Integer staffId;

}
