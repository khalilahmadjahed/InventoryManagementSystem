package com.jahed.inventorymanagementsystem.service;

import com.jahed.inventorymanagementsystem.dto.CategoryDTO;
import com.jahed.inventorymanagementsystem.dto.Response;

public interface CategoryService {
    Response createCategory(CategoryDTO categoryDTO);
    Response getAllCategories();
    Response getCategoryById(Long id);
    Response updateCategory(Long id, CategoryDTO categoryDTO);
    Response deleteCategory(Long id);
}
