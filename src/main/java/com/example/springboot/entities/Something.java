package com.example.springboot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "something")
public class Something {
    @Id
    @Column(name = "some_int", nullable = false)
    private Integer someInt;
    
    @Column(name = "some_double", nullable = false)
    private Double someDouble;

    @Column(name = "some_float", nullable = false)
    private Float someFloat;

    @Column(name = "some_date")
    private LocalDate birthDate;

    @Column(name = "some_string", nullable = false, length = 14)
    private String firstName;
}
