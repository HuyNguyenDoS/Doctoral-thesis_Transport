package doan.backend.transport.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ticketapp_booking", indexes = {
        @Index(name = "fk_ticketapp_booking_ticketapp_timetable1_idx", columnList = "ticketapp_timetable_id"),
        @Index(name = "fk_ticketapp_booking_ticketapp_user1_idx", columnList = "ticketapp_user_id")
})
@Entity
public class TicketappBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone", nullable = false)
    private String phone;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ticketapp_timetable_id", nullable = false)
    private TicketappTimetable ticketappTimetable;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ticketapp_user_id", nullable = false)
    private TicketappUser ticketappUser;

    public TicketappUser getTicketappUser() {
        return ticketappUser;
    }

    public void setTicketappUser(TicketappUser ticketappUser) {
        this.ticketappUser = ticketappUser;
    }

    public TicketappTimetable getTicketappTimetable() {
        return ticketappTimetable;
    }

    public void setTicketappTimetable(TicketappTimetable ticketappTimetable) {
        this.ticketappTimetable = ticketappTimetable;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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