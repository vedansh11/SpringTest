package com.example.furniture.model;


import jakarta.persistence.*;

@Entity
@Table(name="inventories")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="inventory_id")
    private Integer inventoryId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name="store_id")
    private Store storeId;

    @Column(name="quantity")
    private Integer quantity;

    public Inventory(Integer inventoryId, Product productId, Store storeId, Integer quantity) {
        this.inventoryId = inventoryId;
        this.product = productId;
        this.storeId = storeId;
        this.quantity = quantity;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product productId) {
        this.product = productId;
    }

    public Store getStoreId() {
        return storeId;
    }

    public void setStoreId(Store storeId) {
        this.storeId = storeId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Inventory() {
    }
}
