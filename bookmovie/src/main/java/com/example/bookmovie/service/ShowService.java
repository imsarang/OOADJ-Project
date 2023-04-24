package com.example.bookmovie.service;

import java.util.List;

import com.example.bookmovie.models.Show;

public interface ShowService {
    public List<Show> getShows();
    public Show addShow(Show show);
    public Show getShowById(Integer showId);
    public List<Show> getShowByTheatreId(Integer theatreId);
    public List<Show> getShowByMovieId(Integer movieId);
    public boolean deleteShow(Integer showId);
}
