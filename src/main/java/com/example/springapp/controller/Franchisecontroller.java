package com.example.springapp.controller;

import com.example.springapp.model.Franchise;
import com.example.springapp.services.Franchiseservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/franchise")
public class Franchisecontroller {

    private final Franchiseservice service;

    public Franchisecontroller(Franchiseservice service) {
        this.service = service;
    }

    @GetMapping
    public List<Franchise> getAllFranchises() {
        return service.getAllFranchises();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Franchise> getFranchiseById(@PathVariable Long id) {
        return service.getFranchiseById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Franchise createFranchise(@RequestBody Franchise franchise) {
        return service.createFranchise(franchise);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Franchise> updateFranchise(@PathVariable Long id, @RequestBody Franchise franchise) {
        franchise.setFranchiseId(id);
        return ResponseEntity.ok(service.updateFranchise(franchise));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFranchise(@PathVariable Long id) {
        service.deleteFranchise(id);
        return ResponseEntity.noContent().build();
    }
}


