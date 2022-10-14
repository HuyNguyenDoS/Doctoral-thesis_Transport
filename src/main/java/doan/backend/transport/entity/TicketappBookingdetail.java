package doan.backend.transport.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ticketapp_bookingdetail", indexes = {
        @Index(name = "fk_ticketapp_bookingdetail_ticketapp_seat1_idx", columnList = "ticketapp_seat_id"),
        @Index(name = "fk_ticketapp_bookingdetail_ticketapp_booking1_idx", columnList = "ticketapp_booking_id"),
        @Index(name = "ticketapp_bookingdet_from_garage_id_79361808_fk_ticketapp", columnList = "from_garage_id"),
        @Index(name = "ticketapp_bookingdetail_seatID_id_80c71163_fk_ticketapp_seat_id", columnList = "seatID_id")
})
@Entity
public class TicketappBookingdetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "from_garage_id")
    private Integer fromGarageId;

    @Column(name = "seatID_id")
    private Integer seatidId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ticketapp_booking_id", nullable = false)
    private TicketappBooking ticketappBooking;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ticketapp_seat_id", nullable = false)
    private TicketappSeat ticketappSeat;

    @Transient
    private MultipartFile file;

    {
        active = true;
    }

    public TicketappSeat getTicketappSeat() {
        return ticketappSeat;
    }

    public void setTicketappSeat(TicketappSeat ticketappSeat) {
        this.ticketappSeat = ticketappSeat;
    }

    public TicketappBooking getTicketappBooking() {
        return ticketappBooking;
    }

    public void setTicketappBooking(TicketappBooking ticketappBooking) {
        this.ticketappBooking = ticketappBooking;
    }

    public Integer getSeatidId() {
        return seatidId;
    }

    public void setSeatidId(Integer seatidId) {
        this.seatidId = seatidId;
    }

    public Integer getFromGarageId() {
        return fromGarageId;
    }

    public void setFromGarageId(Integer fromGarageId) {
        this.fromGarageId = fromGarageId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}