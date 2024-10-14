package com.example.rest_api_jpa.exception;

public class CloudVendorNotFoundException extends RuntimeException {

    public CloudVendorNotFoundException(String message) {
        super(message);
    }

    public CloudVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
