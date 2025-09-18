package com.example.springapp.controller;

import com.example.springapp.model.payment;
import com.example.springapp.services.Paymentservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
public class Paymentcontroller {

    private final Paymentservice service;

    public Paymentcontroller(Paymentservice service) {
        this.service = service;
    }

    @GetMapping
    public List<payment> getAllPayments() {
        return service.getAllPayments();
    }

    @GetMapping("/{id}")
    public ResponseEntity<payment> getPaymentById(@PathVariable Long id) {
        return service.getPaymentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public payment createPayment(@RequestBody payment payment) {
        return service.createPayment(payment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<payment> update(Long id, @RequestBody payment payment){
        payment.setPaymentId(id);
        return ResponseEntity.ok(service.updatePayment(payment));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id) {
        service.deletePayment(id);
        return ResponseEntity.noContent().build();
    }
}

