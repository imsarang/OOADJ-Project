package com.example.bookmovie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookmovie.models.SeatMatrix1;
import com.example.bookmovie.repositories.SeatMatrix1Repository;

@Service
public class SeatMatrix1ServiceImpl implements SeatMatrix1Service{

    private SeatMatrix1Repository seatMatrix1Repository;

    public SeatMatrix1ServiceImpl(SeatMatrix1Repository seatMatrix1Repository){
        this.seatMatrix1Repository = seatMatrix1Repository;
    }

    @Override
    public List<SeatMatrix1> getSeatMatrix1s() {
        return seatMatrix1Repository.findAll();
    }
    
}
