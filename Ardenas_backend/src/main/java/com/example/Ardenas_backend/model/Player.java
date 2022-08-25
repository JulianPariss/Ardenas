package com.example.Ardenas_backend.model;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name="name")
    private String name;
    @NotNull
    @Column(name="lastname")
    private String lastname;
    @NotNull
    @Column(name="nickname")
    private String nickname;
    @NotNull
    @Column(name="password")
    private String password;
    @NotNull
    @Column(name="email")
    private String email;
    @NotNull
    @Column(name="phone_num")
    private String phone_num;
    @OneToMany(mappedBy = "id_player")
    private Set<Role> roles = new HashSet<>();


    public Player () {}

    public Player(Long id, String name, String lastname, String nickname, String password, String email, String phone_num) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.phone_num = phone_num;
    }
    public Player(String name, String lastname, String nickname, String password, String email, String phone_num) {
        this.name = name;
        this.lastname = lastname;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.phone_num = phone_num;
    }
}
