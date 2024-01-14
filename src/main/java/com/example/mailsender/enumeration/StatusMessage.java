package com.example.mailsender.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum StatusMessage {
    SUCCESS("success");

    private final String message;
}
