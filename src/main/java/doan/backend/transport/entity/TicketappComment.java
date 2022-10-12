package doan.backend.transport.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ticketapp_comment")
@Entity
public class TicketappComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "content", nullable = false, length = 100)
    private String content;

    @ManyToOne(optional = false)
    @JoinColumn(name = "busroute_id", nullable = false)
    private TicketappBusroute busroute;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private TicketappUser user;

    public TicketappUser getUser() {
        return user;
    }

    public void setUser(TicketappUser user) {
        this.user = user;
    }

    public TicketappBusroute getBusroute() {
        return busroute;
    }

    public void setBusroute(TicketappBusroute busroute) {
        this.busroute = busroute;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}