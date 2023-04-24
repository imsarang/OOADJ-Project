package com.example.bookmovie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.bookmovie.models.Show;
import com.example.bookmovie.repositories.ShowRepository;

@Service
public class ShowServiceImpl implements ShowService {

    private ShowRepository showRepository;

    public ShowServiceImpl(ShowRepository showRepository){
        this.showRepository = showRepository;
    }

    @Override
    public List<Show> getShows() {
        return showRepository.findAll();
    }

    @Override
    public Show addShow(Show show) {
        return showRepository.save(show);
    }

    @Override
    public Show getShowById(Integer showId) {
        Optional<Show> result = showRepository.findById(showId);
        return result.get();
    }

    @Override
    public List<Show> getShowByTheatreId(Integer theatreId) {
        List<Show> result = showRepository.findByTheatreId(theatreId);
        return result;
    }

    @Override
    public List<Show> getShowByMovieId(Integer movieId) {
        List<Show> result = showRepository.findByMovieId(movieId);
        return result;
    }

    @Override
    public boolean deleteShow(Integer showId) {
        showRepository.deleteById(showId);

        if (showRepository.findById(showId) != null) {
            return true;
        }

        return false;
    }
    
}
