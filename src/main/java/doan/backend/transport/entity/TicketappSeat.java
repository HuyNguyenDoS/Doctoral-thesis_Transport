package doan.backend.transport.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "ticketapp_seat")
@Entity
public class TicketappSeat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "location", nullable = false)
    private String location;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "type_busid_id", nullable = false, referencedColumnName = "id")
    private TicketappTypebus typeBusid;

    public TicketappTypebus getTypeBusid() {
        return typeBusid;
    }

    public void setTypeBusid(TicketappTypebus typeBusid) {
        this.typeBusid = typeBusid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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