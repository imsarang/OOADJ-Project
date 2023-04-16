package com.example.bookmovie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.bookmovie.models.Movie;
import com.example.bookmovie.repositories.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Integer movieId) {
        Optional<Movie> result = movieRepository.findById(movieId);
        return result.get();
    }

    @Override
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
    
}
