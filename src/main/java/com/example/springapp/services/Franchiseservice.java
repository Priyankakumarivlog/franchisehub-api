package com.example.springapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.springapp.model.Franchise;
import com.example.springapp.repository.FranchiseRepo;

@Service
public class Franchiseservice {
    private final FranchiseRepo repo;

    public Franchiseservice(FranchiseRepo repo) {
        this.repo = repo;
    }

    public List<Franchise> getAllFranchises() {
        return repo.findAll();
    }

    public Optional<Franchise> getFranchiseById(Long id) {
        return repo.findById(id);
    }

    public Franchise createFranchise(Franchise franchise) {
        return repo.save(franchise);
    }

    public Franchise updateFranchise(Franchise franchise) {
        return repo.save(franchise);
    }

    public void deleteFranchise(Long id) {
        repo.deleteById(id);
    }
}

