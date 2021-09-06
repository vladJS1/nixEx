package com.spring.example.controller;


import com.spring.example.entity.IndexEntity;
import com.spring.example.service.EmailServiceImpl;
import com.spring.example.service.UserService;
import com.spring.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService = new UserService();
    @Autowired
    private EmailServiceImpl emailService = new EmailServiceImpl();

    @PostMapping
    public ResponseEntity registration(@RequestBody User user){
        try{
            userService.registration(user);
            return ResponseEntity.ok("user add");
        }catch(Exception e){
            e.printStackTrace();
           return ResponseEntity.badRequest().body("Error");
        }

    }

    @GetMapping("/")
    public ResponseEntity getUsers(){
        try {

            return ResponseEntity.ok("Server work");
        }catch(Exception e){
            return  ResponseEntity.badRequest().body("Problem was happen");
        }
    }

    @GetMapping("/user")
    public User getUser(@RequestParam String name){
        return userService.getUser(name).get();
    }

    @GetMapping("/mail")
    public String sendMail(){
        return emailService.sendSimpleMessage("1","2","3");
    }

    @RequestMapping(value="/index", method=RequestMethod.GET)
    public ModelAndView getIndex(){
        IndexEntity indexObj = new IndexEntity("Page","row, column, html","red");
        ModelAndView modelAndView = new ModelAndView("index");

        modelAndView.addObject("indexObj",indexObj);
        return modelAndView;
    }
}
