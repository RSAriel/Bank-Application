package com.example.bank.service.impl;

import com.example.bank.dto.BankResponse;
import com.example.bank.dto.CreditDebitRequest;
import com.example.bank.dto.EnquiryRequest;
import com.example.bank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}
