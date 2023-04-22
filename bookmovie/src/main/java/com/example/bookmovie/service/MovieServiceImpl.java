package com.example.bookmovie.service;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.bookmovie.models.Movie;
import com.example.bookmovie.repositories.MovieRepository;

import org.springframework.util.StringUtils;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getMovies() {
        List<Movie> movieList = new ArrayList<>();
        movieRepository.findAll().forEach(movie -> movieList.add(movie));
        System.out.println(movieList);
        return movieList;
    }

    @Override
    public Movie getMovieById(Integer movieId) {
        Optional<Movie> result = movieRepository.findById(movieId);
        return result.get();
    }

    @Override
    public void addMovie(String name, String genre, Integer durationMins, String releaseDate, String description,
            MultipartFile file) {
        Movie movie = new Movie();
        movie.setName(name);
        movie.setGenre(genre);
        movie.setReleaseDate(releaseDate);
        movie.setDurationMins(durationMins);
        movie.setDescription(description);

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        if (fileName.contains("..")) {
            System.out.println("not a a valid file");
        }
        try {
            movie.setImageData(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        movieRepository.save(movie);
    }

}
