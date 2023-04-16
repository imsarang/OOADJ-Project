package com.example.bookmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmovie.models.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{
    
}
