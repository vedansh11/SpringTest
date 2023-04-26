package com.example.furniture.controller;

import com.example.furniture.dto.CartDTO;
import com.example.furniture.dto.DataDTO;
import com.example.furniture.model.Cart;
import com.example.furniture.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    UserService userService;

    @GetMapping("usermodel")
    public List<DataDTO> user(){
        return userService.Data();
    }



    @GetMapping("/{cartId}")
    public List<CartDTO> getCartWithProducts(@PathVariable Integer cartId) {
        return userService.getCartData(cartId);
    }


}
