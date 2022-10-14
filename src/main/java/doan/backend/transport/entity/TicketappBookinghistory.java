package doan.backend.transport.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ticketapp_bookinghistory", indexes = {
        @Index(name = "bookingID_id", columnList = "bookingID_id", unique = true)
})
@Entity
public class TicketappBookinghistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "statusDate", nullable = false)
    private Date statusDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "bookingID_id", nullable = false)
    private TicketappBooking bookingID;

    @ManyToOne
    @JoinColumn(name = "statusID_id")
    private TicketappBookingstatus statusID;

    @Transient
    private MultipartFile file;

    {
        active = true;
    }

    public TicketappBookingstatus getStatusID() {
        return statusID;
    }

    public void setStatusID(TicketappBookingstatus statusID) {
        this.statusID = statusID;
    }

    public TicketappBooking getBookingID() {
        return bookingID;
    }

    public void setBookingID(TicketappBooking bookingID) {
        this.bookingID = bookingID;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
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