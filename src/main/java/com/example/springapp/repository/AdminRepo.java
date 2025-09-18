package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {

}
