package com.example.bank.service.impl;

import com.example.bank.dto.TransactionDto;
import com.example.bank.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
