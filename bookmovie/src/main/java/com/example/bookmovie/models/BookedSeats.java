package com.example.bookmovie.models;

public class BookedSeats {
    private int bookingId;
    private int seatId;
    private String Stype;
    private int price;

    @Override
    public String toString() {
        return "BookedSeats [bookingId=" + bookingId + ", seatId=" + seatId + ", Stype=" + Stype + ", price=" + price
                + "]";
    }

    public BookedSeats(int bookingId, int seatId, String stype, int price) {
        this.bookingId = bookingId;
        this.seatId = seatId;
        Stype = stype;
        this.price = price;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public String getStype() {
        return Stype;
    }

    public void setStype(String stype) {
        Stype = stype;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
