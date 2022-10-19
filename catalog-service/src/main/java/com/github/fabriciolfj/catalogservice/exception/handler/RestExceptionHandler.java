package com.github.fabriciolfj.catalogservice.exception.handler;

import com.github.fabriciolfj.catalogservice.exception.ProductSaveException;
import com.github.fabriciolfj.catalogservice.exception.dto.ErrorMessage;
import com.google.api.Http;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ProductSaveException.class)
    public ResponseEntity<ErrorMessage> handlerProductSaveException(final ProductSaveException exception) {
        var message = ErrorMessage.builder()
                .messsage(exception.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .build();

        return ResponseEntity.badRequest().body(message);
    }
}
