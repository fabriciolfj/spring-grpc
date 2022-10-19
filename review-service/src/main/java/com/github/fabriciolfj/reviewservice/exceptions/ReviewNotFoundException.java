package com.github.fabriciolfj.reviewservice.exceptions;

import com.github.fabriciolfj.reviewservice.exceptions.enums.Errors;
import org.springframework.http.HttpStatus;

public class ReviewNotFoundException extends RuntimeException {

    private int httpStatus;

    public ReviewNotFoundException() {
        super(Errors.REVIEW_NOT_FOUND.getMessage());
        httpStatus = HttpStatus.NOT_FOUND.value();
    }

    public int getHttpStatus() {
        return httpStatus;
    }
}
