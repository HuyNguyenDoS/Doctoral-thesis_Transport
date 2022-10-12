package doan.backend.transport.entity;

import javax.persistence.*;

@Table(name = "ticketapp_district")
@Entity
public class TicketappDistrict {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cityID_id", nullable = false)
    private TicketappCity cityID;

    public TicketappCity getCityID() {
        return cityID;
    }

    public void setCityID(TicketappCity cityID) {
        this.cityID = cityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}