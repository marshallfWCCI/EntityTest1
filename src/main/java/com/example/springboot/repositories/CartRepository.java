package com.example.springboot.repositories;

import com.example.springboot.entities.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
}
