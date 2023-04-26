package com.example.furniture.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

public class ProductDTO {

    private Integer productId;

    private String name;

    private Integer quantity;

    private BigDecimal amount;


    private List<ModelGroupDTO> modelGroup;

    public ProductDTO() {
    }

    public ProductDTO(Integer productId, String name, Integer quantity, BigDecimal amount, List<ModelGroupDTO> modelGroup) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.amount = amount;
        this.modelGroup = modelGroup;
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

    public List<ModelGroupDTO> getModelGroup() {
        return modelGroup;
    }

    public void setModelGroup(List<ModelGroupDTO> modelGroup) {
        this.modelGroup = modelGroup;
    }
}
