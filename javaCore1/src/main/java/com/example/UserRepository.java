package com.example;


import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;
import java.util.Optional;


public interface UserRepository extends MongoRepository<User,String> {

    public User findByFirstName (String firstName);
    public List<User> findAll();

    Optional<User> findByLogin(String login);
}
