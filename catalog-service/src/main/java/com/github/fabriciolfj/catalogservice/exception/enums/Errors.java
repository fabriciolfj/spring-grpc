package com.github.fabriciolfj.catalogservice.exception.enums;

import java.util.ResourceBundle;

public enum Errors {

    PRODUCT_INVALID,
    PRODUCT_SAVE_ERROR;

    public String getMessage() {
        var resource = ResourceBundle.getBundle("messages/exceptions");
        return resource.getString(this.name() + ".message");
    }
}
