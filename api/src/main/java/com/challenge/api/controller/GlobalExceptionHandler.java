package com.challenge.api.controller;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

/**
 * Global exception handler for REST controllers.
 * Handles ResponseStatusException and builds a structured JSON response
 * containing timestamp, status, error, message, and request path.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<Map<String, Object>> handleResponseStatusException(ResponseStatusException ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", Instant.now()); // Timestamp when the error occurred
        body.put("status", ex.getStatusCode().value()); // HTTP status code
        body.put("error", ((HttpStatus) ex.getStatusCode()).getReasonPhrase()); // HTTP reason phrase
        body.put("message", ex.getReason()); // Custom message from the exception
        body.put("path", ex.getStackTrace()[0].getMethodName()); // // Path of the HTTP request that triggered the error
        return new ResponseEntity<>(body, ex.getStatusCode());
    }
}
