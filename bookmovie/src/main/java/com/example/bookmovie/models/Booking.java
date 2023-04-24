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
@Table(name="Booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;
    @Column(name="showId")
    private Integer showId;
    @Column(name="date")
    private Date date;
    @Column(name="colNo")
    private String colNo;
    @Column(name="seatNo")
    private Integer seatNo;
    @Column(name="price")
    private Double price;
    
    public Booking() {
    }

    public Booking(Integer bookingId, Integer showId, Date date, String colNo, Integer seatNo, Double price) {
        this.bookingId = bookingId;
        this.showId = showId;
        this.date = date;
        this.colNo = colNo;
        this.seatNo = seatNo;
        this.price = price;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public Integer getShowId() {
        return showId;
    }

    public Date getDate() {
        return date;
    }

    public String getColNo() {
        return colNo;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setColNo(String colNo) {
        this.colNo = colNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
}
