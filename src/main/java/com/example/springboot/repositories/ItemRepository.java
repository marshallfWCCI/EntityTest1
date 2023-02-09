package com.example.springboot.repositories;

import com.example.springboot.entities.Item;
import com.example.springboot.entities.Something;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
