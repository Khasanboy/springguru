package com.monica.jpaexample.controller;

import com.monica.jpaexample.repository.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    private String getAuthors(Model model) {
        model.addAttribute("authors", this.authorRepository.findAll());

        return "authors";
    }

}
