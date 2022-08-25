package com.example.Ardenas_backend.controller;


import com.example.Ardenas_backend.exceptions.ResourceNotFoundException;
import com.example.Ardenas_backend.model.Users;
import com.example.Ardenas_backend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UsersController {
    @Autowired
    UsersService userService;


    @GetMapping("/list")
    public List<Users> listUser() {
        return userService.listUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> getUser(@PathVariable Long id) throws ResourceNotFoundException{
        Optional<Users> userSerched = userService.findUserById(id);
        if (userSerched.isPresent()){
            return ResponseEntity.ok(userSerched.get());
        }
        else {
            throw new ResourceNotFoundException("User with ID:" + id + " not found or not exist");
        }
    }

    @PostMapping("/new")
    public ResponseEntity<Users> saveUser(@RequestBody Users user) throws ResourceNotFoundException{
        Users uSaved = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.findUserById(uSaved.getId()).get());
    }


}
