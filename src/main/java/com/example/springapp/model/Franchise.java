package com.example.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Franchise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long franchiseId;

    private String name;             // Franchise name
    private String category;         // Type (Food, Retail, etc.)
    private String location;         // Franchise location
    private String investmentRange;  // Required investment
    private String ownerName;        // Franchise owner's name
}

