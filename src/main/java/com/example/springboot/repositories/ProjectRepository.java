package com.example.springboot.repositories;

import com.example.springboot.entities.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
