package com.example.Ardenas_backend.model;


import javax.persistence.*;
import com.sun.istack.internal.*;
import lombok.*;




@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @NotNull
    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
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
    @OneToOne
    private Long contact_info;

}
