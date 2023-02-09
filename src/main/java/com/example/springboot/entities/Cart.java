package com.example.springboot.entities;

import jakarta.persistence.*;

import java.util.Set;


// Based on https://www.baeldung.com/hibernate-one-to-many
@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @Column(name = "cart_id")
    @GeneratedValue()
    private long cartID;

    @OneToMany(mappedBy="cart")
    private Set<Item> items;
}
