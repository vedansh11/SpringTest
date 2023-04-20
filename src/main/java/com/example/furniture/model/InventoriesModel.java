package com.example.furniture.model;


import jakarta.persistence.*;

@Entity
@Table(name="inventories")
public class InventoriesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="inventory_id")
    private int inventory_id;

    @ManyToOne
    @JoinColumn(name="product_id")
    private ProductsModel product_id;

    @ManyToOne
    @JoinColumn(name="store_id")
    private StoreModel store_id;

    @Column(name="quantity")
    private int quantity;
}
