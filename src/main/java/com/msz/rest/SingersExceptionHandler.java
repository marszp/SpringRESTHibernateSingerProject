package com.msz.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//AOP - stuff for catch the exceptions of all type
@ControllerAdvice
public class SingersExceptionHandler {
    // Add an exception handler forSingerNoFoundException
    @ExceptionHandler
    public ResponseEntity<SingersErrorResponse> handleException(SingersNotFoundException exc){
        SingersErrorResponse error = new SingersErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
    // add anotherexception hanler ... to catch nay exception
    @ExceptionHandler
    public ResponseEntity<SingersErrorResponse> handleException(Exception exc){
        SingersErrorResponse error = new SingersErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
