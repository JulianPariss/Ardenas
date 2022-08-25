package com.example.Ardenas_backend.service;

import com.example.Ardenas_backend.exceptions.ResourceNotFoundException;
import com.example.Ardenas_backend.model.Users;
import com.example.Ardenas_backend.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    UsersRepository userRepository;

    public Users saveUser(Users us) {
        Users newUser = new Users(us.getName(), us.getLastName(), us.getPassword(), us.getNickname(), us.getPhoneNumber(), us.getEMail());
        return userRepository.saveAndFlush(newUser);
    }
    public List<Users> listUsers(){
        return userRepository.findAll();
    }
    public Optional<Users> findUserById(Long id) throws ResourceNotFoundException {
        Optional<Users> serchedUser = userRepository.findById(id);
        if (serchedUser.isPresent()) {
            return userRepository.findById(id);
        } else {
            throw new ResourceNotFoundException("User with ID:" + id + " not found or not exist");
        }
    }

}
