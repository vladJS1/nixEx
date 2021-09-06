package com.example;

import lombok.*;
import org.springframework.data.annotation.Id;



@AllArgsConstructor
@Data
public class User {
    @Id
    private String id;

    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
}
