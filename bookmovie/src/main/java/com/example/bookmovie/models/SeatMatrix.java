package com.example.bookmovie.models;

public class SeatMatrix {
    private int seatMatId;
    private Seat s[][];

    public SeatMatrix() {
        s = new Seat[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                s[i][j] = new Seat(10 * i + j, 20, "S", true);
            }
        }

    }

    public boolean checkAvailable(Seat s) {
        if (s.getIsAvailable())
            return true;
        else
            return false;
    }

    public void confirmSeats(int index) {

    }

}
