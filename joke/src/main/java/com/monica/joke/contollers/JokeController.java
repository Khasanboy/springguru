package com.monica.joke.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.monica.joke.services.JokeService;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(final JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"", "/", "/joke"})
    public String getJoke(Model model){

        model.addAttribute("joke", jokeService.getQuote());

        return "joke";
    }

}
