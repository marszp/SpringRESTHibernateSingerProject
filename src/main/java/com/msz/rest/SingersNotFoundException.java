package com.msz.rest;

public class SingersNotFoundException extends RuntimeException{

    public SingersNotFoundException() {
    }

    public SingersNotFoundException(String message) {
        super(message);
    }

    public SingersNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SingersNotFoundException(Throwable cause) {
        super(cause);
    }

    protected SingersNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
