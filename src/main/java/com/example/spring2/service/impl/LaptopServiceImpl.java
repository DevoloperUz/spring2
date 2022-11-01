package com.example.spring2.service.impl;

import com.example.spring2.entity.Laptop;
import com.example.spring2.repository.LaptopRepository;
import com.example.spring2.service.LaptopServise;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Intelligent
 * Date: 01.11.2022
 * Time: 11:35
 */
@Service
public class LaptopServiceImpl implements LaptopServise {
    private final LaptopRepository laptopRepository;

    public LaptopServiceImpl(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @Override
    public Laptop save(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @Override
    public String edit(Long id) {
        return "Successfully edited";
    }

    @Override
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    @Override
    public Laptop findOne(Long id) {
        return laptopRepository.getReferenceById(id);
    }

    @Override
    public String deleteAll() {
        laptopRepository.deleteAll();
        return "All laptops successfully deleted!";
    }

    @Override
    public String deleteById(Long id) {
        laptopRepository.deleteById(id);
        return "Laptop succesfully deleted!";
    }
}
