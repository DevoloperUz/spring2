package com.example.spring2.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
/**
 * Author: Intelligent
 * Date: 29.10.2022
 * Time: 19:56
 */
@Data
@Entity
@Table(name = "Phones")
@NoArgsConstructor
@AllArgsConstructor

public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "macAdress", nullable = false, unique = true)
    private String macAdress;

    @Column(name = "info", nullable = false)
    private String info;
}
