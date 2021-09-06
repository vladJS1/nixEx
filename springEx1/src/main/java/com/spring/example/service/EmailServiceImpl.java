package com.spring.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl{
    @Autowired
    private JavaMailSender mailSender;
public String sendSimpleMessage(String to,String subject,String text){
    SimpleMailMessage message = new SimpleMailMessage();

    message.setTo("vharcuk02@gmail.com");
    message.setSubject("Test simple Email");
    message.setText("Hello email");

    mailSender.send(message);
    return  "Email sent!";
}
}
