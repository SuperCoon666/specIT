package com.example.specIT.controller;

import com.example.specIT.model.Post;
import com.example.specIT.model.User;
import com.example.specIT.repository.PostRepository;
import com.example.specIT.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/user/{username}")
    public List<Post> getPostsByUser(@PathVariable String username) {
        User user = userRepository.findByUsername(username);
        return postRepository.findByUser(user);
    }
}
