package com.example.controllers;

import com.example.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private JokeService jokeService;

    @Autowired
    public JokesController (JokeService jokeService){
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        System.out.println("I came here==============1");
        model.addAttribute("joke",jokeService.getJoke());
        System.out.println("I came here==============");
        return "chucknorris";
    }
}
