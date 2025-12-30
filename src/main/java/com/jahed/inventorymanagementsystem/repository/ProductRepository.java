package com.jahed.inventorymanagementsystem.repository;

import com.jahed.inventorymanagementsystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
