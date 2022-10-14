package doan.backend.transport.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ticketapp_rating", indexes = {
        @Index(name = "ticketapp_rating_user_id_36c4195d", columnList = "user_id")
})
@Entity
public class TicketappRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "rate", nullable = false)
    private Integer rate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "busroute_id", nullable = false)
    private TicketappBusroute busroute;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private TicketappUser user;

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private TicketappComment comment;

    public TicketappComment getComment() {
        return comment;
    }

    public void setComment(TicketappComment comment) {
        this.comment = comment;
    }

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

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
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