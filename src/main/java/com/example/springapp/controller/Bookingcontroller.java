package com.example.springapp.controller;
import com.example.springapp.model.booking;
import com.example.springapp.services.Bookingservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class Bookingcontroller {

    private final Bookingservice service;

    // Constructor injection
    public Bookingcontroller(Bookingservice service) {
        this.service = service;
    }

    // Get all bookings
    @GetMapping
    public List<booking> getAllBookings() {
        return service.getAllBookings();
    }

    // Get a booking by ID
    @GetMapping("/{id}")
    public ResponseEntity<booking> getBookingById(@PathVariable Long id) {
        return service.getBookingById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create a new booking
    @PostMapping
    public booking createBooking(@RequestBody booking booking) {
        return service.createBooking(booking);
    }

    // Update a booking
    @PutMapping("/{id}")
    public ResponseEntity<booking> updateBooking(@PathVariable Long id, @RequestBody booking booking) {
        booking.setBookingId(id); // Ensure your Booking entity has setBookingId method
        return ResponseEntity.ok(service.updateBooking(booking));
    }

    // Delete a booking
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable Long id) {
        service.deleteBooking(id);
        return ResponseEntity.noContent().build();
    }
}


