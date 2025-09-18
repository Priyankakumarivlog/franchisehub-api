package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.model.booking;

@Repository
public interface BookingRepo extends JpaRepository<booking, Long> {

}

