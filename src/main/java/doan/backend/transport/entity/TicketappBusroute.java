package doan.backend.transport.entity;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "ticketapp_busroute", indexes = {
        @Index(name = "ticketapp_busroute_busID_id_routeID_id_b9a5ba92_uniq", columnList = "busID_id, routeID_id", unique = true)
})
@Entity
public class TicketappBusroute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

    @Column(name = "updated_date", nullable = false)
    private Instant updatedDate;

    @Column(name = "price", nullable = false)
    private Double price;

    @ManyToOne(optional = false)
    @JoinColumn(name = "busID_id", nullable = false)
    private TicketappBus busID;

    @ManyToOne(optional = false)
    @JoinColumn(name = "routeID_id", nullable = false)
    private TicketappRoute routeID;

    public TicketappRoute getRouteID() {
        return routeID;
    }

    public void setRouteID(TicketappRoute routeID) {
        this.routeID = routeID;
    }

    public TicketappBus getBusID() {
        return busID;
    }

    public void setBusID(TicketappBus busID) {
        this.busID = busID;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Instant getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Instant updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
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