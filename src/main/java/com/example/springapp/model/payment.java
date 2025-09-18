package com.example.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    private Long bookingId;      // Related booking
    private Double amount;       // Payment amount
    private String method;       // UPI, Card, Net Banking
    private String status;       // PENDING, SUCCESS, FAILED
    private String paymentDate;  // Date of payment
}

