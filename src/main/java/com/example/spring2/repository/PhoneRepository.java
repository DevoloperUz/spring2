package com.example.spring2.repository;
import com.example.spring2.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Intelligent
 * Date: 29.10.2022
 * Time: 20:43
 */

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
