package com.example.bookmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.bookmovie.models.Movie;
import com.example.bookmovie.service.MovieService;

@Controller
public class MainController {
    @Autowired
    MovieService movieService;

    MovieController movieController;

    @GetMapping("/")
    public String homePage(Model model) {
        System.out.println("HOME PAGE");
        model.addAttribute("movieList", movieService.getMovies());
        return "Home";
    }

    @GetMapping("/addMovie")
    public String addMovie(Model model) {
        model.addAttribute("movie", new Movie());
        System.out.println("ADDMOVIE");
        return "AddMovie";
    }
}
