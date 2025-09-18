package com.example.springapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springapp.model.booking;
import com.example.springapp.repository.BookingRepo;

@Service
public class Bookingservice {
    private final BookingRepo repo;

    public Bookingservice(BookingRepo repo) {
        this.repo = repo;
    }

    public List<booking> getAllBookings() {
        return repo.findAll();
    }

    public Optional<booking> getBookingById(Long id) {
        return repo.findById(id);
    }

    public booking createBooking(booking booking) {
        return repo.save(booking);
    }

    public booking updateBooking(booking booking) {
        return repo.save(booking);
    }

    public void deleteBooking(Long id) {
        repo.deleteById(id);
    }
}

