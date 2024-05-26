package com.target2024.books.handler;

import com.target2024.books.dto.response.GenericErrorResponse;
import com.target2024.books.utils.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<GenericErrorResponse> generalExceptionHandler(Exception e) {
        GenericErrorResponse genericErrorResponse = new GenericErrorResponse();
        genericErrorResponse.setError(e.getMessage());
        genericErrorResponse.setMessage(Constants.UNCAUGHT_ERROR);
        genericErrorResponse.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(genericErrorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
