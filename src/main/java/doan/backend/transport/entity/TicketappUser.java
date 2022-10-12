package doan.backend.transport.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Table(name = "ticketapp_user", indexes = {
        @Index(name = "phone", columnList = "phone", unique = true),
        @Index(name = "username", columnList = "username", unique = true)
})
@Entity
public class TicketappUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "password", nullable = false, length = 128)
    private String password;

    @Lob
    @Column(name = "user_role", nullable = false)
    private String userRole;

    @Column(name = "username", nullable = false, length = 150)
    private String username;

    @Column(name = "first_name", nullable = false, length = 150)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 150)
    private String lastName;

    @Column(name = "email", nullable = false, length = 254)
    private String email;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;

    @Column(name = "date_joined", nullable = false)
    private Date dateJoined;

    @Column(name = "last_login", nullable = true)
    private Instant lastLogin;

    @Column(name = "avatar", length = 100)
    private String avatar;

    @Column(name = "phone", length = 11)
    private String phone;

    @ManyToOne
    @JoinColumn(name = "garageID_id")
    private TicketappGarage garageID;

    @Transient
    private MultipartFile file;
    {
        userRole = "customer";
    }

    public TicketappGarage getGarageID() {
        return garageID;
    }

    public void setGarageID(TicketappGarage garageID) {
        this.garageID = garageID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Instant getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Instant lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}