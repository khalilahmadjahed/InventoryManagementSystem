package com.jahed.inventorymanagementsystem.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException (String message){
        super(message);
    }
}
