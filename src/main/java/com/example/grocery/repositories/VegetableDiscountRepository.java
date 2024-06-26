package com.example.grocery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.grocery.entities.VegetableDiscount;

@Repository
public interface VegetableDiscountRepository extends JpaRepository<VegetableDiscount, Long> {

    @Query("SELECT vd FROM VegetableDiscount vd WHERE vd.minGrams <= : grams AND vd.maxGrams >= :grams")
    VegetableDiscount findDiscountByGrams(@Param("grams") int grams);    
}
