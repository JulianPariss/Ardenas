package com.example.Ardenas_backend.service;

import com.example.Ardenas_backend.model.GameRole;
import com.example.Ardenas_backend.repository.GameRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameRoleService {

    @Autowired
    GameRoleRepository gameRoleRepository;

    public GameRole saveGameRole(GameRole gr) {
        return  gameRoleRepository.save(gr);
    }

}
