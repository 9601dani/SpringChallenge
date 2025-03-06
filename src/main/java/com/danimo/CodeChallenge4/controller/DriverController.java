package com.danimo.CodeChallenge4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danimo.CodeChallenge4.models.Driver;
import com.danimo.CodeChallenge4.service.DriverService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/driver")
@AllArgsConstructor

public class DriverController {

    private final DriverService driverService;
    
    @GetMapping("")
    public ResponseEntity<String> helloWord() {
        return ResponseEntity.ok().body("Hola desde controlador driver");
    }

    @PostMapping("/save")
    @Transactional
    public ResponseEntity<Driver> saveDriver(@RequestBody Driver driver) {
        
        Driver response = this.driverService.save(driver);
        return ResponseEntity.ok(driver);
    }
    
    
}
