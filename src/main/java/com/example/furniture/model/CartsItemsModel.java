package com.example.furniture.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="cart_items")
public class CartsItemsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_item_id")
    private int cart_item_id;

    @ManyToOne
    @JoinColumn(name="cart_id")
    private CartsModel cart_id;

    @ManyToOne
    @JoinColumn(name="product_id")
    private ProductsModel product_id;

    @Column(name="quantity")
    private int quantity;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime created_at;
}
