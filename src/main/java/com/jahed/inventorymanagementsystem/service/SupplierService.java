package com.jahed.inventorymanagementsystem.service;

import com.jahed.inventorymanagementsystem.dto.Response;
import com.jahed.inventorymanagementsystem.dto.SupplierDTO;

public interface SupplierService {
    Response addSupplier(SupplierDTO supplierDTO);
    Response updateSupplier(Long id, SupplierDTO supplierDTO);
    Response getAllSuppliers();
    Response getSupplierById(Long id);
    Response deleteSupplier(Long id);
}
