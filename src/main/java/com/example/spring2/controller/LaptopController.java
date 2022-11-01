package com.example.spring2.controller;
import com.example.spring2.entity.Laptop;
import com.example.spring2.service.LaptopServise;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Intelligent
 * Date: 01.11.2022
 * Time: 11:30
 */
@RestController
@RequestMapping("/api/laptops")
public class LaptopController {
    private final LaptopServise servise;

    public LaptopController(LaptopServise servise) {
        this.servise = servise;
    }

    @PostMapping("/save")
    public Laptop save(@RequestBody Laptop laptop) {
        return servise.save(laptop);
    }

    @GetMapping("/findAll")
    public List<Laptop> findAll() {
        return servise.findAll();
    }

    @GetMapping("/{id}/findOne")
    public Laptop findOne(@PathVariable Long id) {
        return servise.findOne(id);
    }

    @PutMapping("/{id}/edit")
    public String edit(@PathVariable Long id) {
        return servise.edit(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll() {
        return servise.deleteAll();
    }

    @DeleteMapping("/{id}/deleteById")
    public String deleteById(@PathVariable Long id) {
       return servise.deleteById(id);
    }

}
