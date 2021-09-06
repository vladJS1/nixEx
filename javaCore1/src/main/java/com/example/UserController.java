package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private UserService userService = new UserService();
    @GetMapping("/addUser")
    public User addUser(User user){
        return userService.addUser(user);
    }
    @GetMapping("/showUsers")
    public List<User> showUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/getUser")
    public Optional<User> getUser(@RequestParam(value = "login") String login) {
        return userService.findUserByLogin(login);
    }

}
