package com.example.furniture.service;

import com.example.furniture.dto.Data;

import com.example.furniture.model.UserModel;
import net.sf.jasperreports.engine.JRException;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;

import java.io.FileNotFoundException;
import java.util.List;

public interface UserService {


    ResponseEntity<InputStreamResource> exportReport(String reportFormat) throws FileNotFoundException, JRException;

    public List<UserModel> getallusers();
    public void createBarCode128(String fileName);
    public List<Object[]>custom();
    public List<Data>usermodel();

}
