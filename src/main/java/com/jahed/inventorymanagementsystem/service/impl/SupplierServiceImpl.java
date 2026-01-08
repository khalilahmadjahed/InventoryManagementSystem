package com.jahed.inventorymanagementsystem.service.impl;

import com.jahed.inventorymanagementsystem.dto.Response;
import com.jahed.inventorymanagementsystem.dto.SupplierDTO;
import com.jahed.inventorymanagementsystem.entity.Supplier;
import com.jahed.inventorymanagementsystem.exceptions.NotFoundException;
import com.jahed.inventorymanagementsystem.repository.SupplierRepository;
import com.jahed.inventorymanagementsystem.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;
    private final ModelMapper modelMapper;

    @Override
    public Response addSupplier(SupplierDTO supplierDTO) {

        Supplier supplierToSave = modelMapper.map(supplierDTO, Supplier.class);
        supplierRepository.save(supplierToSave);

        return Response.builder()
                .status(200)
                .message("Supplier added successfully")
                .build();
    }

    @Override
    public Response updateSupplier(Long id, SupplierDTO supplierDTO) {

        Supplier existingSupplier = supplierRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Supplier not found"));

        if (existingSupplier.getName() != null) existingSupplier.setName(supplierDTO.getName());
        if (existingSupplier.getAddress() != null) existingSupplier.setAddress(supplierDTO.getAddress());

        supplierRepository.save(existingSupplier);

        return Response.builder()
                .status(200)
                .message("Supplier updated successfully By name")
                .build();
    }

    @Override
    public Response getAllSuppliers() {

        List<Supplier> suppliers = supplierRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
        List<SupplierDTO> supplierDTOS = modelMapper.map(suppliers, new TypeToken<List<SupplierDTO>>() {}.getType());

        return Response.builder()
                .status(200)
                .message("success")
                .suppliers(supplierDTOS)
                .build();
    }

    @Override
    public Response getSupplierById(Long id) {
        Supplier supplier = supplierRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Supplier not found"));

        SupplierDTO supplierDTO = modelMapper.map(supplier, SupplierDTO.class);

        return Response.builder()
                .status(200)
                .message("success")
                .supplier(supplierDTO)
                .build();
    }

    @Override
    public Response deleteSupplier(Long id) {
        supplierRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Supplier not found"));

        supplierRepository.deleteById(id);

        return Response.builder()
                .status(200)
                .message("Supplier deleted successfully")
                .build();
    }
}
