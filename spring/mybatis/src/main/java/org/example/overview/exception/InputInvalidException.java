package org.example.overview.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InputInvalidException extends RuntimeException {
    public InputInvalidException() {
        super();
    }

    public InputInvalidException(String message) {
        super(message);
    }
}