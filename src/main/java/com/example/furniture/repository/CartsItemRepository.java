package com.example.furniture.repository;

import com.example.furniture.dto.CartDTO;
import com.example.furniture.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CartsItemRepository extends JpaRepository<CartItem,Integer> {





}
