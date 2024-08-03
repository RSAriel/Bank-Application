package com.example.bank.service.impl;

import com.example.bank.dto.BankResponse;
import com.example.bank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

}
