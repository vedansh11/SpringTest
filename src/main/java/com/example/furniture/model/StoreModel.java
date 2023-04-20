package com.example.furniture.model;


import jakarta.persistence.*;

@Entity
@Table(name="store")
public class StoreModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="storeid")
    private int storeid;

    @Column(name="storename")
    private String storename;
}
