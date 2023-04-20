package com.example.furniture.repository;

import com.example.furniture.dto.Data;
import com.example.furniture.model.CartsModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository  extends JpaRepository<CartsModel,Integer>{


    public final static String custom = "select carts.cart_id,cart_items.product_id,cart_items.quantity, products.name,products.price, model_group.parent_model,model_group.child_model" +
            " from carts " +
            " inner join cart_items on cart_items.cart_id=carts.cart_id " +
            " inner join products on cart_items.cart_id=products.product_id " +
            " left join model_group on cart_items.product_id=model_group.parent_model ";

    @Query(value = custom,nativeQuery = true)
    public  List<Object[]> customQuery() ;

    @Query(value = custom,nativeQuery = true)
    public  List<Data> usermodel() ;

}
