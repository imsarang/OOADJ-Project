package com.example.bookmovie.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmovie.models.Show;
import com.example.bookmovie.service.ShowService;

@RestController
public class ShowController {
    private ShowService showService;

    public ShowController(ShowService showService){
        this.showService = showService;
    }

    @GetMapping("/shows")
    public List<Show> getAll(){
        return showService.getShows();
    }

    @PostMapping("/shows")
    public Show addShow(@RequestBody Show show){
        return showService.addShow(show);
    }

    @GetMapping("/shows/{showId}")
    public Show getById(@PathVariable Integer showId){
        return showService.getShowById(showId);
    }

    // @GetMapping("/shows/movie/{movieId}")
    // public Show getByMovieId(@PathVariable Integer movieId){
    //     return showService.getShowByMovieId(movieId);
    // }

    // @GetMapping("/shows/theatre/{theatreId}")
    // public Show getByTheatreId(@PathVariable Integer theatreId){
    //     return showService.getShowByTheatreId(theatreId);
    // }
}
