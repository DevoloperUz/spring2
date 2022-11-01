package com.example.spring2.repository;
import com.example.spring2.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Intelligent
 * Date: 01.11.2022
 * Time: 11:32
 */
@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
