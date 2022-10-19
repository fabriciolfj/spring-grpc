package com.github.fabriciolfj.catalogservice.exception;

import com.github.fabriciolfj.catalogservice.exception.enums.Errors;

public class ProductSaveException extends RuntimeException {

    public ProductSaveException() {
        super(Errors.PRODUCT_SAVE_ERROR.getMessage());
    }
}
