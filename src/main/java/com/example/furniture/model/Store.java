package com.example.furniture.model;


import jakarta.persistence.*;

@Entity
@Table(name="store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="storeid")
    private int storeId;

    @Column(name="storename")
    private String storeName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    @Column(name = "quantity_available")
    private Integer quantityAvailable;

    public Store() {
    }

    public Store(int storeId, String storeName, Inventory inventory, Integer quantityAvailable) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.inventory = inventory;
        this.quantityAvailable = quantityAvailable;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }
}
