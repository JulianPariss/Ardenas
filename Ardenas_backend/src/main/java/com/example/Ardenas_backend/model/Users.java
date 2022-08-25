package com.example.Ardenas_backend.model;


import javax.persistence.*;
import com.sun.istack.NotNull;
import lombok.*;




@Entity
@Table(name = "users")
@Getter
@Setter
public class Users {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column
    private String name;
    @NotNull
    @Column
    private String lastName;
    @NotNull
    @Column
    private String password;
    @NotNull
    @Column
    private String nickname;
    @NotNull
    @Column
    private String phoneNumber;
    @NotNull
    @Column
    private String eMail;

    public Users() {
    }

    public Users(Long id, String name, String lastName, String password, String nickname, String phoneNumber, String eMail) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public Users(String name, String lastName, String password, String nickname, String phoneNumber, String eMail) {
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

}
