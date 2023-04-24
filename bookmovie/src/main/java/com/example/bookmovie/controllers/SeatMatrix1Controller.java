package com.example.bookmovie.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmovie.models.SeatMatrix1;
import com.example.bookmovie.service.SeatMatrix1Service;

@RestController
public class SeatMatrix1Controller {
    private SeatMatrix1Service seatMatrix1Service;

    public SeatMatrix1Controller(SeatMatrix1Service seatMatrix1Service){
        this.seatMatrix1Service = seatMatrix1Service;
    }

    @GetMapping("/seatMatrix1s")
    public List<SeatMatrix1> getAll(){
        return seatMatrix1Service.getSeatMatrix1s();
    }
}
