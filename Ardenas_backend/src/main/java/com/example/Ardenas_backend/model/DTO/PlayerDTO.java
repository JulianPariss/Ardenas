package com.example.Ardenas_backend.model.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDTO {
    private String name;
    private String lastname;
    private String nickname;
    private String password;
    private String email;
    private String phone_num;

    public PlayerDTO(){}

    public PlayerDTO(String name, String lastname, String nickname, String password, String email, String phone_num) {
        this.name = name;
        this.lastname = lastname;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.phone_num = phone_num;
    }
}
