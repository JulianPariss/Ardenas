package com.example.Ardenas_backend.controller;

import com.example.Ardenas_backend.model.GameRole;
import com.example.Ardenas_backend.service.GameRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gameRoles")
public class GameRoleController {
    @Autowired
    GameRoleService gameRoleService;

    @PostMapping("/new")
    public ResponseEntity<GameRole> saveGameRole (@RequestBody GameRole gr) {
        gameRoleService.saveGameRole(gr);
        return new ResponseEntity<GameRole>(HttpStatus.CREATED);
    }
}
