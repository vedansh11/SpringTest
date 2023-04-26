package com.example.furniture.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="model_group")
public class ModelGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="model_group_id")
    private Integer modelGroupId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="parent_model")
    private Product parent_model;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="child_model")
    private Product child_model;

    @Column(name="quantity")
    private Integer quantity;

    public ModelGroup(Integer modelGroupId, Product parent_model, Product child_model, Integer quantity) {
        this.modelGroupId = modelGroupId;
        this.parent_model = parent_model;
        this.child_model = child_model;
        this.quantity = quantity;
    }

    public Integer getModelGroupId() {
        return modelGroupId;
    }

    public void setModelGroupId(Integer modelGroupId) {
        this.modelGroupId = modelGroupId;
    }

    public Product getParent_model() {
        return parent_model;
    }

    public void setParent_model(Product parent_model) {
        this.parent_model = parent_model;
    }

    public Product getChild_model() {
        return child_model;
    }

    public void setChild_model(Product child_model) {
        this.child_model = child_model;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ModelGroup() {
    }
}
