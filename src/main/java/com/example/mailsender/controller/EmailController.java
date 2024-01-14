package com.example.mailsender.controller;

import com.example.mailsender.model.request.EmailRequest;
import com.example.mailsender.model.response.EmailResponse;
import com.example.mailsender.service.MailService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/mail")
public class EmailController {
    private final MailService mailService;

    @PostMapping("/send")
    public EmailResponse sendEmail(@Valid @RequestBody EmailRequest emailRequest) {
        return mailService.sendEmail(emailRequest);
    }

}
