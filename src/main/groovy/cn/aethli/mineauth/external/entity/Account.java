package cn.aethli.mineauth.external.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "PLAYER")
@Getter
@Setter
public class Account {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column(name = "UUID")
    private String uuid;
    @Column(name = "USERNAME")
    private String userName;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "LASTLOGIN")
    private LocalDateTime lastLogin;
    @Column(name = "BANNED")
    private Boolean banned;
    @Column(name = "EMAIL")
    private String identifier;
}
