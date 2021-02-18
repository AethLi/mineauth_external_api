package cn.aethli.mineauth.external.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
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
    @NotEmpty
    private String uuid;
    @Column(name = "USERNAME")
    @NotBlank
    private String userName;
    @Column(name = "PASSWORD")
    @NotBlank
    private String password;
    @Column(name = "LAST_LOGIN")
    private LocalDateTime lastLogin;
    @Column(name = "BANNED")
    private Boolean banned=Boolean.FALSE;
    @Column(name = "EMAIL")
    private String identifier;
    @Column(name = "IP")
    private String ip;
    @Column(name = "FORGET")
    private Boolean forget=Boolean.FALSE;
    @Column(name = "IPV6")
    private String ipv6;
}
