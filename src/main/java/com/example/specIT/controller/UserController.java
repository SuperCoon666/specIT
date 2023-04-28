package com.example.specIT.controller;

import com.example.specIT.model.Post;
import com.example.specIT.model.User;
import com.example.specIT.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{username}")
    public User getUserInfo(@PathVariable String username) {
        return userRepository.findByUsername(username);
    }

    @GetMapping
    public List<User> getAllPosts() {
        return userRepository.findAll();
    }

}
