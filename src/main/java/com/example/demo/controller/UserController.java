package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.service.UserEncryp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserEncryp userEncryp;

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return userEncryp.register(user);
    }
}
