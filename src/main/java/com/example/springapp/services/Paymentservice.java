package com.example.springapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springapp.model.payment;
import com.example.springapp.repository.PaymentRepo;

@Service
public class Paymentservice {
    private final PaymentRepo repo;

    public Paymentservice(PaymentRepo repo) {
        this.repo = repo;
    }

    public List<payment> getAllPayments() {
        return repo.findAll();
    }

    public Optional<payment> getPaymentById(Long id) {
        return repo.findById(id);
    }

    public payment createPayment(payment payment) {
        return repo.save(payment);
    }

    public payment updatePayment(payment payment) {
        return repo.save(payment);
    }

    public void deletePayment(Long id) {
        repo.deleteById(id);
    }
}


