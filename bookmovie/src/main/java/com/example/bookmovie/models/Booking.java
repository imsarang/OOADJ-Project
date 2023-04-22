package com.example.bookmovie.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.mapping.List;

@Entity
@Table(name = "Booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "bookingId")
    private Integer bookingId;
    @Column(name = "showId")
    private Integer showId;
    @Column(name = "date")
    private Date date;

    private Seat seatsBooked[];

    public Booking() {
    }

    public Booking(Integer bookingId, Integer showId, Date date, Seat seats[]) {
        this.bookingId = bookingId;
        this.showId = showId;
        this.date = date;
        this.seatsBooked = seats;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public Integer getTheatreId() {
        return showId;
    }

    public Date getDate() {
        return date;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public void setTheatreId(Integer showId) {
        this.showId = showId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Seat[] getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(Seat[] seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

}
