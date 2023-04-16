package com.example.bookmovie.service;

import java.util.List;

import com.example.bookmovie.models.Movie;

public interface MovieService {
    public List<Movie> getMovies();
    public Movie addMovie(Movie movie);
    public Movie getMovieById(Integer movieId);
}

