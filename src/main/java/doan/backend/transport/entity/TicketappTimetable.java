package doan.backend.transport.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Table(name = "ticketapp_timetable")
@Entity
public class TicketappTimetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "time", nullable = false)
    private LocalTime time;

    @ManyToOne(optional = false)
    @JoinColumn(name = "busRouteID_id", nullable = false)
    private TicketappBusroute busRouteID;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private TicketappUser driver;

    @Transient
    private MultipartFile file;

    {
        active = true;
    }

    public TicketappUser getDriver() {
        return driver;
    }

    public void setDriver(TicketappUser driver) {
        this.driver = driver;
    }

    public TicketappBusroute getBusRouteID() {
        return busRouteID;
    }

    public void setBusRouteID(TicketappBusroute busRouteID) {
        this.busRouteID = busRouteID;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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