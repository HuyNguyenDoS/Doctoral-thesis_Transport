package doan.backend.transport.entity;

import javax.persistence.*;

@Table(name = "ticketapp_bookingstatus")
@Entity
public class TicketappBookingstatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}