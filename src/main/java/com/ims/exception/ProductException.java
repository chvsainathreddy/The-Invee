package com.ims.exception;

import java.io.Serial;

public class ProductException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    public ProductException(String message) {
        super(message);
    }
}
