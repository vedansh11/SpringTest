package com.example.furniture.dto;

import com.example.furniture.model.Cart;

import java.math.BigDecimal;
import java.util.List;

public class CartDTO {


    private Integer cart_id;


    private Integer product_id;
    private String name;
    private Integer quantity;
    private BigDecimal amount;
   //private List<ModelGroupDTO> model_group;
    private Integer parent_model;
    private Integer child_model;

    public CartDTO(Cart cart) {
    }

    public CartDTO() {
    }

    public CartDTO(Integer cart_id, Integer product_id, String name, Integer quantity, BigDecimal amount, Integer parent_model, Integer child_model) {
        this.cart_id = cart_id;
        this.product_id = product_id;
        this.name = name;
        this.quantity = quantity;
        this.amount = amount;
        this.parent_model = parent_model;
        this.child_model = child_model;
    }

    public Integer getChild_model() {
        return child_model;
    }

    public void setChild_model(Integer child_model) {
        this.child_model = child_model;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }



    public Integer getParent_model() {
        return parent_model;
    }

    public void setParent_model(Integer parent_model) {
        this.parent_model = parent_model;
    }
}
