package com.jahed.inventorymanagementsystem.service;

import com.jahed.inventorymanagementsystem.dto.ProductDTO;
import com.jahed.inventorymanagementsystem.dto.Response;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);
    Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);
    Response getAllProducts();
    Response getProductById(Long id);
    Response deleteProduct(Long id);
}
