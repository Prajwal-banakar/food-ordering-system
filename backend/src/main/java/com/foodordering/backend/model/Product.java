package com.foodordering.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String id;
    private String title;
    private double price;
    private String image01;
    private String image02;
    private String image03;
    private String category;
    
    @Column(length = 1000)
    private String desc;
}
