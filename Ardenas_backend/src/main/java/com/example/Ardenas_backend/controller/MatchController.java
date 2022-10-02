package com.example.Ardenas_backend.controller;

import com.example.Ardenas_backend.exceptions.ResourceNotFoundException;
import com.example.Ardenas_backend.model.GameRole;
import com.example.Ardenas_backend.model.Match;
import com.example.Ardenas_backend.model.Player;
import com.example.Ardenas_backend.service.GameRoleService;
import com.example.Ardenas_backend.service.MatchService;
import com.example.Ardenas_backend.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/matches")
public class MatchController {
    @Autowired
    MatchService matchService;

    @Autowired
    PlayerService playerService;

    @PostMapping("/new")
    public ResponseEntity<Match> saveMatch (@RequestBody Match mt) {
        matchService.saveMatch(mt);
        return new ResponseEntity<Match>(HttpStatus.CREATED);
    }

    @PutMapping("/join/{match_id}/{user_id}")
    public ResponseEntity<Match> assignPlayerToMatch (@PathVariable Long match_id, @PathVariable Long user_id) throws ResourceNotFoundException {
        Optional<Match> selected_match = matchService.getMatchById(match_id);
        Optional<Player> playerSerched = playerService.getPlayerById(user_id);
        if(selected_match.isPresent() && playerSerched.isPresent()){
            selected_match.get().addPlayer(playerSerched.get());
            matchService.updateMatch(selected_match.get());
            return ResponseEntity.status(HttpStatus.OK).body(selected_match.get());
        }
        else throw new ResourceNotFoundException("Player or Match not found");
    }

}
