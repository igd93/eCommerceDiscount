package com.example.grocery.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.grocery.entities.Bread;
import com.example.grocery.repositories.BreadRepository;

@Service
public class BreadServiceImpl implements BreadService{

    private final BreadRepository breadRepository;

    public BreadServiceImpl(BreadRepository breadRepository) {
        this.breadRepository = breadRepository;
    }

    @Override
    public List<Bread> findAll() {
        return breadRepository.findAll();                        
    }

    @Override
    public Bread findById(Long id) {
        return breadRepository.findById(id).orElse(null);
    }

    @Override
    public Bread save(Bread bread) {
        return breadRepository.save(bread);
    }

    @Override
    public void deleteById(Long id) {
        breadRepository.deleteById(id);
    }
    
}