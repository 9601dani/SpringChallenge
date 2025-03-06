package com.danimo.CodeChallenge4.repository;

import com.danimo.CodeChallenge4.models.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Integer> {
    
    
}
