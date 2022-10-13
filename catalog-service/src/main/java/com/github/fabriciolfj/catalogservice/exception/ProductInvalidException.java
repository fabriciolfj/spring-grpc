package com.github.fabriciolfj.catalogservice.exception;

import com.github.fabriciolfj.catalogservice.exception.enums.Errors;

public class ProductInvalidException extends RuntimeException {

    public ProductInvalidException() {
        super(Errors.PRODUCT_INVALID.getMessage());
    }
}
