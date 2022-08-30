package com.example.Ardenas_backend.service;

import com.example.Ardenas_backend.exceptions.ResourceNotFoundException;
import com.example.Ardenas_backend.model.GameRole;
import com.example.Ardenas_backend.repository.GameRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameRoleService {

    @Autowired
    GameRoleRepository gameRoleRepository;

    public GameRole saveGameRole(GameRole gr) {
        return  gameRoleRepository.save(gr);
    }

    public GameRole getGameRoleById(Long id) throws ResourceNotFoundException {
        Optional<GameRole> serchedGameRole = gameRoleRepository.findById(id);
        if (serchedGameRole.isPresent()){
            return serchedGameRole.get();
        }
        else throw new ResourceNotFoundException("Role not found");

    }

}
