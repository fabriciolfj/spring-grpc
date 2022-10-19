package com.github.fabriciolfj.reviewservice.exceptions.enums;

import org.springframework.http.HttpStatus;

import java.util.ResourceBundle;

public enum Errors {

    REVIEW_NOT_FOUND,
    REVIEW_ERROR_SAVE;

    public String getMessage() {
        var resource = ResourceBundle.getBundle("messages/exceptions");
        return resource.getString(this.name() + ".message");
    }
}
