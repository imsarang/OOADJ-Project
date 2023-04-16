package com.example.bookmovie.service;

import java.util.List;

import com.example.bookmovie.models.Show;

public interface ShowService {
    public List<Show> getShows();
    public Show addShow(Show show);
    public Show getShowById(Integer showId);
    // public Show getShowByTheatreId(Integer theatreId);
    // public Show getShowByMovieId(Integer movieId);
}
