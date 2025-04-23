package com.example.jWTAuth.jwtAuth.controller;

import com.example.jWTAuth.jwtAuth.model.Player;
import com.example.jWTAuth.jwtAuth.model.Users;
import com.example.jWTAuth.jwtAuth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return service.register(user);

    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        return service.verify(user);
    }

}
