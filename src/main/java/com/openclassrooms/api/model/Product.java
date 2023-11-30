package com.openclassrooms.api.model;
import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "products")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="brand")
    private String brand;




}
