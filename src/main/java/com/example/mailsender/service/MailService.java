package com.example.mailsender.service;

import com.example.mailsender.enumeration.StatusMessage;
import com.example.mailsender.model.request.EmailRequest;
import com.example.mailsender.model.response.EmailResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService {
    private final JavaMailSender javaMailSender;

    public EmailResponse sendEmail(EmailRequest emailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailRequest.getFrom());
        message.setTo(emailRequest.getTo());
        message.setSubject(emailRequest.getSubject());
        message.setText(emailRequest.getMessage());

        javaMailSender.send(message);
        return EmailResponse.builder()
                .result(StatusMessage.SUCCESS.getMessage())
                .build();
    }
}
