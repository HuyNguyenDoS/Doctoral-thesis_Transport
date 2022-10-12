package doan.backend.transport.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ticketapp_bus", indexes = {
        @Index(name = "fk_ticketapp_bus_ticketapp_user1_idx", columnList = "ticketapp_user_id"),
        @Index(name = "busModel_UNIQUE", columnList = "busModel", unique = true)
})
@Entity
public class TicketappBus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "busModel", nullable = false, length = 10)
    private String busModel;

    @ManyToOne(optional = false)
    @JoinColumn(name = "typeBusID_id", nullable = false)
    private TicketappTypebus typeBusID;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ticketapp_user_id", nullable = false)
    private TicketappUser ticketappUser;

    @Column(name = "name_bus", length = 100)
    private String nameBus;

    @Column(name = "image")
    private String image;

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNameBus() {
        return nameBus;
    }

    public void setNameBus(String nameBus) {
        this.nameBus = nameBus;
    }

    public TicketappUser getTicketappUser() {
        return ticketappUser;
    }

    public void setTicketappUser(TicketappUser ticketappUser) {
        this.ticketappUser = ticketappUser;
    }

    public TicketappTypebus getTypeBusID() {
        return typeBusID;
    }

    public void setTypeBusID(TicketappTypebus typeBusID) {
        this.typeBusID = typeBusID;
    }

    public String getBusModel() {
        return busModel;
    }

    public void setBusModel(String busModel) {
        this.busModel = busModel;
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