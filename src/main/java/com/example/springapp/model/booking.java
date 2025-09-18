package com.example.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    private Long userId;        // User making the booking
    private Long franchiseId;   // Franchise booked
    private String bookingDate; // Date of booking
    private String status;      // PENDING, CONFIRMED, CANCELLED
}

