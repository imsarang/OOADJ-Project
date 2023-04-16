package com.example.bookmovie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.bookmovie.models.Booking;
import com.example.bookmovie.repositories.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService{

    private BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking addBooking(Booking Booking) {
        return bookingRepository.save(Booking);
    }

    @Override
    public Booking getBookingById(Integer bookingId) {
        Optional<Booking> result = bookingRepository.findById(bookingId);
        return result.get();
    }
    
}
