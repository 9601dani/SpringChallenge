package com.danimo.CodeChallenge4.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "driver")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Driver {

    @Id
    private Integer id;

    private String name;

    private Integer age;

    
}
