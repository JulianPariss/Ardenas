package com.example.Ardenas_backend.service;

import com.example.Ardenas_backend.exceptions.ResourceNotFoundException;
import com.example.Ardenas_backend.model.Player;
import com.example.Ardenas_backend.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public List<Player> findAll () {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById (Long id) throws ResourceNotFoundException {
        Optional<Player> serchedPlayer = playerRepository.findById(id);
        if (serchedPlayer.isPresent()){
            return serchedPlayer;
        }
        else {
            throw new ResourceNotFoundException("Player with id:"+id+" dosen´t exist");
        }
    }

    public Player savePlayer(Player pl){
        return playerRepository.save(pl);
    }

}
