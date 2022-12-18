package com.example.ar.controller;

import com.example.ar.model.User;
import com.example.ar.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/user")
    public List<User> all() {
        return repository.findAll();
    }

    @PostMapping("/user")
    public User newUser(@RequestBody User user) {
        return repository.save(user);
    }
}
