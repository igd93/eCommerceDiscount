package com.example.grocery.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.grocery.entities.Beer;
import com.example.grocery.repositories.BeerRepository;

@Service
public class BeerServiceImpl implements BeerService{

    private final BeerRepository beerRepository;

    public BeerServiceImpl(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public List<Beer> findAll() {
        return beerRepository.findAll();
    }

    @Override
    public Beer findById(Long id) {
        return beerRepository.findById(id).orElse(null);
    }

    @Override
    public Beer save(Beer beer) {
        return beerRepository.save(beer);
    }

    @Override
    public void deleteById(Long id) {
        beerRepository.deleteById(id);
    }
    
}
