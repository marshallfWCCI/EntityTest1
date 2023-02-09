package com.example.springboot.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


// https://www.baeldung.com/hibernate-many-to-many

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue()
    private long employeeID;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Employee_Project",
            joinColumns = {@JoinColumn(name = "employee_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_id")}
    )

    Set<Project> projects = new HashSet<>();
}
