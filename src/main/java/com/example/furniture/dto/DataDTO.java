package com.example.furniture.dto;

import org.springframework.lang.Nullable;


public class DataDTO {
     Integer cart_id;
     Integer product_id;
     Integer quantity;
    String name;
    Integer price;
    Integer parent_model;
    Integer child_model;




    public DataDTO(Integer cart_id, Integer product_id, Integer quantity, String name, Integer parent_model, Integer child_model, @Nullable Integer price) {
        this.cart_id = cart_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.name = name;
        this.parent_model = parent_model;
        this.child_model = child_model;
        this.price = price;
    }

    public Integer getCart_id() {
        return cart_id;
    }

    public void setCart_id(Integer cart_id) {
        this.cart_id = cart_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParent_model() {
        return parent_model;
    }

    public void setParent_model(Integer parent_model) {
        this.parent_model = parent_model;
    }

    public Integer getChild_model() {
        return child_model;
    }

    public void setChild_model(Integer child_model) {
        this.child_model = child_model;
    }

    @Nullable
    public Integer getPrice() {
        return price;
    }

    public void setPrice(@Nullable Integer price) {
        this.price = price;
    }
}
