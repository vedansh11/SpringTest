package com.example.furniture.repository;

import com.example.furniture.dto.CartDTO;
import com.example.furniture.dto.DataDTO;
import com.example.furniture.model.Cart;

import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.SqlResultSetMapping;
import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;


@Repository
public interface CartRepository  extends JpaRepository<Cart,Integer>{


    public final static String custom = "select carts.cart_id, products" +
            " from carts " +
            " inner join cart_items on cart_items.cart_id=carts.cart_id " +
            " inner join products on cart_items.cart_id=products.product_id " +
            " left join model_group on cart_items.product_id=model_group.parent_model " +
            "where carts.cart_id=2";

    @Query(value = custom,nativeQuery = true)
    public  List<Object[]> customQuery() ;

       @Query(nativeQuery = true)
     public  List<DataDTO> Data() ;


    @Query(nativeQuery = true, name = "Cart.getCartDetails")
    List<CartDTO> getCartDetails(@Param("cartId") Integer cartId);


}
