package doan.backend.transport.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_comment", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComment;

    @Column(name = "content")
    private String content;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "carrier_id", nullable = false)
    private Integer carrierId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

}
