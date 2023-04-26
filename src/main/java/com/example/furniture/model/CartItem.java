package com.example.furniture.model;


import com.example.furniture.dto.CartDTO;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.time.LocalDateTime;



@Entity
@Table(name="cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_item_id")
    private Integer cartItemId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private Cart cart;

    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="product_id")
    private Product productId;

//    @ManyToOne(fetch = FetchType.EAGER)
//    private Collection<ProductsModel> products=new ArrayList<ProductsModel>();


    @Column(name="quantity")
    private Integer quantity;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

//    public ProductsModel getProductsModel() {
//        return productsModel;
//    }
//
//    public void setProductsModel(ProductsModel productsModel) {
//        this.productsModel = productsModel;
//    }


    public CartItem() {
    }

    public CartItem(Integer cartItemId, Cart cart, Product productId, Integer quantity, LocalDateTime createdAt) {
        this.cartItemId = cartItemId;
        this.cart = cart;
        this.productId = productId;
        this.quantity = quantity;
        this.createdAt = createdAt;
    }

    public Integer getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Integer cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
