package com.example.furniture.dto;

import com.example.furniture.model.CartsModel;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public  interface Data {
    int getcart_id();
    int getproduct_id();
    String getname();
    int getquantity();
    @Nullable
    Integer getParent_model();
    @Nullable
    Integer getChild_model();



    //     product_id;
//    int name;
//    int quantity;
//    int Parent_model;
//    int Child_model;
}
