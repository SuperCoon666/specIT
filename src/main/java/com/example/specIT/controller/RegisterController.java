package com.example.specIT.controller;

import com.example.specIT.model.User;
import com.example.specIT.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Controller class for handling registration requests.
 */
@Controller
public class RegisterController {
    @Autowired
    private UserRepository userRepository;

    /**
     * Displays the registration form.
     * @param model the model to add attributes to
     * @return the name of the view to render
     */
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("title", "Register");
        return "register";
    }

    /**
     * Displays the registration form.
     * @param user  the model to add attributes to
     */
    @PostMapping("/register")
    public void registerUser(@ModelAttribute("user") User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userRepository.save(user);
    }
}
