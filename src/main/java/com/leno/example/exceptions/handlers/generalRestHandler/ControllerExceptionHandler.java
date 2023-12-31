package com.leno.example.exceptions.handlers.generalRestHandler;


import com.leno.example.exceptions.validationExceptions.ObjectNotValidException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    /**
     * This method will catch all ObjectNotValidException that were thrown from @Before method in aop
     * @param exception
     * @return
     */
    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<?> handleException(ObjectNotValidException exception){
        return ResponseEntity.badRequest().body(exception.toString());
    }
}
