package com.example.mailsender.model.request;

import com.example.mailsender.constant.Constant;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailRequest {

    @NotBlank(message = "From field must not be empty")
    @Email(message = "email is not in given pattern", regexp = Constant.EMAIL_PATTERN)
    private String from;

    @Email(message = "email is not in given pattern")
    @NotBlank(message = "To field must not be empty")
    private String to;

    @NotBlank(message = "Subject field must not be empty")
    private String subject;

    @NotBlank(message = "Message field must not be empty")
    private String message;
}
