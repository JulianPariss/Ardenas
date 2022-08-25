package com.example.Ardenas_backend.model;

import javax.persistence.*;

import com.sun.istack.NotNull;
import lombok.*;

@Entity
@Table(name = "contact_info")
@Getter
@Setter
public class Contact_info {
    @NotNull
    @Id
    @SequenceGenerator(name = "contact_sequence", sequenceName = "contact_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_sequence")
    private Long id;
    @NotNull
    @Column
    private String phoneNumber;
    @NotNull
    @Column
    private String email;
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}
