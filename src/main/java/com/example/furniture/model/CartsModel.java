package com.example.furniture.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="carts")
public class CartsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_id")
    private int cart_id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserModel user_id;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime created_at;

    public int getCart_id() {
        return cart_id;
    }

    public CartsModel(int cart_id, UserModel user_id, LocalDateTime created_at) {
        this.cart_id = cart_id;
        this.user_id = user_id;
        this.created_at = created_at;
    }

    public CartsModel() {
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public UserModel getUser_id() {
        return user_id;
    }

    public void setUser_id(UserModel user_id) {
        this.user_id = user_id;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

}
