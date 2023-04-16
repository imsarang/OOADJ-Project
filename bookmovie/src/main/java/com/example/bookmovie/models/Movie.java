package com.example.bookmovie.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Movie")
public class Movie {
    @Id
    @Column(name="movieId")
    private Integer movieId;
    @Column(name="name")
    private String name;
    @Column(name="genre")
    private String genre;
    @Column(name="releaseDate")
    private Date releaseDate;
    @Column(name="description")
    private String description;
    
    public Movie() {
    }

    public Movie(Integer movieId, String name, String genre, Date releaseDate, String description) {
        this.movieId = movieId;
        this.name = name;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.description = description;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
