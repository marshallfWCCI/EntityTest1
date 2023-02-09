package com.example.springboot.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

// https://www.baeldung.com/hibernate-many-to-many

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @Column(name = "project_id")
    @GeneratedValue()
    private long projectID;
    // ...

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees = new HashSet<>();

    // standard constructors/getters/setters
}