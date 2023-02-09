package com.example.springboot.entities;

import jakarta.persistence.*;

@Entity
@Table(name="items")
public class Item {
    @Id
    @Column(name = "item_id")
    @GeneratedValue()
    private long itemID;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Cart cart;
}
