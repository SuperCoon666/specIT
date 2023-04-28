package com.example.specIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller class for handling login requests.
 */
@Controller
public class LoginController {

    /**
     * Displays the login form.
     *
     * @param model the model to add attributes to
     * @return the name of the view to render
     */
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("title", "Login");
        return "login";
    }
}
