package doan.backend.transport.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ticketapp_typebus", indexes = {
        @Index(name = "name", columnList = "name", unique = true)
})
@Entity
public class TicketappTypebus {
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

    @Transient
    private MultipartFile file;

    {
        active = true;
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