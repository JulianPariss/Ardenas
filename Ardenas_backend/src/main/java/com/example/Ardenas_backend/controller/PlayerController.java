package com.example.Ardenas_backend.controller;

import com.example.Ardenas_backend.exceptions.ResourceNotFoundException;
import com.example.Ardenas_backend.model.DTO.PlayerDTO;
import com.example.Ardenas_backend.model.GameRole;
import com.example.Ardenas_backend.model.Player;
import com.example.Ardenas_backend.service.GameRoleService;
import com.example.Ardenas_backend.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.relation.Role;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    PlayerService playerService;
    @Autowired
    GameRoleService gameRoleService;

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
    public ResponseEntity<Player> savePlayer(@RequestBody PlayerDTO pl) throws ResourceNotFoundException {
        Player savedPlayer = playerService.savePlayer(pl);

        if (playerService.getPlayerById(savedPlayer.getId()).isPresent()){
           return ResponseEntity.status(HttpStatus.CREATED).body(playerService.getPlayerById(savedPlayer.getId()).get());
        }
        else {
            throw new ResourceNotFoundException("Player not created");
        }
    }

    @PutMapping("/assignRole/{id_user}/{id_role}")
    public ResponseEntity<Player> assignRole(@PathVariable Long id_user,@PathVariable Long id_role) throws ResourceNotFoundException{
        Optional<Player> serchedPlayer = playerService.getPlayerById(id_user);
        if (serchedPlayer.isPresent()){
            serchedPlayer.get().getGame_role().add(gameRoleService.getGameRoleById(id_role));
            playerService.updatePlayer(serchedPlayer.get());
            return ResponseEntity.status(HttpStatus.OK).body(serchedPlayer.get());
        }
        else throw new ResourceNotFoundException("Player not found");
    }
}
