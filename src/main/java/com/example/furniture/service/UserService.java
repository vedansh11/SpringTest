package com.example.furniture.service;

import com.example.furniture.dto.CartDTO;
import com.example.furniture.dto.DataDTO;

import com.example.furniture.model.User;
import net.sf.jasperreports.engine.JRException;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;

import java.io.FileNotFoundException;
import java.util.List;

public interface UserService {


    ResponseEntity<InputStreamResource> exportReport(String reportFormat) throws FileNotFoundException, JRException;

    public List<User> getallusers();
    public void createBarCode128(String fileName);
    public List<Object[]> custom();
    public List<DataDTO> Data();
 //  public List<CartData> CartData();

    public List<CartDTO> getCartData(Integer CartId);
}
