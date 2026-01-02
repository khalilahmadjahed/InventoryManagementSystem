package com.jahed.inventorymanagementsystem.service;

import com.jahed.inventorymanagementsystem.dto.LoginRequest;
import com.jahed.inventorymanagementsystem.dto.RegisterRequest;
import com.jahed.inventorymanagementsystem.dto.Response;
import com.jahed.inventorymanagementsystem.dto.UserDTO;
import com.jahed.inventorymanagementsystem.entity.User;

public interface UserService {

    Response registerUser(RegisterRequest registerRequest);
    Response loginUser(LoginRequest registerRequest);
    Response getAllUsers();
    User getCurrentLogedInUser();
    Response updateUser(Long id, UserDTO userDTO);
    Response deleteUser(Long id);
    Response getUserTransactions(Long id);
}
