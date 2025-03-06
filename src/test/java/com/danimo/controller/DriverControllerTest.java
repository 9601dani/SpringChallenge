package com.danimo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.danimo.CodeChallenge4.models.Driver;
import com.danimo.CodeChallenge4.repository.DriverRepository;
import com.danimo.CodeChallenge4.service.DriverService;

@WebMvcTest(Driver.class)

public class DriverControllerTest {

    private DriverService driverService;
    private DriverRepository driverRepository;
    
    @Test
    void testSaveDriver() throws Exception{
        Driver driverRequest = new Driver(6,"Manolo", 25);
        when(this.driverService.save(driverRequest)).thenReturn(driverRequest);
    }

    @Test
    void testNotDuplicated() throws Exception {
        Driver existingDriver = new Driver(1, "Manolo", 25);
        Driver duplicateDriver = new Driver(2, "Manolo", 30);

        when(driverService.save(existingDriver)).thenReturn(existingDriver);
        // when(driverRepository.findByName("Manolo")).thenReturn(Optional.of(existingDriver));

        Exception exception = assertThrows(RuntimeException.class, () -> driverService.save(duplicateDriver));
        assertEquals("El usuario nombre ya existe", exception.getMessage());
    }
}
