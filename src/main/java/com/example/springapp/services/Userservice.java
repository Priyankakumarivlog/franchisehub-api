package com.example.springapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springapp.model.User;
import com.example.springapp.repository.UserRepo;

@Service
public class Userservice {
    private final UserRepo repo;

    public Userservice(UserRepo repo) {
        this.repo=repo;
    }
    public List<User> getAllUsers() {
        return repo.findAll();
    }
    public Optional<User> getUserById(Long id) {
        return repo.findById(id);
    }
    public User createUser(User user) {
        return repo.save(user);
    }
    public User updateUser(User user){
        return repo.save(user);
    }
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }

}


