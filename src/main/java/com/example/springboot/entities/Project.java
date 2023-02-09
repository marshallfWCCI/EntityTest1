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

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees = new HashSet<>();

    @Column(name = "project_title")
    private String title;

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}