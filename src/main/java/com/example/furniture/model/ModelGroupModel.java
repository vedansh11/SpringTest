package com.example.furniture.model;

import jakarta.persistence.*;

@Entity
@Table(name="model_group")
public class ModelGroupModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="model_group_id")
    private int model_group_id;

    @ManyToOne
    @JoinColumn(name="parent_model")
    private ProductsModel parent_model;

    @ManyToOne
    @JoinColumn(name="child_model")
    private ProductsModel child_model;

    @Column(name="quantity")
    private int quantity;

    public int getModel_group_id() {
        return model_group_id;
    }

    public void setModel_group_id(int model_group_id) {
        this.model_group_id = model_group_id;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductsModel getParent_model() {
        return parent_model;
    }

    public void setParent_model(ProductsModel parent_model) {
        this.parent_model = parent_model;
    }

    public ProductsModel getChild_model() {
        return child_model;
    }

    public void setChild_model(ProductsModel child_model) {
        this.child_model = child_model;
    }

    public ModelGroupModel(int model_group_id, ProductsModel parent_model, ProductsModel child_model, int quantity) {
        this.model_group_id = model_group_id;
        this.parent_model = parent_model;
        this.child_model = child_model;
        this.quantity = quantity;
    }

    public ModelGroupModel() {
    }
}
