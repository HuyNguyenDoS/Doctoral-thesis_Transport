package doan.backend.transport.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ticketapp_route", indexes = {
        @Index(name = "ticketapp_route_city_from_id_to_garage_id_725e3b00_uniq", columnList = "city_from_id, to_garage_id", unique = true)
})
@Entity
public class TicketappRoute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "city_from_id", nullable = false)
    private TicketappCity cityFrom;

    @ManyToOne(optional = false)
    @JoinColumn(name = "to_garage_id", nullable = false)
    private TicketappGarage toGarage;

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

    public TicketappGarage getToGarage() {
        return toGarage;
    }

    public void setToGarage(TicketappGarage toGarage) {
        this.toGarage = toGarage;
    }

    public TicketappCity getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(TicketappCity cityFrom) {
        this.cityFrom = cityFrom;
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