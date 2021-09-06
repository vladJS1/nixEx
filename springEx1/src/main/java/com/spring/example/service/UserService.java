package com.spring.example.service;

import com.spring.example.entity.User;
import com.spring.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public Optional<User> getUser(String name){
        try{
            Optional<User> op = Optional.of(repository.findByName(name));
            return op;
        }catch(NullPointerException e){
            return null;
        }

    }

    public ResponseEntity<String> registration(User user){
        try{
            repository.save(user);
            return ResponseEntity.ok("Good jobe");
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body("error");
        }
    }

}
