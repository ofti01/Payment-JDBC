package com.payment.exceptions;

public class DBException extends RuntimeException {
    public DBException(String message) {
        super(message);
    }
}
