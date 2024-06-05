package com.example.grocery.entities;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class VegetableDiscount {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer minGrams;

    @Column(nullable = false)
    private Integer maxGrams;

    @Column(nullable = false)
    private BigDecimal discountPercentage;
    
}
