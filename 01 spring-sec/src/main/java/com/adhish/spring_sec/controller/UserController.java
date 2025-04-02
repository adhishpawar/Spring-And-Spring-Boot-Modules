package com.adhish.spring_sec.controller;

import com.adhish.spring_sec.model.User;
import com.adhish.spring_sec.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("register")
    public User registerUser(@RequestBody User user)
    {
        return service.saveUser(user);
    }
}
