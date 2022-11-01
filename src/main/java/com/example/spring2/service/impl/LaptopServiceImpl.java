package com.example.spring2.service.impl;

import com.example.spring2.entity.Laptop;
import com.example.spring2.repository.LaptopRepository;
import com.example.spring2.service.LaptopServise;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Author: Intelligent
 * Date: 01.11.2022
 * Time: 11:35
 */
@Service
public class LaptopServiceImpl implements LaptopServise {
    private final LaptopRepository repository;

    public LaptopServiceImpl(LaptopRepository repository) {
        this.repository = repository;
    }

    @Override
    public Laptop save(Laptop laptop) {
        return repository.save(laptop);
    }

    @Override
    public String edit(Long id) {
        return "Successfully edited";
    }

    @Override
    public List<Laptop> findAll() {
        return repository.findAll();
    }

    @Override
    public Laptop findOne(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public String deleteAll() {
        repository.deleteAll();
        return "All laptops successfully deleted!";
    }

    @Override
    public String deleteById(Long id) {
        repository.deleteById(id);
        return "Laptop succesfully deleted!";
    }

    @Override
    public Laptop findById(Long laptopId) {
        Optional<Laptop> optionalLaptop = repository.findById(laptopId);
        if (optionalLaptop.isPresent()) {
            Laptop laptop = optionalLaptop.get();
            return laptop;
        }
        return new Laptop();
    }

    @Override
    public Laptop editById(Long laptopId, Laptop laptop) {
        Optional<Laptop> optionalLaptop = repository.findById(laptopId);
        if(optionalLaptop.isPresent()) {
            Laptop entity = optionalLaptop.get();

            if(laptop.getName() != null &&
                    !entity.getName().equals(laptop.getName())) {
                entity.setName(laptop.getName());
            }

            if(laptop.getBrandName() != null &&
                    !entity.getBrandName().equals(laptop.getBrandName())){
                entity.setBrandName(laptop.getBrandName());
            }

            return repository.save(entity);
        }
        return new Laptop();
    }
}
