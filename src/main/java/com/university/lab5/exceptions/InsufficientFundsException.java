package com.university.lab5.exceptions;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String errorMessage) {
        super(errorMessage);
    }

    public InsufficientFundsException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
