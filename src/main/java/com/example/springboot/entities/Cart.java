package com.example.springboot.entities;

import jakarta.persistence.*;


// Based on https://www.baeldung.com/hibernate-one-to-many
@Entity
@Table(name = "shopping_cart")
public class Cart {
    @Id
    @Column(name = "cart_id")
    @GeneratedValue()
    private long cartID;
}
