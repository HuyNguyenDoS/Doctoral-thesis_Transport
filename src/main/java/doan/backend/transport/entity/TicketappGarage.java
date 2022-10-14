package doan.backend.transport.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ticketapp_garage", indexes = {
        @Index(name = "address", columnList = "address", unique = true),
        @Index(name = "name", columnList = "name", unique = true)
})
@Entity
public class TicketappGarage {
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

    @Column(name = "address", nullable = false)
    private String address;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cityID_id", nullable = false)
    private TicketappCity cityID;

    @ManyToOne(optional = false)
    @JoinColumn(name = "districtID_id", nullable = false)
    private TicketappDistrict districtID;

    @Transient
    private MultipartFile file;

    {
        active = true;
    }

    public TicketappDistrict getDistrictID() {
        return districtID;
    }

    public void setDistrictID(TicketappDistrict districtID) {
        this.districtID = districtID;
    }

    public TicketappCity getCityID() {
        return cityID;
    }

    public void setCityID(TicketappCity cityID) {
        this.cityID = cityID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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