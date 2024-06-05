package com.example.grocery.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.grocery.entities.QuantityDiscount;

@Repository
public interface QuantityDiscountRepository extends JpaRepository<QuantityDiscount, Long>{
    
    @Query("SELECT qd FROM QuantityDiscount qd WHERE qd.beer.id = :beerId AND qd.quantity = :quantity")
    Optional<QuantityDiscount> findByBeerIdAndQUantity(Long beerId, int quantity);
    
}