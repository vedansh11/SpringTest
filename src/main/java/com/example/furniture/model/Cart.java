package com.example.furniture.model;

import com.example.furniture.dto.CartDTO;
import com.example.furniture.dto.DataDTO;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@org.hibernate.annotations.NamedNativeQuery(
        name = "Cart.getCartDetails",
        query = "SELECT c.cart_id, p.product_id, p.name, ci.quantity, (p.price * ci.quantity) AS amount, mg.parent_model, mg.child_model " +
                "FROM carts c " +
                "JOIN cart_items ci ON ci.cart_id = c.cart_id " +
                "JOIN products p ON p.product_id = ci.product_id " +
                "LEFT JOIN model_group mg ON mg.parent_model = p.product_id " +
                "WHERE c.cart_id = :cartId",
        resultSetMapping = "CartDTOMapping"
)
@SqlResultSetMapping(
        name = "CartDTOMapping",
        classes = @ConstructorResult(
                targetClass = CartDTO.class,
                columns = {
                        @ColumnResult(name = "cart_id", type = Integer.class),
                        @ColumnResult(name = "product_id", type = Integer.class),
                        @ColumnResult(name = "name", type = String.class),
                        @ColumnResult(name = "quantity", type = Integer.class),
                        @ColumnResult(name = "amount", type = BigDecimal.class),
                        @ColumnResult(name = "parent_model", type = Integer.class),
                        @ColumnResult(name = "child_model", type = Integer.class)
                }
        )
)

@NamedNativeQuery(
        name = "Cart.Data",
        query = "select carts.cart_id ,cart_items.product_id ,cart_items.quantity , products.name ,products.price  ,model_group.child_model, model_group.parent_model" +
                " from carts " +
                " inner join cart_items on cart_items.cart_id=carts.cart_id " +
                " inner join products on cart_items.cart_id=products.product_id " +
                " left join model_group on cart_items.product_id=model_group.parent_model ",
        resultSetMapping = "DataMapping"
)
@SqlResultSetMapping(
        name = "DataMapping",
        classes = {
                @ConstructorResult(
                        columns = {
                                @ColumnResult(name = "cart_id"),
                                @ColumnResult(name = "product_id"),
                                @ColumnResult(name = "quantity"),
                                @ColumnResult(name = "name"),
                                @ColumnResult(name = "price"),
                                @ColumnResult(name = "parent_model"),
                                @ColumnResult(name = "child_model"),
                        },
                        targetClass = DataDTO.class
                )
        }
)


@Entity
@Table(name="carts")

public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_id")
    private Integer cartId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<CartItem> cartItems;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public Cart(Integer cartId, User user, LocalDateTime createdAt, List<CartItem> cartItems) {
        this.cartId = cartId;
        this.user = user;
        this.createdAt = createdAt;
        this.cartItems = cartItems;
    }

    public Cart() {
    }


}
