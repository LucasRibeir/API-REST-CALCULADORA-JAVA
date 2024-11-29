package br.com.lucas.api_rest_spring_react.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MathOperationsException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public MathOperationsException(String ex) {
        super(ex);
    }
}
