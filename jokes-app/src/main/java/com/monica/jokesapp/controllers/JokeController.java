package com.monica.jokesapp.controllers;

import com.monica.jokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokesService jokesServiceImpl;

    @Autowired
    public JokeController(JokesService jokesServiceImpl) {
        this.jokesServiceImpl = jokesServiceImpl;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("jocke", jokesServiceImpl.getJoke());
        return "joke";
    }

}
