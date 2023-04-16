package com.example.bookmovie.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {


    @Id
    @Column(name="bookingId")
    private Integer bookingId;
    @Column(name="showId")
    private Integer showId;
    @Column(name="date")
    private Date date;
    @Column(name="row1")
    private String row1;
    @Column(name="seat")
    private Integer seat;
    @Column(name="price")
    private Double price;
    
    public Booking() {
    }

    public Booking(Integer bookingId, Integer showId, Date date, String row1, Integer seat, Double price) {
        this.bookingId = bookingId;
        this.showId = showId;
        this.date = date;
        this.row1 = row1;
        this.seat = seat;
        this.price = price;
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

    public String getRow1() {
        return row1;
    }

    public Integer getSeat() {
        return seat;
    }

    public Double getPrice() {
        return price;
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

    public void setRow1(String row1) {
        this.row1 = row1;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
}
