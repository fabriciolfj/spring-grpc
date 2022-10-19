package com.github.fabriciolfj.reviewservice.exceptions;

import com.github.fabriciolfj.reviewservice.exceptions.enums.Errors;

public class ReviewSaveException extends RuntimeException {

    public ReviewSaveException() {
        super(Errors.REVIEW_ERROR_SAVE.getMessage());
    }
}
