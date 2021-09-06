package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers () {
        return userRepository.findAll();
    }
    public User addUser (User user) {
        return userRepository.save(user);
    }
    public Optional<User> findUserByLogin (String login) {
        return userRepository.findByLogin(login);
    }

}
