package com.example.Ardenas_backend.controller;

import com.example.Ardenas_backend.exceptions.ResourceNotFoundException;
import com.example.Ardenas_backend.model.Player;
import com.example.Ardenas_backend.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping("/all")
    public List<Player> allPlayers(){
        return playerService.findAll();
    }

    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable Long id) throws ResourceNotFoundException {
        Optional<Player> serchedPlayer =  playerService.getPlayerById(id);
        if (serchedPlayer.isPresent()){
            return serchedPlayer.get();
        }
        else{
            throw new ResourceNotFoundException("Player with id:"+id+" dosen´t exist");
        }
    }

    @PostMapping("/new")
    public ResponseEntity<Player> savePlayer(@RequestBody Player pl) throws ResourceNotFoundException {
        Player savedPlayer = playerService.savePlayer(pl);

        if (playerService.getPlayerById(pl.getId()).isPresent()){
           return ResponseEntity.status(HttpStatus.CREATED).body(playerService.getPlayerById(pl.getId()).get());
        }
        else {
            throw new ResourceNotFoundException("Player not created");
        }
    }
}
