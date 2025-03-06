package com.danimo.CodeChallenge4.service;

import org.springframework.stereotype.Service;
import java.util.Optional;
import com.danimo.CodeChallenge4.models.Driver;
import com.danimo.CodeChallenge4.repository.DriverRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DriverService {

    private final DriverRepository driverRepository;

    public Driver save(Driver driver){
        Driver driverToSave = new Driver();

        Optional<Driver> dOptional = this.driverRepository.findById(driver.getId());

        if(!dOptional.isEmpty()){
             
        }

        return new Driver();



    }
    
}
