package com.example.springapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.springapp.model.Feedback;
import com.example.springapp.repository.FeedbackRepo;

@Service
public class Feedbackservice {
    private final FeedbackRepo repo;

    public Feedbackservice(FeedbackRepo repo) {
        this.repo = repo;
    }

    public List<Feedback> getAllFeedback() {
        return repo.findAll();
    }

    public Optional<Feedback> getFeedbackById(Long id) {
        return repo.findById(id);
    }

    public Feedback createFeedback(Feedback feedback) {
        return repo.save(feedback);
    }

    public Feedback updateFeedback(Feedback feedback) {
        return repo.save(feedback);
    }

    public void deleteFeedback(Long id) {
        repo.deleteById(id);
    }
}

