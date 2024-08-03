package com.example.bank.service.impl;

import com.example.bank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
