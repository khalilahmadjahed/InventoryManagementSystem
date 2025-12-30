package com.jahed.inventorymanagementsystem.repository;

import com.jahed.inventorymanagementsystem.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
