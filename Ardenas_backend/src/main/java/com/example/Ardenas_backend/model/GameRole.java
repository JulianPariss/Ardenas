package com.example.Ardenas_backend.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="game_role")
public class GameRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name="role_name")
    private String role_name;

    public GameRole (){}

    public GameRole(Long id, String role_name) {
        this.id = id;
        this.role_name = role_name;
    }
    public GameRole(String role_name) {
        this.role_name = role_name;
    }
}
