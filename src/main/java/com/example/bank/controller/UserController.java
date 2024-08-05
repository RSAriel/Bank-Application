package com.example.bank.controller;

import com.example.bank.dto.*;
import com.example.bank.service.impl.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Account Management API")

public class UserController {

    @Autowired
    UserService userService;

    @Operation(
            summary = "Create New User Account",
            description = "Creating new user account and assigning an account ID"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"
    )
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }


    @Operation(
            summary = "Balance Information",
            description = "Given an account number check how much the user has"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"
    )

    @GetMapping("/balanceEnquiry")
    public BankResponse BalanceEnquiry(@RequestBody EnquiryRequest request) {
        return userService.balanceEnquiry(request);
    }


    @Operation(
            summary = "Name Information",
            description = "Given an account number check the username"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"
    )

    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request) {
        return userService.nameEnquiry(request);
    }


    @Operation(
            summary = "Credit Operation",
            description = "Given and account number and a monetary value, adds it to the user balance"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 SUCCESS"
    )
    @PostMapping("/credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request) {
        return userService.creditAccount(request);
    }


    @Operation(
            summary = "Debit Operation",
            description = "Given and account number and a monetary value, subtract it from the user balance"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 SUCCESS"
    )
    @PostMapping("/debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request) {
        return userService.debitAccount(request);
    }


    @Operation(
            summary = "Transfer Operation",
            description = "Given source and destination account numbers, and a monetary value add it from the former to the latter"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 SUCCESS"
    )
    @PostMapping("/transfer")
    public BankResponse transfer(@RequestBody TransferRequest request) {
        return userService.transfer(request);
    }
}
