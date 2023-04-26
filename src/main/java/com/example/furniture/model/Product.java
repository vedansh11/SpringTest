package com.example.furniture.model;


import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;


@Entity
@Table(name="products")
public class Product {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Integer productId;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private Integer price;

    @Column(name="cost")
    private Integer cost;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "parent_model")
//    private Product parentModel;

//    @OneToMany(mappedBy = "modelGroupId")
//    private List<ModelGroup> modelGroups;

    public Product() {
    }

    public Product(Integer productId, String name, String description, Integer price, Integer cost) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.cost = cost;

    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }


}
