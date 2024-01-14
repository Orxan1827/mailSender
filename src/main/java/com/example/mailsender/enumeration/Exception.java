package com.example.mailsender.enumeration;

import lombok.Getter;

@Getter
public enum Exception {

    UNEXPECTED_EXCEPTION_MESSAGE("UNEXPECTED_EXCEPTION_MESSAGE");

    private String message;

    Exception(String message) {
        this.message = message;
    }
}
