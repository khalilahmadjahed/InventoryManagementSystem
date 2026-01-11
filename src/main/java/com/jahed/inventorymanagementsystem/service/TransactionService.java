package com.jahed.inventorymanagementsystem.service;

import com.jahed.inventorymanagementsystem.dto.Response;
import com.jahed.inventorymanagementsystem.dto.TransactionRequest;
import com.jahed.inventorymanagementsystem.enums.TransactionStatus;

public interface TransactionService {
    Response restockInventory(TransactionRequest transactionRequest);
    Response sell(TransactionRequest transactionRequest);
    Response returnToSupplier(TransactionRequest transactionRequest);
    Response getAllTransactions(int page, int size, String searchText);
    Response getTransactionById(Long id);
    Response getTransactionByMonthAndYear(int month, int year);
    Response updateTransactionStatus(Long transactionId, TransactionStatus transactionStatus);
}
