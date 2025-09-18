package com.example.springapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.springapp.model.Admin;
import com.example.springapp.repository.AdminRepo;

@Service
public class Adminservice {
    private final AdminRepo repo;

    public Adminservice(AdminRepo repo) {
        this.repo = repo;
    }

    public List<Admin> getAllAdmins() {
        return repo.findAll();
    }

    public Optional<Admin> getAdminById(Long id) {
        return repo.findById(id);
    }

    public Admin createAdmin(Admin admin) {
        return repo.save(admin);
    }

    public Admin updateAdmin(Admin admin) {
        return repo.save(admin);
    }

    public void deleteAdmin(Long id) {
        repo.deleteById(id);
    }
}

