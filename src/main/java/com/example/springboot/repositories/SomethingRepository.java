package com.example.springboot.repositories;

import com.example.springboot.entities.Something;
import org.springframework.data.repository.CrudRepository;

public interface SomethingRepository extends CrudRepository<Something, Integer> {
}
