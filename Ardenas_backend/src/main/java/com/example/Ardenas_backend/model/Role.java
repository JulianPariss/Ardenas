package com.example.Ardenas_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {
    @NotNull
    @Id
    private Long id;
    @NotNull
    @Column(name = "role_Type")
    @Enumerated(EnumType.STRING)
    private RolesTypes rolesTypes;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="id_player", referencedColumnName = "id")
    private Player id_player;
}
