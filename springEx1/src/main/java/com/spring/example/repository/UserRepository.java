package com.spring.example.repository;

import com.spring.example.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface   UserRepository  extends MongoRepository<User,String> {
    public User findByName(String name);
}
