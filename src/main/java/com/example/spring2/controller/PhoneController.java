/*package com.example.spring2.controller;
import com.example.spring2.entity.Phone;
import com.example.spring2.service.PhoneService;
import org.springframework.web.bind.annotation.*;*/

import java.util.List;

/**
 * Author: Intelligent
 * Date: 29.10.2022
 * Time: 20:43
 */

/*@RestController
@RequestMapping("/api/phones")
public class PhoneController {

    // Constructor based DI
    private final PhoneService service;
    public PhoneController(PhoneService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public Phone save(@RequestBody Phone phone) {
        return service.save(phone);
    }

    @GetMapping("/findAll")
    public List<Phone> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}/id")
    public Phone getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}/deleteById")
    public String deleteById(@PathVariable Long id) {
        return service.deleteById(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll() {
        return service.deleteAll();
    }

    @PutMapping("/{id}/update")
    public Phone update(@PathVariable Long id, @RequestBody Phone phone) {
        return service.update(id, phone);
    }
}*/
