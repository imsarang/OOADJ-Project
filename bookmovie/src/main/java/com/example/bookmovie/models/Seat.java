package com.example.bookmovie.models;

public class Seat {
    private int seatId;
    private int price;
    private String seatType;
    private boolean isAvailable;

    public Seat(int seatId, int price, String seatType, boolean isAvailable) {
        this.seatId = seatId;
        this.price = price;
        this.seatType = seatType;
        this.isAvailable = isAvailable;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Seat [seatId=" + seatId + ", price=" + price + ", seatType=" + seatType + ", isAvailable=" + isAvailable
                + "]";
    }

}
