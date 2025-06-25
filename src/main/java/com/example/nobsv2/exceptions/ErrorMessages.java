package com.example.nobsv2.exceptions;

public enum ErrorMessages {
    PRODUCT_NOT_FOUND("Product not found"),
    PRODUCT_ALREADY_EXISTS("Product already exists"),
    INVALID_PRODUCT_ID("Invalid product ID"),
    PRODUCT_CREATION_FAILED("Failed to create product"),
    PRODUCT_UPDATE_FAILED("Failed to update product"),
    PRODUCT_DELETION_FAILED("Failed to delete product"),
    NAME_REQUIRED("Product name is required"),
    DESCRIPTION_LENGTH("Product description must be at least 20 characters"),
    PRICE_INVALID("Product price must be greater than zero"),;



    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
