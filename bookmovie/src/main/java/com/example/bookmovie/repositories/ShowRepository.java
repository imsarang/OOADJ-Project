package com.example.bookmovie.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bookmovie.models.Show;

public interface ShowRepository extends JpaRepository<Show, Integer>{
    
    // @Query("SELECT * FROM Shows S WHERE S.movieId = ?1")
    // Optional<Show> findByMovieId(Integer movieId);

    // @Query("SELECT * FROM Shows S WHERE S.theatreId = ?1")
    // Optional<Show> findByTheatreId(Integer theatreId);
}
