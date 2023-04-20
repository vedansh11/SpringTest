package com.example.furniture.repository;

import com.example.furniture.model.CartsItemsModel;
import com.example.furniture.model.StoreModel;
import com.example.furniture.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer> {


}
