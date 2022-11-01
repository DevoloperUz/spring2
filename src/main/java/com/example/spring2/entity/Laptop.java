package com.example.spring2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Author: Intelligent
 * Date: 01.11.2022
 * Time: 11:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Laptops")

public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "brand_name", nullable = false)
    private String brandName;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "ram", nullable = false)
    private String ram;

    @Column(name = "storage", nullable = false)
    private Integer storage;

    @Column(name = "macAdress", nullable = false, unique = true)
    private String macAdress;
}
