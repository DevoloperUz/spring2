package com.example.spring2.service;

import com.example.spring2.entity.Laptop;

import java.util.List;

/**
 * Author: Intelligent
 * Date: 01.11.2022
 * Time: 11:35
 */
public interface LaptopServise {
    Laptop save(Laptop laptop);

    String edit(Long id);

    List<Laptop> findAll();

    Laptop findOne(Long id);

    String deleteAll();

    String deleteById(Long id);
}
