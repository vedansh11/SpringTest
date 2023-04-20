package com.example.furniture.model;


import jakarta.persistence.*;

@Entity
@Table(name="products")
public class ProductsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private int product_id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private int price;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductsModel(int product_id, String name, String description, int price) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public ProductsModel() {
    }
}
